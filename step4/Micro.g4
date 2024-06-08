// ghidaa falah aldahamsheh 0199959
// Define a grammar called Micro
grammar Micro;
KEYWORD:'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'RETURN'|'READ'|'WRITE'|'IF'|'ELSE'|'ENDIF'|'FOR'|'ENDFOR'|'INT'|'VOID'|'STRING'|'FLOAT';
OPERATOR: ':='|'+'|'-'|'*'|'/'|'='|'!='|'<'|'>'|'<='|'>='|';'|','|'('|')';
IDENTIFIER: [a-zA-Z]+[0-9]*; 
INTLITERAL: [0-9]+; 
FLOATLITERAL:[0-9]*'.'[0-9]+;
STRINGLITERAL: '"' ~('"')*'"';
COMMENT:'--' ~('\n')* '\n' -> skip;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines

program : 'PROGRAM' id 'BEGIN' pgm_body 'END';
id : IDENTIFIER; 
pgm_body : decl func_declarations;
decl : string_decl decl                                  #declstring
     | var_decl decl					 #declVAr
     | #epsilon;       
          				 
string_decl : 'STRING'	id ':='str ';' ; 
str : STRINGLITERAL ; 

var_decl : var_type id_list ';';                             				 
var_type : 'FLOAT' #FloatType
           |'INT' #IntType;           
id_list : id id_tail;                                         				 
id_tail : ',' id id_tail   #idtail
	|#epsilon11;     

                              				 
any_type : var_type | 'VOID';
param_decl_list : param_decl param_decl_tail  # functionparamlist
	        | #epsilon2 ;            				 
param_decl : var_type id;                               
param_decl_tail : ',' param_decl param_decl_tail   #paramdecltail	
		|#ecpsilon12;    
      				 
func_declarations : func_decl func_declarations  # functionMultiScope
		  | #epsilon3;   
        				      
func_decl :'FUNCTION' any_type id '(' param_decl_list ')' 'BEGIN' func_body 'END';       
func_body :decl stmt_list ;                                 				 
stmt_list :stmt stmt_list 								 
	  |;                                                              
stmt :basic_stmt  #basicstmt 
     |if_stmt # IfStatmentScope
     |for_stmt # forstatmentScope
	;                       				 
basic_stmt : assign_stmt | read_stmt | write_stmt | return_stmt;
assign_stmt :assign_expr ';';                                                                              
assign_expr :id	':=' expr;
read_stmt : 'READ' '(' id_list ')'';';
write_stmt : 'WRITE' '('id_list')'';';
return_stmt :'RETURN' expr ';';
if_stmt:'IF''(' cond ')' decl stmt_list else_part 'ENDIF';                              
else_part : 'ELSE' decl stmt_list # elseSrtatmentScope
		 |#epsilon4 ;                                                   
cond :expr compare expr;
compare :'='|'!='|'<='|'>='|'<'|'>';
for_stmt : 'FOR' '(' init_expr ';' cond ';' incr_expr ')' decl stmt_list 'ENDFOR';	
init_expr :assign_expr |;     	                                                       
incr_expr :assign_expr |;

expr :expr_prefix term;
expr_prefix : expr_prefix term addop #expr_prefixs
	     |#e1;		
term :factor_prefix factor;
factor_prefix : factor_prefix factor mulop #factor_prefixs
              |#e2;		
factor : primary | call_expr;
primary : '(' expr ')' #brackets
	| id #variableID 
	| INTLITERAL #INTvalue 
	| FLOATLITERAL #FLOATvalue;  	                             
call_expr : id '(' expr_list ')';
expr_list : expr expr_list_tail |;
expr_list_tail : ',' expr expr_list_tail 
		|;
addop : '+'  | '-' ;
mulop : '*' | '/';








