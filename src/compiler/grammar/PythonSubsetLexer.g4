lexer grammar PythonSubsetLexer;


@header {
    package compiler.parser;
}

// Keywords
DEF: 'def';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
RETURN: 'return';
IMPORT: 'import';
FROM: 'from';
AS: 'as';
GLOBAL: 'global';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';

// Operators
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
DOUBLESTAR: '**';
DOUBLESLASH: '//';

EQUAL: '=';
PLUSEQUAL: '+=';
MINUSEQUAL: '-=';

EQEQUAL: '==';
NOTEQUAL: '!=';
LESS: '<';
GREATER: '>';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';

// Delimiters
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
DOT: '.';
ARROW: '->';

// String literals
STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

// Numbers
NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

// Identifiers
NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Decorator
DECORATOR: '@' NAME;

// Whitespace and newlines
NEWLINE: ('\r'? '\n' | '\r') -> channel(HIDDEN);
WS: [ \t]+ -> skip;

// Comments
COMMENT: '#' ~[\r\n]* -> skip;

// Indentation (handled by PythonIndentingLexer wrapper)
INDENT: '<<<INDENT>>>' -> channel(HIDDEN);
DEDENT: '<<<DEDENT>>>' -> channel(HIDDEN);