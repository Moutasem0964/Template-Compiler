lexer grammar TemplateLexer;



@header {
    package compiler.parser;
}

// Jinja2 control structures
JINJA_BLOCK_START: '{%' -> pushMode(JINJA_MODE);
JINJA_VAR_START: '{{' -> pushMode(JINJA_MODE);
JINJA_COMMENT_START: '{#' -> pushMode(COMMENT_MODE);

// HTML Comments
HTML_COMMENT: '<!--' .*? '-->';

// HTML Tags
HTML_OPEN: '<' [a-zA-Z][a-zA-Z0-9]* -> pushMode(TAG_MODE);
HTML_CLOSE: '</' [a-zA-Z][a-zA-Z0-9]* '>';
DOCTYPE: '<!DOCTYPE' .*? '>';

// Text content (anything that's not a tag or Jinja expression)
HTML_TEXT: ~[<{]+;

// Whitespace
HTML_WS: [ \t\r\n]+ -> channel(HIDDEN);

// === JINJA MODE ===
mode JINJA_MODE;

JINJA_BLOCK_END: '%}' -> popMode;
JINJA_VAR_END: '}}' -> popMode;

// Jinja keywords
FOR: 'for';
IN: 'in';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
ENDIF: 'endif';
ENDFOR: 'endfor';

// Operators
DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COMMA: ',';
EQUAL: '=';
PIPE: '|';

// String literals in Jinja
JINJA_STRING
    : '"' (~["\r\n] | '\\"')* '"'
    | '\'' (~['\r\n] | '\\\'')* '\''
    ;

// Numbers in Jinja
JINJA_NUMBER: [0-9]+ ('.' [0-9]+)?;

// Identifiers in Jinja
JINJA_NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace in Jinja
JINJA_WS: [ \t\r\n]+ -> skip;

// === TAG MODE (for HTML attributes) ===
mode TAG_MODE;

TAG_CLOSE: '>' -> popMode;
TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_EQUALS: '=';
TAG_NAME: [a-zA-Z][a-zA-Z0-9_-]*;

TAG_VALUE
    : '"' (~["])* '"'
    | '\'' (~['])* '\''
    ;

// Jinja expressions in attributes
TAG_JINJA_VAR_START: '{{' -> pushMode(JINJA_MODE);

TAG_WS: [ \t\r\n]+ -> skip;

// === COMMENT MODE ===
mode COMMENT_MODE;

JINJA_COMMENT_END: '#}' -> popMode;
JINJA_COMMENT_TEXT: .+?;