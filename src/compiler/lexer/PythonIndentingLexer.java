package compiler.lexer;

import compiler.parser.PythonSubsetLexer;
import compiler.parser.PythonSubsetParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PythonIndentingLexer extends PythonSubsetLexer {

    private final Stack<Integer> indentStack = new Stack<>();
    private final Queue<Token> tokenQueue = new LinkedList<>();

    private static final int INDENT_TYPE = PythonSubsetParser.INDENT;
    private static final int DEDENT_TYPE = PythonSubsetParser.DEDENT;

    public PythonIndentingLexer(CharStream input) {
        super(input);
        indentStack.push(0); // base indentation level
    }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) return tokenQueue.poll();

        Token token = super.nextToken();

        if (token.getType() == PythonSubsetLexer.EOF) {
            emitDedentsToBase(token);
            if (!tokenQueue.isEmpty()) return tokenQueue.poll();
            return token;
        }

        if (token.getType() == PythonSubsetLexer.NEWLINE) {
            handleNewline(token);
        }

        if (!tokenQueue.isEmpty()) return tokenQueue.poll();
        return token;
    }

    private void handleNewline(Token newlineToken) {
        int start = getCharIndex();
        int indent = 0;

        while (true) {
            int la = _input.LA(1);
            if (la == ' ') { indent++; _input.consume(); }
            else if (la == '\t') { indent += 4; _input.consume(); }
            else if (la == '\r' || la == '\n') { _input.consume(); }
            else break;
        }
        _input.seek(start);

        int current = indentStack.peek();

        if (indent > current) {
            indentStack.push(indent);
            tokenQueue.add(createSyntheticToken(INDENT_TYPE, newlineToken));
        } else if (indent < current) {
            while (indentStack.peek() > indent && indentStack.size() > 1) {
                indentStack.pop();
                tokenQueue.add(createSyntheticToken(DEDENT_TYPE, newlineToken));
            }
        }
    }

    private void emitDedentsToBase(Token eofToken) {
        while (indentStack.size() > 1) {
            indentStack.pop();
            tokenQueue.add(createSyntheticToken(DEDENT_TYPE, eofToken));
        }
    }

    private Token createSyntheticToken(int type, Token original) {
        CommonToken token = new CommonToken(new Pair<>(_tokenFactorySourcePair.a, _input),
                type, DEFAULT_TOKEN_CHANNEL, original.getStartIndex(), original.getStopIndex());
        token.setLine(original.getLine());
        token.setCharPositionInLine(original.getCharPositionInLine());
        token.setText("<synthetic:" + getVocabulary().getSymbolicName(type) + ">");
        return token;
    }
}
