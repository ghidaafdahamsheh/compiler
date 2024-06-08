// Generated from Micro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		KEYWORD=32, OPERATOR=33, IDENTIFIER=34, INTLITERAL=35, FLOATLITERAL=36, 
		STRINGLITERAL=37, COMMENT=38, WS=39;
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl = 4, 
		RULE_str = 5, RULE_var_decl = 6, RULE_var_type = 7, RULE_id_list = 8, 
		RULE_id_tail = 9, RULE_any_type = 10, RULE_param_decl_list = 11, RULE_param_decl = 12, 
		RULE_param_decl_tail = 13, RULE_func_declarations = 14, RULE_func_decl = 15, 
		RULE_func_body = 16, RULE_stmt_list = 17, RULE_stmt = 18, RULE_basic_stmt = 19, 
		RULE_assign_stmt = 20, RULE_assign_expr = 21, RULE_read_stmt = 22, RULE_write_stmt = 23, 
		RULE_return_stmt = 24, RULE_if_stmt = 25, RULE_else_part = 26, RULE_cond = 27, 
		RULE_compare = 28, RULE_for_stmt = 29, RULE_init_expr = 30, RULE_incr_expr = 31, 
		RULE_expr = 32, RULE_expr_prefix = 33, RULE_term = 34, RULE_factor_prefix = 35, 
		RULE_factor = 36, RULE_primary = 37, RULE_call_expr = 38, RULE_expr_list = 39, 
		RULE_expr_list_tail = 40, RULE_addop = 41, RULE_mulop = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
			"var_type", "id_list", "id_tail", "any_type", "param_decl_list", "param_decl", 
			"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
			"stmt", "basic_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
			"return_stmt", "if_stmt", "else_part", "cond", "compare", "for_stmt", 
			"init_expr", "incr_expr", "expr", "expr_prefix", "term", "factor_prefix", 
			"factor", "primary", "call_expr", "expr_list", "expr_list_tail", "addop", 
			"mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
			"'INT'", "','", "'VOID'", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
			"'RETURN'", "'IF'", "'ENDIF'", "'ELSE'", "'='", "'!='", "'<='", "'>='", 
			"'<'", "'>'", "'FOR'", "'ENDFOR'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "KEYWORD", "OPERATOR", 
			"IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			id();
			setState(88);
			match(T__1);
			setState(89);
			pgm_body();
			setState(90);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPgm_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			decl();
			setState(95);
			func_declarations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EpsilonContext extends DeclContext {
		public EpsilonContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclstringContext extends DeclContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclstringContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitDeclstring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclVArContext extends DeclContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclVArContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitDeclVAr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new DeclstringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				string_decl();
				setState(98);
				decl();
				}
				break;
			case T__6:
			case T__7:
				_localctx = new DeclVArContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				var_decl();
				setState(101);
				decl();
				}
				break;
			case T__2:
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
			case IDENTIFIER:
				_localctx = new EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitString_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			id();
			setState(108);
			match(T__4);
			setState(109);
			str();
			setState(110);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			var_type();
			setState(115);
			id_list();
			setState(116);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	 
		public Var_typeContext() { }
		public void copyFrom(Var_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends Var_typeContext {
		public FloatTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends Var_typeContext {
		public IntTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_type);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			id();
			setState(123);
			id_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_tailContext extends ParserRuleContext {
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
	 
		public Id_tailContext() { }
		public void copyFrom(Id_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Epsilon11Context extends Id_tailContext {
		public Epsilon11Context(Id_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEpsilon11(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdtailContext extends Id_tailContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public IdtailContext(Id_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIdtail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id_tail);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new IdtailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__8);
				setState(126);
				id();
				setState(127);
				id_tail();
				}
				break;
			case T__5:
			case T__12:
				_localctx = new Epsilon11Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAny_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				var_type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
	 
		public Param_decl_listContext() { }
		public void copyFrom(Param_decl_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Epsilon2Context extends Param_decl_listContext {
		public Epsilon2Context(Param_decl_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEpsilon2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionparamlistContext extends Param_decl_listContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public FunctionparamlistContext(Param_decl_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunctionparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_decl_list);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				_localctx = new FunctionparamlistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				param_decl();
				setState(137);
				param_decl_tail();
				}
				break;
			case T__12:
				_localctx = new Epsilon2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			var_type();
			setState(143);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
	 
		public Param_decl_tailContext() { }
		public void copyFrom(Param_decl_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamdecltailContext extends Param_decl_tailContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public ParamdecltailContext(Param_decl_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitParamdecltail(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ecpsilon12Context extends Param_decl_tailContext {
		public Ecpsilon12Context(Param_decl_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEcpsilon12(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_tail);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ParamdecltailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__8);
				setState(146);
				param_decl();
				setState(147);
				param_decl_tail();
				}
				break;
			case T__12:
				_localctx = new Ecpsilon12Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
	 
		public Func_declarationsContext() { }
		public void copyFrom(Func_declarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Epsilon3Context extends Func_declarationsContext {
		public Epsilon3Context(Func_declarationsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEpsilon3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMultiScopeContext extends Func_declarationsContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public FunctionMultiScopeContext(Func_declarationsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunctionMultiScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_declarations);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new FunctionMultiScopeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				func_decl();
				setState(153);
				func_declarations();
				}
				break;
			case T__2:
				_localctx = new Epsilon3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declContext extends ParserRuleContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(159);
			any_type();
			setState(160);
			id();
			setState(161);
			match(T__11);
			setState(162);
			param_decl_list();
			setState(163);
			match(T__12);
			setState(164);
			match(T__1);
			setState(165);
			func_body();
			setState(166);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			decl();
			setState(169);
			stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__25:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				stmt();
				setState(172);
				stmt_list();
				}
				break;
			case T__2:
			case T__17:
			case T__18:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicstmtContext extends StmtContext {
		public Basic_stmtContext basic_stmt() {
			return getRuleContext(Basic_stmtContext.class,0);
		}
		public BasicstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitBasicstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstatmentScopeContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForstatmentScopeContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitForstatmentScope(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatmentScopeContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStatmentScopeContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIfStatmentScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case IDENTIFIER:
				_localctx = new BasicstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				basic_stmt();
				}
				break;
			case T__16:
				_localctx = new IfStatmentScopeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				if_stmt();
				}
				break;
			case T__25:
				_localctx = new ForstatmentScopeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				for_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Basic_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Basic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitBasic_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_stmtContext basic_stmt() throws RecognitionException {
		Basic_stmtContext _localctx = new Basic_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_basic_stmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				assign_stmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				read_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				write_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			assign_expr();
			setState(189);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			id();
			setState(192);
			match(T__4);
			setState(193);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__13);
			setState(196);
			match(T__11);
			setState(197);
			id_list();
			setState(198);
			match(T__12);
			setState(199);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__14);
			setState(202);
			match(T__11);
			setState(203);
			id_list();
			setState(204);
			match(T__12);
			setState(205);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__15);
			setState(208);
			expr();
			setState(209);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			setState(212);
			match(T__11);
			setState(213);
			cond();
			setState(214);
			match(T__12);
			setState(215);
			decl();
			setState(216);
			stmt_list();
			setState(217);
			else_part();
			setState(218);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_partContext extends ParserRuleContext {
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
	 
		public Else_partContext() { }
		public void copyFrom(Else_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Epsilon4Context extends Else_partContext {
		public Epsilon4Context(Else_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEpsilon4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseSrtatmentScopeContext extends Else_partContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public ElseSrtatmentScopeContext(Else_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitElseSrtatmentScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_part);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new ElseSrtatmentScopeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__18);
				setState(221);
				decl();
				setState(222);
				stmt_list();
				}
				break;
			case T__17:
				_localctx = new Epsilon4Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expr();
			setState(228);
			compare();
			setState(229);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public Init_exprContext init_expr() {
			return getRuleContext(Init_exprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Incr_exprContext incr_expr() {
			return getRuleContext(Incr_exprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__25);
			setState(234);
			match(T__11);
			setState(235);
			init_expr();
			setState(236);
			match(T__5);
			setState(237);
			cond();
			setState(238);
			match(T__5);
			setState(239);
			incr_expr();
			setState(240);
			match(T__12);
			setState(241);
			decl();
			setState(242);
			stmt_list();
			setState(243);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_exprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Init_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitInit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_exprContext init_expr() throws RecognitionException {
		Init_exprContext _localctx = new Init_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_init_expr);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				assign_expr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Incr_exprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Incr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIncr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_exprContext incr_expr() throws RecognitionException {
		Incr_exprContext _localctx = new Incr_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_incr_expr);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				assign_expr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expr_prefix(0);
			setState(254);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_prefixContext extends ParserRuleContext {
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
	 
		public Expr_prefixContext() { }
		public void copyFrom(Expr_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_prefixsContext extends Expr_prefixContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public Expr_prefixsContext(Expr_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr_prefixs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class E1Context extends Expr_prefixContext {
		public E1Context(Expr_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitE1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		return expr_prefix(0);
	}

	private Expr_prefixContext expr_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, _parentState);
		Expr_prefixContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_prefixsContext(new Expr_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_prefix);
					setState(257);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(258);
					term();
					setState(259);
					addop();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			factor_prefix(0);
			setState(267);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_prefixContext extends ParserRuleContext {
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prefix; }
	 
		public Factor_prefixContext() { }
		public void copyFrom(Factor_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Factor_prefixsContext extends Factor_prefixContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public Factor_prefixsContext(Factor_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFactor_prefixs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class E2Context extends Factor_prefixContext {
		public E2Context(Factor_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitE2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		return factor_prefix(0);
	}

	private Factor_prefixContext factor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, _parentState);
		Factor_prefixContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_factor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor_prefixsContext(new Factor_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_factor_prefix);
					setState(270);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(271);
					factor();
					setState(272);
					mulop();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				call_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableIDContext extends PrimaryContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VariableIDContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitVariableID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INTvalueContext extends PrimaryContext {
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }
		public INTvalueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitINTvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FLOATvalueContext extends PrimaryContext {
		public TerminalNode FLOATLITERAL() { return getToken(MicroParser.FLOATLITERAL, 0); }
		public FLOATvalueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFLOATvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends PrimaryContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new BracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__11);
				setState(284);
				expr();
				setState(285);
				match(T__12);
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				id();
				}
				break;
			case INTLITERAL:
				_localctx = new INTvalueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				_localctx = new FLOATvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(FLOATLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			id();
			setState(293);
			match(T__11);
			setState(294);
			expr_list();
			setState(295);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_list);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				expr();
				setState(298);
				expr_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_list_tailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr_list_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_list_tail);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__8);
				setState(304);
				expr();
				setState(305);
				expr_list_tail();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expr_prefix_sempred((Expr_prefixContext)_localctx, predIndex);
		case 35:
			return factor_prefix_sempred((Factor_prefixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_prefix_sempred(Expr_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_prefix_sempred(Factor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007y\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\n\u0001\n\u0003\n\u0087"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008d"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0097\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u009d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00b0\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00b5\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00bb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00e2\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u00f8\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u00fc"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0106\b!\n!\f!\u0109\t!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u0113\b#\n#\f#\u0116\t#\u0001$\u0001$\u0003$\u011a"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0123\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u012e\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0135\b(\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0000\u0002BF+\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRT\u0000\u0003\u0001\u0000\u0014\u0019\u0001\u0000\u001c\u001d\u0001"+
		"\u0000\u001e\u001f\u0128\u0000V\u0001\u0000\u0000\u0000\u0002\\\u0001"+
		"\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000"+
		"\u0000\bj\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000"+
		"\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000"+
		"\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u008e\u0001\u0000\u0000"+
		"\u0000\u001a\u0096\u0001\u0000\u0000\u0000\u001c\u009c\u0001\u0000\u0000"+
		"\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a8\u0001\u0000\u0000\u0000"+
		"\"\u00af\u0001\u0000\u0000\u0000$\u00b4\u0001\u0000\u0000\u0000&\u00ba"+
		"\u0001\u0000\u0000\u0000(\u00bc\u0001\u0000\u0000\u0000*\u00bf\u0001\u0000"+
		"\u0000\u0000,\u00c3\u0001\u0000\u0000\u0000.\u00c9\u0001\u0000\u0000\u0000"+
		"0\u00cf\u0001\u0000\u0000\u00002\u00d3\u0001\u0000\u0000\u00004\u00e1"+
		"\u0001\u0000\u0000\u00006\u00e3\u0001\u0000\u0000\u00008\u00e7\u0001\u0000"+
		"\u0000\u0000:\u00e9\u0001\u0000\u0000\u0000<\u00f7\u0001\u0000\u0000\u0000"+
		">\u00fb\u0001\u0000\u0000\u0000@\u00fd\u0001\u0000\u0000\u0000B\u0100"+
		"\u0001\u0000\u0000\u0000D\u010a\u0001\u0000\u0000\u0000F\u010d\u0001\u0000"+
		"\u0000\u0000H\u0119\u0001\u0000\u0000\u0000J\u0122\u0001\u0000\u0000\u0000"+
		"L\u0124\u0001\u0000\u0000\u0000N\u012d\u0001\u0000\u0000\u0000P\u0134"+
		"\u0001\u0000\u0000\u0000R\u0136\u0001\u0000\u0000\u0000T\u0138\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0003\u0002\u0001\u0000XY\u0005"+
		"\u0002\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005\u0003\u0000\u0000"+
		"[\u0001\u0001\u0000\u0000\u0000\\]\u0005\"\u0000\u0000]\u0003\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0006\u0003\u0000_`\u0003\u001c\u000e\u0000`\u0005"+
		"\u0001\u0000\u0000\u0000ab\u0003\b\u0004\u0000bc\u0003\u0006\u0003\u0000"+
		"ci\u0001\u0000\u0000\u0000de\u0003\f\u0006\u0000ef\u0003\u0006\u0003\u0000"+
		"fi\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000ha\u0001\u0000\u0000"+
		"\u0000hd\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0007\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0004\u0000\u0000kl\u0003\u0002\u0001\u0000"+
		"lm\u0005\u0005\u0000\u0000mn\u0003\n\u0005\u0000no\u0005\u0006\u0000\u0000"+
		"o\t\u0001\u0000\u0000\u0000pq\u0005%\u0000\u0000q\u000b\u0001\u0000\u0000"+
		"\u0000rs\u0003\u000e\u0007\u0000st\u0003\u0010\b\u0000tu\u0005\u0006\u0000"+
		"\u0000u\r\u0001\u0000\u0000\u0000vy\u0005\u0007\u0000\u0000wy\u0005\b"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u000f"+
		"\u0001\u0000\u0000\u0000z{\u0003\u0002\u0001\u0000{|\u0003\u0012\t\u0000"+
		"|\u0011\u0001\u0000\u0000\u0000}~\u0005\t\u0000\u0000~\u007f\u0003\u0002"+
		"\u0001\u0000\u007f\u0080\u0003\u0012\t\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0003\u000e\u0007\u0000\u0085\u0087\u0005\n\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u0018\f\u0000\u0089\u008a"+
		"\u0003\u001a\r\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		"\u000e\u0007\u0000\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0019\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\t\u0000\u0000\u0092\u0093\u0003\u0018"+
		"\f\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u001b\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0003\u001e\u000f\u0000\u0099\u009a\u0003\u001c\u000e"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000b\u0000"+
		"\u0000\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0003\u0002\u0001\u0000"+
		"\u00a1\u00a2\u0005\f\u0000\u0000\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3"+
		"\u00a4\u0005\r\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000\u00a5\u00a6"+
		"\u0003 \u0010\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u001f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9\u00aa\u0003"+
		"\"\u0011\u0000\u00aa!\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003$\u0012"+
		"\u0000\u00ac\u00ad\u0003\"\u0011\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0#\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b5\u0003&\u0013\u0000\u00b2\u00b5\u00032\u0019\u0000\u00b3\u00b5\u0003"+
		":\u001d\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5%\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bb\u0003(\u0014\u0000\u00b7\u00bb\u0003,\u0016\u0000\u00b8"+
		"\u00bb\u0003.\u0017\u0000\u00b9\u00bb\u00030\u0018\u0000\u00ba\u00b6\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\'\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0003*\u0015\u0000\u00bd\u00be\u0005\u0006\u0000"+
		"\u0000\u00be)\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u0002\u0001\u0000"+
		"\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0003@ \u0000\u00c2+"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4\u00c5"+
		"\u0005\f\u0000\u0000\u00c5\u00c6\u0003\u0010\b\u0000\u00c6\u00c7\u0005"+
		"\r\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8-\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u000f\u0000\u0000\u00ca\u00cb\u0005\f\u0000"+
		"\u0000\u00cb\u00cc\u0003\u0010\b\u0000\u00cc\u00cd\u0005\r\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce/\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d1\u0003@ \u0000\u00d1\u00d2\u0005"+
		"\u0006\u0000\u0000\u00d21\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0011"+
		"\u0000\u0000\u00d4\u00d5\u0005\f\u0000\u0000\u00d5\u00d6\u00036\u001b"+
		"\u0000\u00d6\u00d7\u0005\r\u0000\u0000\u00d7\u00d8\u0003\u0006\u0003\u0000"+
		"\u00d8\u00d9\u0003\"\u0011\u0000\u00d9\u00da\u00034\u001a\u0000\u00da"+
		"\u00db\u0005\u0012\u0000\u0000\u00db3\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0013\u0000\u0000\u00dd\u00de\u0003\u0006\u0003\u0000\u00de\u00df"+
		"\u0003\"\u0011\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e25\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003@ "+
		"\u0000\u00e4\u00e5\u00038\u001c\u0000\u00e5\u00e6\u0003@ \u0000\u00e6"+
		"7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0000\u0000\u0000\u00e89\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u001a\u0000\u0000\u00ea\u00eb\u0005"+
		"\f\u0000\u0000\u00eb\u00ec\u0003<\u001e\u0000\u00ec\u00ed\u0005\u0006"+
		"\u0000\u0000\u00ed\u00ee\u00036\u001b\u0000\u00ee\u00ef\u0005\u0006\u0000"+
		"\u0000\u00ef\u00f0\u0003>\u001f\u0000\u00f0\u00f1\u0005\r\u0000\u0000"+
		"\u00f1\u00f2\u0003\u0006\u0003\u0000\u00f2\u00f3\u0003\"\u0011\u0000\u00f3"+
		"\u00f4\u0005\u001b\u0000\u0000\u00f4;\u0001\u0000\u0000\u0000\u00f5\u00f8"+
		"\u0003*\u0015\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8=\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0003*\u0015\u0000\u00fa\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc?\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003B!\u0000\u00fe"+
		"\u00ff\u0003D\"\u0000\u00ffA\u0001\u0000\u0000\u0000\u0100\u0107\u0006"+
		"!\uffff\uffff\u0000\u0101\u0102\n\u0002\u0000\u0000\u0102\u0103\u0003"+
		"D\"\u0000\u0103\u0104\u0003R)\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u0101\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108C\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0003F#\u0000\u010b\u010c\u0003H$\u0000\u010cE\u0001\u0000\u0000"+
		"\u0000\u010d\u0114\u0006#\uffff\uffff\u0000\u010e\u010f\n\u0002\u0000"+
		"\u0000\u010f\u0110\u0003H$\u0000\u0110\u0111\u0003T*\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115G\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0003J%\u0000\u0118\u011a\u0003L&\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011aI\u0001\u0000\u0000\u0000\u011b\u011c\u0005\f\u0000\u0000\u011c"+
		"\u011d\u0003@ \u0000\u011d\u011e\u0005\r\u0000\u0000\u011e\u0123\u0001"+
		"\u0000\u0000\u0000\u011f\u0123\u0003\u0002\u0001\u0000\u0120\u0123\u0005"+
		"#\u0000\u0000\u0121\u0123\u0005$\u0000\u0000\u0122\u011b\u0001\u0000\u0000"+
		"\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123K\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0003\u0002\u0001\u0000\u0125\u0126\u0005\f\u0000\u0000\u0126"+
		"\u0127\u0003N\'\u0000\u0127\u0128\u0005\r\u0000\u0000\u0128M\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0003@ \u0000\u012a\u012b\u0003P(\u0000\u012b"+
		"\u012e\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d"+
		"\u0129\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e"+
		"O\u0001\u0000\u0000\u0000\u012f\u0130\u0005\t\u0000\u0000\u0130\u0131"+
		"\u0003@ \u0000\u0131\u0132\u0003P(\u0000\u0132\u0135\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u012f\u0001\u0000\u0000"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135Q\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0007\u0001\u0000\u0000\u0137S\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0007\u0002\u0000\u0000\u0139U\u0001\u0000\u0000\u0000\u0013hx"+
		"\u0082\u0086\u008c\u0096\u009c\u00af\u00b4\u00ba\u00e1\u00f7\u00fb\u0107"+
		"\u0114\u0119\u0122\u012d\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}