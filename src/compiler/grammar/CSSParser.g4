parser grammar CSSParser;


@header {
    package compiler.parser;
}

options {
    tokenVocab = CSSLexer;
}

// Root rule - a CSS stylesheet
stylesheet: rule* EOF;

// CSS rule: selector { declarations }
rule
    : selector_group LBRACE declaration* RBRACE    #StyleRule
    | AT_IMPORT STRING SEMICOLON                   #ImportRule
    | AT_MEDIA media_query LBRACE rule* RBRACE    #MediaRule
    ;

// Selector groups: selector, selector, ...
selector_group: selector (COMMA selector)*;

// Selector: element, .class, #id, etc.
selector
    : selector combinator simple_selector    #CombinedSelector
    | simple_selector                         #SimpleSelectorRule
    ;

combinator
    : WS?                           #DescendantCombinator
    | GT                            #ChildCombinator
    | PLUS                          #AdjacentSiblingCombinator
    | TILDE                         #GeneralSiblingCombinator
    ;

simple_selector
    : IDENT selector_modifier*                 #ElementSelector
    | selector_modifier+                       #ModifierOnlySelector
    | STAR                                     #UniversalSelector
    ;

selector_modifier
    : CLASS                                    #ClassModifier
    | HASH                                     #IdModifier
    | PSEUDO                                   #PseudoModifier
    | LBRACK attribute_selector RBRACK        #AttributeModifier
    ;

attribute_selector: IDENT (COLON IDENT)?;

media_query: IDENT (COLON IDENT)?;

// CSS declaration: property: value;
declaration
    : IDENT COLON value IMPORTANT? SEMICOLON    #PropertyDeclaration
    | IDENT COLON value IMPORTANT?              #PropertyDeclarationNoSemicolon
    ;

// CSS values
value: value_item+;

value_item
    : NUMBER UNIT?           #NumberValue
    | COLOR_HEX              #ColorValue
    | STRING                 #StringValue
    | IDENT                  #IdentValue
    | URL                    #UrlValue
    | COMMA                  #CommaValue
    ;