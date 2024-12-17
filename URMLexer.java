// Generated from C:/Users/bjac9/IdeaProjects/URMachine/URM.g4 by ANTLR 4.13.2
package mygrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class URMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JUMP=6, SUCC=7, TRANSFER=8, ZERO=9, 
		NUMBER=10, NEWLINE=11, WS=12, CONFIG=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "JUMP", "SUCC", "TRANSFER", "ZERO", 
			"NUMBER", "NEWLINE", "WS", "CONFIG"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "JUMP", "SUCC", "TRANSFER", "ZERO", 
			"NUMBER", "NEWLINE", "WS", "CONFIG"
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


	public URMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "URM.g4"; }

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
		"\u0004\u0000\rX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\t?\b\t\u000b\t\f\t@\u0001\n\u0003\nD\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nI\b\n\u0001\u000b\u0004\u000bL\b\u000b\u000b\u000b\f\u000bM\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000"+
		"\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001"+
		"\u0000\u0012\u0002\u0000JJjj\u0002\u0000UUuu\u0002\u0000MMmm\u0002\u0000"+
		"PPpp\u0002\u0000SSss\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000RRrr\u0002"+
		"\u0000AAaa\u0002\u0000NNnn\u0002\u0000FFff\u0002\u0000EEee\u0002\u0000"+
		"ZZzz\u0002\u0000OOoo\u0001\u000009\u0002\u0000\t\t  \u0002\u0000IIii\u0002"+
		"\u0000GGgg[\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000"+
		"\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000"+
		"\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001"+
		"\u0000\u0000\u0000\r*\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000"+
		"\u0000\u00118\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015"+
		"H\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019Q\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005[\u0000\u0000\u001c\u0002\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005,\u0000\u0000\u001e\u0004\u0001\u0000\u0000"+
		"\u0000\u001f \u0005]\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!\"\u0005"+
		"(\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005)\u0000\u0000$\n\u0001"+
		"\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\'\u0007\u0001\u0000\u0000"+
		"\'(\u0007\u0002\u0000\u0000()\u0007\u0003\u0000\u0000)\f\u0001\u0000\u0000"+
		"\u0000*+\u0007\u0004\u0000\u0000+,\u0007\u0001\u0000\u0000,-\u0007\u0005"+
		"\u0000\u0000-.\u0007\u0005\u0000\u0000.\u000e\u0001\u0000\u0000\u0000"+
		"/0\u0007\u0006\u0000\u000001\u0007\u0007\u0000\u000012\u0007\b\u0000\u0000"+
		"23\u0007\t\u0000\u000034\u0007\u0004\u0000\u000045\u0007\n\u0000\u0000"+
		"56\u0007\u000b\u0000\u000067\u0007\u0007\u0000\u00007\u0010\u0001\u0000"+
		"\u0000\u000089\u0007\f\u0000\u00009:\u0007\u000b\u0000\u0000:;\u0007\u0007"+
		"\u0000\u0000;<\u0007\r\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=?\u0007"+
		"\u000e\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0014\u0001\u0000"+
		"\u0000\u0000BD\u0005\r\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EI\u0005\n\u0000\u0000FG\u0005\\"+
		"\u0000\u0000GI\u0005n\u0000\u0000HC\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000I\u0016\u0001\u0000\u0000\u0000JL\u0007\u000f\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006\u000b"+
		"\u0000\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0007\u0005\u0000\u0000"+
		"RS\u0007\r\u0000\u0000ST\u0007\t\u0000\u0000TU\u0007\n\u0000\u0000UV\u0007"+
		"\u0010\u0000\u0000VW\u0007\u0011\u0000\u0000W\u001a\u0001\u0000\u0000"+
		"\u0000\u0005\u0000@CHM\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}