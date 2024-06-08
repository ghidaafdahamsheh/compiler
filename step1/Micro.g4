// Define a grammar called Micro
grammar Micro;
KEYWORD:'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'RETURN'|'READ'|'WRITE'|'IF'|'ELSE'|'ENDIF'|'FOR'|'ENDFOR'|'INT'|'VOID'|'STRING'|'FLOAT';
OPERATOR: ':='|'+'|'-'|'*'|'/'|'='|'!='|'<'|'>'|'<='|'>='|';'|','|'('|')';
IDENTIFIER: [a-zA-Z]+[0-9]*; 
INTLITERAL: [0-9]+; 
FLOATLITERAL:[0-9]*[.][0-9]+;
STRINGLITERAL: '"' ~('"')*'"';
COMMENT:'--' ~('\n')* '\n' -> skip;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines