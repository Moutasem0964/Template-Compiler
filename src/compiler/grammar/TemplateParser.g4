parser grammar TemplateParser;


@header {
    package compiler.parser;
}


options {
    tokenVocab = TemplateLexer;
}

// A template file contains mixed content
template: content* EOF;

// Content can be text, HTML, or Jinja constructs
content
    : html_element      #HtmlContent
    | text_content      #TextContent
    | jinja_variable    #JinjaVariableContent
    | jinja_for         #JinjaForContent
    | jinja_if          #JinjaIfContent
    | jinja_comment     #JinjaCommentContent
    | DOCTYPE           #DoctypeContent
    ;

// HTML Elements
html_element
    : HTML_OPEN attribute* TAG_CLOSE content* HTML_CLOSE     #NormalElement
    | HTML_OPEN attribute* TAG_SLASH_CLOSE                   #SelfClosingElement
    ;

attribute
    : TAG_NAME TAG_EQUALS TAG_VALUE                          #StaticAttribute
    | TAG_NAME TAG_EQUALS TAG_JINJA_VAR_START jinja_expr JINJA_VAR_END  #DynamicAttribute
    ;

// Plain text
text_content: HTML_TEXT;

// Jinja variable interpolation: {{ expr }}
jinja_variable
    : JINJA_VAR_START jinja_expr (PIPE JINJA_NAME (LPAREN jinja_args? RPAREN)?)* JINJA_VAR_END
    ;

// Jinja for loop: {% for item in items %} ... {% endfor %}
jinja_for
    : JINJA_BLOCK_START FOR JINJA_NAME IN jinja_expr JINJA_BLOCK_END
      content*
      JINJA_BLOCK_START ENDFOR JINJA_BLOCK_END
    ;

// Jinja if statement: {% if condition %} ... {% elif %} ... {% else %} ... {% endif %}
jinja_if
    : JINJA_BLOCK_START IF jinja_expr JINJA_BLOCK_END content*
      (JINJA_BLOCK_START ELIF jinja_expr JINJA_BLOCK_END content*)*
      (JINJA_BLOCK_START ELSE JINJA_BLOCK_END content*)?
      JINJA_BLOCK_START ENDIF JINJA_BLOCK_END
    ;

// Jinja comment: {# comment #}
jinja_comment
    : JINJA_COMMENT_START JINJA_COMMENT_TEXT? JINJA_COMMENT_END
    ;

// Jinja expressions (simplified for your use case)
jinja_expr
    : jinja_expr DOT JINJA_NAME                              #JinjaAttributeAccess
    | jinja_expr LBRACK jinja_expr RBRACK                    #JinjaSubscript
    | JINJA_NAME LPAREN jinja_args? RPAREN                   #JinjaFunctionCall
    | JINJA_NAME                                             #JinjaName
    | JINJA_STRING                                           #JinjaString
    | JINJA_NUMBER                                           #JinjaNumber
    | LPAREN jinja_expr RPAREN                               #JinjaParenExpr
    ;

// Function arguments
jinja_args: jinja_arg (COMMA jinja_arg)*;

jinja_arg
    : JINJA_NAME EQUAL jinja_expr    #JinjaKeywordArg
    | jinja_expr                      #JinjaPositionalArg
    ;