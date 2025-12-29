package compiler.lexer;

import compiler.parser.PythonSubsetLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PythonIndentingLexer extends Lexer {

    private final PythonSubsetLexer lexer;
    private final Stack<Integer> indentStack = new Stack<>();
    private final Queue<Token> tokenQueue = new LinkedList<>();
    private Token lastToken = null;
    private boolean atLineStart = true;

    public PythonIndentingLexer(CharStream input) {
        super(input);
        this.lexer = new PythonSubsetLexer(input);
        indentStack.push(0);
    }

    @Override
    public Token nextToken() {
        // Return queued tokens first
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        // Get next token from underlying lexer
        Token token = lexer.nextToken();

        // Handle EOF - emit all remaining DEDENTs
        if (token.getType() == Token.EOF) {
            // Emit NEWLINE before DEDENTs if last token wasn't NEWLINE
            if (lastToken != null && lastToken.getType() != PythonSubsetLexer.NEWLINE) {
                tokenQueue.add(createToken(PythonSubsetLexer.NEWLINE, "\n", token));
            }

            while (indentStack.size() > 1) {
                indentStack.pop();
                tokenQueue.add(createToken(PythonSubsetLexer.DEDENT, "<DEDENT>", token));
            }

            if (!tokenQueue.isEmpty()) {
                tokenQueue.add(token);
                return tokenQueue.poll();
            }
            return token;
        }

        // Handle NEWLINE - check indentation on next line
        if (token.getType() == PythonSubsetLexer.NEWLINE) {
            atLineStart = true;
            lastToken = token;
            return token;
        }

        // Skip hidden channel tokens for indent calculation
        if (token.getChannel() == Lexer.HIDDEN) {
            lastToken = token;
            return token;
        }

        // Handle indentation at start of line
        if (atLineStart && token.getType() != PythonSubsetLexer.NEWLINE) {
            atLineStart = false;

            int indent = token.getCharPositionInLine();
            int currentIndent = indentStack.peek();

            if (indent > currentIndent) {
                // INDENT
                indentStack.push(indent);
                tokenQueue.add(createToken(PythonSubsetLexer.INDENT, "<INDENT>", token));
                tokenQueue.add(token);
                return tokenQueue.poll();
            } else if (indent < currentIndent) {
                // DEDENT (possibly multiple)
                while (!indentStack.isEmpty() && indentStack.peek() > indent) {
                    indentStack.pop();
                    tokenQueue.add(createToken(PythonSubsetLexer.DEDENT, "<DEDENT>", token));
                }

                tokenQueue.add(token);
                return tokenQueue.poll();
            }
        }

        lastToken = token;
        return token;
    }

    private Token createToken(int type, String text, Token original) {
        CommonToken t = new CommonToken(
                new Pair<>(lexer, lexer.getInputStream()),
                type,
                Lexer.DEFAULT_TOKEN_CHANNEL,
                original.getStartIndex(),
                original.getStopIndex()
        );
        t.setLine(original.getLine());
        t.setCharPositionInLine(original.getCharPositionInLine());
        t.setText(text);
        return t;
    }

    @Override
    public String getGrammarFileName() {
        return lexer.getGrammarFileName();
    }

    @Override
    public String[] getRuleNames() {
        return lexer.getRuleNames();
    }

    @Override
    public String getSerializedATN() {
        return lexer.getSerializedATN();
    }

    @Override
    public String[] getChannelNames() {
        return lexer.getChannelNames();
    }

    @Override
    public String[] getModeNames() {
        return lexer.getModeNames();
    }

    @Override
    public Vocabulary getVocabulary() {
        return lexer.getVocabulary();
    }

    @Override
    public ATN getATN() {
        return lexer.getATN();
    }
}