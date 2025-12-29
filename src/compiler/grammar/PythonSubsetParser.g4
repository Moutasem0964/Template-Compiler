parser grammar PythonSubsetParser;


@header {
    package compiler.parser;
}

options {
    tokenVocab = PythonSubsetLexer;
}

// Program - skip empty lines
file_input: (NEWLINE | stmt)* EOF;

// Statements
stmt
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : expr_stmt
    | assign_stmt
    | return_stmt
    | global_stmt
    | import_stmt
    | from_import_stmt
    ;

compound_stmt
    : function_def
    | if_stmt
    | for_stmt
    ;

// Import
import_stmt: IMPORT dotted_name (AS NAME)?;
from_import_stmt: FROM dotted_name IMPORT (STAR | import_as_names);
import_as_names: import_as_name (COMMA import_as_name)*;
import_as_name: NAME (AS NAME)?;
dotted_name: NAME (DOT NAME)*;

// Function definition - decorators can have any arguments
function_def
    : decorator* DEF NAME LPAREN parameters? RPAREN COLON suite
    ;

decorator
    : DECORATOR arguments? NEWLINE
    ;

parameters: parameter (COMMA parameter)*;
parameter: NAME (EQUAL test)?;

suite
    : simple_stmt
    | NEWLINE INDENT stmt+ DEDENT
    ;

// Control flow
if_stmt
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?
    ;

for_stmt
    : FOR NAME IN test COLON suite
    ;

// Assignment
assign_stmt: NAME EQUAL test;

global_stmt: GLOBAL NAME (COMMA NAME)*;

return_stmt: RETURN test?;

expr_stmt: test;

// Test expression (most general)
test: or_test;

or_test: and_test (OR and_test)*;

and_test: not_test (AND not_test)*;

not_test: NOT not_test | comparison;

comparison: expr (comp_op expr)*;

comp_op: LESS | GREATER | EQEQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL | IN;

// Expressions with precedence
expr: term ((PLUS | MINUS) term)*;

term: factor ((STAR | SLASH | PERCENT | DOUBLESLASH) factor)*;

factor: (PLUS | MINUS) factor | power;

power: atom_expr (DOUBLESTAR factor)?;

atom_expr
    : atom trailer*
    ;

trailer
    : LPAREN arguments? RPAREN    #CallTrailer
    | LBRACK test RBRACK           #IndexTrailer
    | DOT NAME                     #AttrTrailer
    ;

atom
    : LPAREN test? RPAREN                          #ParenAtom
    | LBRACK testlist? RBRACK                      #ListAtom
    | LBRACE dictorsetmaker? RBRACE                #DictAtom
    | NAME                                          #NameAtom
    | NUMBER                                        #NumberAtom
    | STRING+                                       #StringAtom
    | TRUE                                          #TrueAtom
    | FALSE                                         #FalseAtom
    | NONE                                          #NoneAtom
    ;

testlist: test (COMMA test)*;

// Dictionary and list comprehensions
dictorsetmaker
    : (test COLON test | test) (comp_for | (COMMA (test COLON test | test))*)
    ;

comp_for: FOR NAME IN test (IF test)?;

// Function arguments
arguments: argument (COMMA argument)*;

argument
    : NAME EQUAL test    #KeywordArgument
    | test               #PositionalArgument
    ;