parser grammar PythonSubsetParser;

@header {
    package compiler.parser;
}
options {
    tokenVocab = PythonSubsetLexer;
}

// Program is a list of statements
file_input: (NEWLINE | stmt)* EOF;

// Statements
stmt
    : import_stmt       #ImportStatement
    | from_import_stmt  #FromImportStatement
    | function_def      #FunctionDefinition
    | if_stmt           #IfStatement
    | for_stmt          #ForStatement
    | assign_stmt       #AssignStatement
    | expr_stmt         #ExpressionStatement
    | global_stmt       #GlobalStatement
    | return_stmt       #ReturnStatement
    ;

// Import statements
import_stmt: IMPORT NAME (AS NAME)? NEWLINE;

from_import_stmt: FROM NAME IMPORT NAME (COMMA NAME)* (AS NAME)? NEWLINE;

// Function definition
function_def
    : decorator* DEF NAME LPAREN parameters? RPAREN COLON suite
    ;

decorator: DECORATOR (LPAREN arguments? RPAREN)? NEWLINE;

parameters: parameter (COMMA parameter)*;

parameter: NAME (EQUAL expr)?;

suite: simple_stmt | NEWLINE INDENT stmt+ DEDENT;

simple_stmt: small_stmt NEWLINE;

small_stmt: expr_stmt | return_stmt | assign_stmt | global_stmt;

// Control flow
if_stmt
    : IF expr COLON suite (ELIF expr COLON suite)* (ELSE COLON suite)?
    ;

for_stmt
    : FOR NAME IN expr COLON suite
    ;

// Assignment
assign_stmt: NAME EQUAL expr;

global_stmt: GLOBAL NAME (COMMA NAME)*;

return_stmt: RETURN expr?;

expr_stmt: expr;

// Expressions
expr
    : expr DOT NAME                                                #AttributeAccess
    | expr LPAREN arguments? RPAREN                                #FunctionCall
    | expr LBRACK expr RBRACK                                      #Subscript
    | MINUS expr                                                   #UnaryMinus
    | expr op=(STAR|SLASH|PERCENT|DOUBLESLASH|DOUBLESTAR) expr   #MulDivOp
    | expr op=(PLUS|MINUS) expr                                    #AddSubOp
    | expr op=(EQEQUAL|NOTEQUAL|LESS|GREATER|LESSEQUAL|GREATEREQUAL) expr #Comparison
    | NAME                                                         #NameExpression
    | NUMBER                                                       #NumberLiteral
    | STRING                                                       #StringLiteral
    | TRUE                                                         #TrueLiteral
    | FALSE                                                        #FalseLiteral
    | NONE                                                         #NoneLiteral
    | list_literal                                                 #ListExpression
    | dict_literal                                                 #DictExpression
    | list_comprehension                                           #ListComprehensionExpression
    | LPAREN expr RPAREN                                           #ParenExpression
    ;

// Arguments in function calls
arguments: argument (COMMA argument)*;

argument: NAME EQUAL expr | expr;

// List and dict literals
list_literal: LBRACK (expr (COMMA expr)*)? RBRACK;

dict_literal: LBRACE (dict_pair (COMMA dict_pair)*)? RBRACE;

dict_pair: (STRING | NAME) COLON expr;

// List comprehension: [expr for var in iterable if condition]
list_comprehension: LBRACK expr FOR NAME IN expr (IF expr)? RBRACK;