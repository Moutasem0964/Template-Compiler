lexer grammar CSSLexer;

@header {
    package compiler.parser;
}
// CSS specific tokens
AT_IMPORT: '@import';
AT_MEDIA: '@media';
AT_KEYFRAMES: '@keyframes';

// Selectors
HASH: '#' [a-zA-Z0-9_-]+;
CLASS: '.' [a-zA-Z][a-zA-Z0-9_-]*;
PSEUDO: ':' [a-zA-Z][a-zA-Z0-9_-]* ('(' [^)]* ')')?;

// Important
IMPORTANT: '!important';

// Structural
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
GT: '>';
PLUS: '+';
TILDE: '~';
STAR: '*';

// Values
STRING
    : '"' (~["\r\n] | '\\' .)* '"'
    | '\'' (~['\r\n] | '\\' .)* '\''
    ;

// Numbers with units
NUMBER: [0-9]+ ('.' [0-9]+)?;

UNIT
    : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'pt' | 'cm' | 'mm' | 'in'
    | 'pc' | 'ex' | 'ch' | 'vmin' | 'vmax' | 's' | 'ms' | 'deg' | 'rad'
    ;

// Colors
COLOR_HEX: '#' [0-9a-fA-F]+;

// Identifiers (property names, values, etc.)
IDENT: [a-zA-Z_-][a-zA-Z0-9_-]*;

// URLs
URL: 'url(' [ \t]* STRING [ \t]* ')';

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Comments
COMMENT: '/*' .*? '*/' -> skip;