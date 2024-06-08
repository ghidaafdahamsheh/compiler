// Generated from Micro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MicroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MicroParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MicroParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(MicroParser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declstring}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclstring(MicroParser.DeclstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declVAr}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVAr(MicroParser.DeclVArContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon(MicroParser.EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(MicroParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(MicroParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(MicroParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(MicroParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MicroParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(MicroParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idtail}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdtail(MicroParser.IdtailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon11}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon11(MicroParser.Epsilon11Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(MicroParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionparamlist}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionparamlist(MicroParser.FunctionparamlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon2}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon2(MicroParser.Epsilon2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(MicroParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramdecltail}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamdecltail(MicroParser.ParamdecltailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ecpsilon12}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcpsilon12(MicroParser.Ecpsilon12Context ctx);
	/**
	 * Visit a parse tree produced by the {@code functionMultiScope}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMultiScope(MicroParser.FunctionMultiScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon3}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon3(MicroParser.Epsilon3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(MicroParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(MicroParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(MicroParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicstmt}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicstmt(MicroParser.BasicstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatmentScope}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentScope(MicroParser.IfStatmentScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forstatmentScope}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatmentScope(MicroParser.ForstatmentScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_stmt(MicroParser.Basic_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(MicroParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(MicroParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(MicroParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(MicroParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseSrtatmentScope}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSrtatmentScope(MicroParser.ElseSrtatmentScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon4}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon4(MicroParser.Epsilon4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(MicroParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(MicroParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MicroParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_expr(MicroParser.Init_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr_expr(MicroParser.Incr_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MicroParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_prefixs}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefixs(MicroParser.Expr_prefixsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e1}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE1(MicroParser.E1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MicroParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_prefixs}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prefixs(MicroParser.Factor_prefixsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e2}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE2(MicroParser.E2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MicroParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(MicroParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableID}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableID(MicroParser.VariableIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTvalue}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTvalue(MicroParser.INTvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLOATvalue}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLOATvalue(MicroParser.FLOATvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(MicroParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(MicroParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tail(MicroParser.Expr_list_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MicroParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MicroParser.MulopContext ctx);
}