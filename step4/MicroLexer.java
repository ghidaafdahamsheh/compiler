// Generated from Micro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MicroLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "KEYWORD", "OPERATOR", 
			"IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
			"WS"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\'\u0161\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u011a\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0127\b \u0001!\u0004!\u012a\b!\u000b!\f!\u012b\u0001!\u0005!\u012f"+
		"\b!\n!\f!\u0132\t!\u0001\"\u0004\"\u0135\b\"\u000b\"\f\"\u0136\u0001#"+
		"\u0005#\u013a\b#\n#\f#\u013d\t#\u0001#\u0001#\u0004#\u0141\b#\u000b#\f"+
		"#\u0142\u0001$\u0001$\u0005$\u0147\b$\n$\f$\u014a\t$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u0152\b%\n%\f%\u0155\t%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0004&\u015c\b&\u000b&\f&\u015d\u0001&\u0001&\u0000\u0000"+
		"\'\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'\u0001\u0000\b\u0004\u0000*+--//==\u0002\u0000<<>>\u0003\u0000()"+
		",,;;\u0002\u0000AZaz\u0001\u000009\u0001\u0000\"\"\u0001\u0000\n\n\u0003"+
		"\u0000\t\n\r\r  \u017d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0001O\u0001\u0000\u0000\u0000\u0003W\u0001\u0000\u0000\u0000\u0005"+
		"]\u0001\u0000\u0000\u0000\u0007a\u0001\u0000\u0000\u0000\th\u0001\u0000"+
		"\u0000\u0000\u000bk\u0001\u0000\u0000\u0000\rm\u0001\u0000\u0000\u0000"+
		"\u000fs\u0001\u0000\u0000\u0000\u0011w\u0001\u0000\u0000\u0000\u0013y"+
		"\u0001\u0000\u0000\u0000\u0015~\u0001\u0000\u0000\u0000\u0017\u0087\u0001"+
		"\u0000\u0000\u0000\u0019\u0089\u0001\u0000\u0000\u0000\u001b\u008b\u0001"+
		"\u0000\u0000\u0000\u001d\u0090\u0001\u0000\u0000\u0000\u001f\u0096\u0001"+
		"\u0000\u0000\u0000!\u009d\u0001\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000"+
		"\u0000%\u00a6\u0001\u0000\u0000\u0000\'\u00ab\u0001\u0000\u0000\u0000"+
		")\u00ad\u0001\u0000\u0000\u0000+\u00b0\u0001\u0000\u0000\u0000-\u00b3"+
		"\u0001\u0000\u0000\u0000/\u00b6\u0001\u0000\u0000\u00001\u00b8\u0001\u0000"+
		"\u0000\u00003\u00ba\u0001\u0000\u0000\u00005\u00be\u0001\u0000\u0000\u0000"+
		"7\u00c5\u0001\u0000\u0000\u00009\u00c7\u0001\u0000\u0000\u0000;\u00c9"+
		"\u0001\u0000\u0000\u0000=\u00cb\u0001\u0000\u0000\u0000?\u0119\u0001\u0000"+
		"\u0000\u0000A\u0126\u0001\u0000\u0000\u0000C\u0129\u0001\u0000\u0000\u0000"+
		"E\u0134\u0001\u0000\u0000\u0000G\u013b\u0001\u0000\u0000\u0000I\u0144"+
		"\u0001\u0000\u0000\u0000K\u014d\u0001\u0000\u0000\u0000M\u015b\u0001\u0000"+
		"\u0000\u0000OP\u0005P\u0000\u0000PQ\u0005R\u0000\u0000QR\u0005O\u0000"+
		"\u0000RS\u0005G\u0000\u0000ST\u0005R\u0000\u0000TU\u0005A\u0000\u0000"+
		"UV\u0005M\u0000\u0000V\u0002\u0001\u0000\u0000\u0000WX\u0005B\u0000\u0000"+
		"XY\u0005E\u0000\u0000YZ\u0005G\u0000\u0000Z[\u0005I\u0000\u0000[\\\u0005"+
		"N\u0000\u0000\\\u0004\u0001\u0000\u0000\u0000]^\u0005E\u0000\u0000^_\u0005"+
		"N\u0000\u0000_`\u0005D\u0000\u0000`\u0006\u0001\u0000\u0000\u0000ab\u0005"+
		"S\u0000\u0000bc\u0005T\u0000\u0000cd\u0005R\u0000\u0000de\u0005I\u0000"+
		"\u0000ef\u0005N\u0000\u0000fg\u0005G\u0000\u0000g\b\u0001\u0000\u0000"+
		"\u0000hi\u0005:\u0000\u0000ij\u0005=\u0000\u0000j\n\u0001\u0000\u0000"+
		"\u0000kl\u0005;\u0000\u0000l\f\u0001\u0000\u0000\u0000mn\u0005F\u0000"+
		"\u0000no\u0005L\u0000\u0000op\u0005O\u0000\u0000pq\u0005A\u0000\u0000"+
		"qr\u0005T\u0000\u0000r\u000e\u0001\u0000\u0000\u0000st\u0005I\u0000\u0000"+
		"tu\u0005N\u0000\u0000uv\u0005T\u0000\u0000v\u0010\u0001\u0000\u0000\u0000"+
		"wx\u0005,\u0000\u0000x\u0012\u0001\u0000\u0000\u0000yz\u0005V\u0000\u0000"+
		"z{\u0005O\u0000\u0000{|\u0005I\u0000\u0000|}\u0005D\u0000\u0000}\u0014"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005F\u0000\u0000\u007f\u0080\u0005U"+
		"\u0000\u0000\u0080\u0081\u0005N\u0000\u0000\u0081\u0082\u0005C\u0000\u0000"+
		"\u0082\u0083\u0005T\u0000\u0000\u0083\u0084\u0005I\u0000\u0000\u0084\u0085"+
		"\u0005O\u0000\u0000\u0085\u0086\u0005N\u0000\u0000\u0086\u0016\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005(\u0000\u0000\u0088\u0018\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005)\u0000\u0000\u008a\u001a\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005R\u0000\u0000\u008c\u008d\u0005E\u0000\u0000\u008d\u008e"+
		"\u0005A\u0000\u0000\u008e\u008f\u0005D\u0000\u0000\u008f\u001c\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005W\u0000\u0000\u0091\u0092\u0005R\u0000\u0000"+
		"\u0092\u0093\u0005I\u0000\u0000\u0093\u0094\u0005T\u0000\u0000\u0094\u0095"+
		"\u0005E\u0000\u0000\u0095\u001e\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"R\u0000\u0000\u0097\u0098\u0005E\u0000\u0000\u0098\u0099\u0005T\u0000"+
		"\u0000\u0099\u009a\u0005U\u0000\u0000\u009a\u009b\u0005R\u0000\u0000\u009b"+
		"\u009c\u0005N\u0000\u0000\u009c \u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"I\u0000\u0000\u009e\u009f\u0005F\u0000\u0000\u009f\"\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005E\u0000\u0000\u00a1\u00a2\u0005N\u0000\u0000\u00a2"+
		"\u00a3\u0005D\u0000\u0000\u00a3\u00a4\u0005I\u0000\u0000\u00a4\u00a5\u0005"+
		"F\u0000\u0000\u00a5$\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005E\u0000"+
		"\u0000\u00a7\u00a8\u0005L\u0000\u0000\u00a8\u00a9\u0005S\u0000\u0000\u00a9"+
		"\u00aa\u0005E\u0000\u0000\u00aa&\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"=\u0000\u0000\u00ac(\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005!\u0000"+
		"\u0000\u00ae\u00af\u0005=\u0000\u0000\u00af*\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005<\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b2,\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005>\u0000\u0000\u00b4\u00b5\u0005=\u0000"+
		"\u0000\u00b5.\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005<\u0000\u0000\u00b7"+
		"0\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005>\u0000\u0000\u00b92\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005F\u0000\u0000\u00bb\u00bc\u0005O\u0000"+
		"\u0000\u00bc\u00bd\u0005R\u0000\u0000\u00bd4\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005E\u0000\u0000\u00bf\u00c0\u0005N\u0000\u0000\u00c0\u00c1\u0005"+
		"D\u0000\u0000\u00c1\u00c2\u0005F\u0000\u0000\u00c2\u00c3\u0005O\u0000"+
		"\u0000\u00c3\u00c4\u0005R\u0000\u0000\u00c46\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005+\u0000\u0000\u00c68\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"-\u0000\u0000\u00c8:\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005*\u0000"+
		"\u0000\u00ca<\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005/\u0000\u0000\u00cc"+
		">\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005P\u0000\u0000\u00ce\u00cf\u0005"+
		"R\u0000\u0000\u00cf\u00d0\u0005O\u0000\u0000\u00d0\u00d1\u0005G\u0000"+
		"\u0000\u00d1\u00d2\u0005R\u0000\u0000\u00d2\u00d3\u0005A\u0000\u0000\u00d3"+
		"\u011a\u0005M\u0000\u0000\u00d4\u00d5\u0005B\u0000\u0000\u00d5\u00d6\u0005"+
		"E\u0000\u0000\u00d6\u00d7\u0005G\u0000\u0000\u00d7\u00d8\u0005I\u0000"+
		"\u0000\u00d8\u011a\u0005N\u0000\u0000\u00d9\u00da\u0005E\u0000\u0000\u00da"+
		"\u00db\u0005N\u0000\u0000\u00db\u011a\u0005D\u0000\u0000\u00dc\u00dd\u0005"+
		"F\u0000\u0000\u00dd\u00de\u0005U\u0000\u0000\u00de\u00df\u0005N\u0000"+
		"\u0000\u00df\u00e0\u0005C\u0000\u0000\u00e0\u00e1\u0005T\u0000\u0000\u00e1"+
		"\u00e2\u0005I\u0000\u0000\u00e2\u00e3\u0005O\u0000\u0000\u00e3\u011a\u0005"+
		"N\u0000\u0000\u00e4\u00e5\u0005R\u0000\u0000\u00e5\u00e6\u0005E\u0000"+
		"\u0000\u00e6\u00e7\u0005T\u0000\u0000\u00e7\u00e8\u0005U\u0000\u0000\u00e8"+
		"\u00e9\u0005R\u0000\u0000\u00e9\u011a\u0005N\u0000\u0000\u00ea\u00eb\u0005"+
		"R\u0000\u0000\u00eb\u00ec\u0005E\u0000\u0000\u00ec\u00ed\u0005A\u0000"+
		"\u0000\u00ed\u011a\u0005D\u0000\u0000\u00ee\u00ef\u0005W\u0000\u0000\u00ef"+
		"\u00f0\u0005R\u0000\u0000\u00f0\u00f1\u0005I\u0000\u0000\u00f1\u00f2\u0005"+
		"T\u0000\u0000\u00f2\u011a\u0005E\u0000\u0000\u00f3\u00f4\u0005I\u0000"+
		"\u0000\u00f4\u011a\u0005F\u0000\u0000\u00f5\u00f6\u0005E\u0000\u0000\u00f6"+
		"\u00f7\u0005L\u0000\u0000\u00f7\u00f8\u0005S\u0000\u0000\u00f8\u011a\u0005"+
		"E\u0000\u0000\u00f9\u00fa\u0005E\u0000\u0000\u00fa\u00fb\u0005N\u0000"+
		"\u0000\u00fb\u00fc\u0005D\u0000\u0000\u00fc\u00fd\u0005I\u0000\u0000\u00fd"+
		"\u011a\u0005F\u0000\u0000\u00fe\u00ff\u0005F\u0000\u0000\u00ff\u0100\u0005"+
		"O\u0000\u0000\u0100\u011a\u0005R\u0000\u0000\u0101\u0102\u0005E\u0000"+
		"\u0000\u0102\u0103\u0005N\u0000\u0000\u0103\u0104\u0005D\u0000\u0000\u0104"+
		"\u0105\u0005F\u0000\u0000\u0105\u0106\u0005O\u0000\u0000\u0106\u011a\u0005"+
		"R\u0000\u0000\u0107\u0108\u0005I\u0000\u0000\u0108\u0109\u0005N\u0000"+
		"\u0000\u0109\u011a\u0005T\u0000\u0000\u010a\u010b\u0005V\u0000\u0000\u010b"+
		"\u010c\u0005O\u0000\u0000\u010c\u010d\u0005I\u0000\u0000\u010d\u011a\u0005"+
		"D\u0000\u0000\u010e\u010f\u0005S\u0000\u0000\u010f\u0110\u0005T\u0000"+
		"\u0000\u0110\u0111\u0005R\u0000\u0000\u0111\u0112\u0005I\u0000\u0000\u0112"+
		"\u0113\u0005N\u0000\u0000\u0113\u011a\u0005G\u0000\u0000\u0114\u0115\u0005"+
		"F\u0000\u0000\u0115\u0116\u0005L\u0000\u0000\u0116\u0117\u0005O\u0000"+
		"\u0000\u0117\u0118\u0005A\u0000\u0000\u0118\u011a\u0005T\u0000\u0000\u0119"+
		"\u00cd\u0001\u0000\u0000\u0000\u0119\u00d4\u0001\u0000\u0000\u0000\u0119"+
		"\u00d9\u0001\u0000\u0000\u0000\u0119\u00dc\u0001\u0000\u0000\u0000\u0119"+
		"\u00e4\u0001\u0000\u0000\u0000\u0119\u00ea\u0001\u0000\u0000\u0000\u0119"+
		"\u00ee\u0001\u0000\u0000\u0000\u0119\u00f3\u0001\u0000\u0000\u0000\u0119"+
		"\u00f5\u0001\u0000\u0000\u0000\u0119\u00f9\u0001\u0000\u0000\u0000\u0119"+
		"\u00fe\u0001\u0000\u0000\u0000\u0119\u0101\u0001\u0000\u0000\u0000\u0119"+
		"\u0107\u0001\u0000\u0000\u0000\u0119\u010a\u0001\u0000\u0000\u0000\u0119"+
		"\u010e\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u011a"+
		"@\u0001\u0000\u0000\u0000\u011b\u011c\u0005:\u0000\u0000\u011c\u0127\u0005"+
		"=\u0000\u0000\u011d\u0127\u0007\u0000\u0000\u0000\u011e\u011f\u0005!\u0000"+
		"\u0000\u011f\u0127\u0005=\u0000\u0000\u0120\u0127\u0007\u0001\u0000\u0000"+
		"\u0121\u0122\u0005<\u0000\u0000\u0122\u0127\u0005=\u0000\u0000\u0123\u0124"+
		"\u0005>\u0000\u0000\u0124\u0127\u0005=\u0000\u0000\u0125\u0127\u0007\u0002"+
		"\u0000\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0126\u011d\u0001\u0000"+
		"\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u0120\u0001\u0000"+
		"\u0000\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127B\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0007\u0003\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0130\u0001\u0000\u0000"+
		"\u0000\u012d\u012f\u0007\u0004\u0000\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131D\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0007\u0004\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137F\u0001\u0000\u0000\u0000\u0138\u013a\u0007\u0004\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u0140\u0005.\u0000\u0000\u013f\u0141\u0007\u0004\u0000\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143H\u0001"+
		"\u0000\u0000\u0000\u0144\u0148\u0005\"\u0000\u0000\u0145\u0147\b\u0005"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005\"\u0000\u0000\u014cJ\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0005-\u0000\u0000\u014e\u014f\u0005-\u0000\u0000\u014f"+
		"\u0153\u0001\u0000\u0000\u0000\u0150\u0152\b\u0006\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0005\n\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0006"+
		"%\u0000\u0000\u0159L\u0001\u0000\u0000\u0000\u015a\u015c\u0007\u0007\u0000"+
		"\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0006&\u0000\u0000"+
		"\u0160N\u0001\u0000\u0000\u0000\u000b\u0000\u0119\u0126\u012b\u0130\u0136"+
		"\u013b\u0142\u0148\u0153\u015d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}