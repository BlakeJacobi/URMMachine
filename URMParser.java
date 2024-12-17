// Generated from C:/Users/bjac9/IdeaProjects/URMachine/URM.g4 by ANTLR 4.13.2
package mygrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class URMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JUMP=6, SUCC=7, TRANSFER=8, ZERO=9, 
		NUMBER=10, NEWLINE=11, WS=12, CONFIG=13;
	public static final int
		RULE_program = 0, RULE_config = 1, RULE_instruction = 2, RULE_jumpInstr = 3, 
		RULE_succInstr = 4, RULE_transferInstr = 5, RULE_zeroInstr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "config", "instruction", "jumpInstr", "succInstr", "transferInstr", 
			"zeroInstr"
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

	@Override
	public String getGrammarFileName() { return "URM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public URMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ConfigContext config() {
			return getRuleContext(ConfigContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(URMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(URMParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(URMParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(URMParser.EOF, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIG) {
				{
				setState(14);
				config();
				setState(15);
				match(NEWLINE);
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				{
				setState(19);
				instruction();
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode CONFIG() { return getToken(URMParser.CONFIG, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(URMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(URMParser.NUMBER, i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(CONFIG);
			setState(28);
			match(T__0);
			setState(29);
			match(NUMBER);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(30);
				match(T__1);
				setState(31);
				match(NUMBER);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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
	public static class InstructionContext extends ParserRuleContext {
		public JumpInstrContext jumpInstr() {
			return getRuleContext(JumpInstrContext.class,0);
		}
		public SuccInstrContext succInstr() {
			return getRuleContext(SuccInstrContext.class,0);
		}
		public TransferInstrContext transferInstr() {
			return getRuleContext(TransferInstrContext.class,0);
		}
		public ZeroInstrContext zeroInstr() {
			return getRuleContext(ZeroInstrContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JUMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				jumpInstr();
				}
				break;
			case SUCC:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				succInstr();
				}
				break;
			case TRANSFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				transferInstr();
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				zeroInstr();
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
	public static class JumpInstrContext extends ParserRuleContext {
		public TerminalNode JUMP() { return getToken(URMParser.JUMP, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(URMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(URMParser.NUMBER, i);
		}
		public JumpInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterJumpInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitJumpInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitJumpInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpInstrContext jumpInstr() throws RecognitionException {
		JumpInstrContext _localctx = new JumpInstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jumpInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(JUMP);
			setState(46);
			match(T__3);
			setState(47);
			match(NUMBER);
			setState(48);
			match(T__1);
			setState(49);
			match(NUMBER);
			setState(50);
			match(T__1);
			setState(51);
			match(NUMBER);
			setState(52);
			match(T__4);
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
	public static class SuccInstrContext extends ParserRuleContext {
		public TerminalNode SUCC() { return getToken(URMParser.SUCC, 0); }
		public TerminalNode NUMBER() { return getToken(URMParser.NUMBER, 0); }
		public SuccInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_succInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterSuccInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitSuccInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitSuccInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuccInstrContext succInstr() throws RecognitionException {
		SuccInstrContext _localctx = new SuccInstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_succInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(SUCC);
			setState(55);
			match(T__3);
			setState(56);
			match(NUMBER);
			setState(57);
			match(T__4);
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
	public static class TransferInstrContext extends ParserRuleContext {
		public TerminalNode TRANSFER() { return getToken(URMParser.TRANSFER, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(URMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(URMParser.NUMBER, i);
		}
		public TransferInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterTransferInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitTransferInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitTransferInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransferInstrContext transferInstr() throws RecognitionException {
		TransferInstrContext _localctx = new TransferInstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transferInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TRANSFER);
			setState(60);
			match(T__3);
			setState(61);
			match(NUMBER);
			setState(62);
			match(T__1);
			setState(63);
			match(NUMBER);
			setState(64);
			match(T__4);
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
	public static class ZeroInstrContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(URMParser.ZERO, 0); }
		public TerminalNode NUMBER() { return getToken(URMParser.NUMBER, 0); }
		public ZeroInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).enterZeroInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof URMListener ) ((URMListener)listener).exitZeroInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof URMVisitor ) return ((URMVisitor<? extends T>)visitor).visitZeroInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroInstrContext zeroInstr() throws RecognitionException {
		ZeroInstrContext _localctx = new ZeroInstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zeroInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ZERO);
			setState(67);
			match(T__3);
			setState(68);
			match(NUMBER);
			setState(69);
			match(T__4);
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

	public static final String _serializedATN =
		"\u0004\u0001\rH\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001"+
		"$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0001"+
		"\u000b\u000bF\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000"+
		"\b6\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fB\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u000b"+
		"\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0003\u0004\u0002\u0000\u0014\u0015\u0007\u0000"+
		"\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000"+
		"\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\r\u0000"+
		"\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\"\u0005\n\u0000\u0000"+
		"\u001e\u001f\u0005\u0002\u0000\u0000\u001f!\u0005\n\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0003\u0000\u0000&\u0003\u0001\u0000\u0000\u0000"+
		"\',\u0003\u0006\u0003\u0000(,\u0003\b\u0004\u0000),\u0003\n\u0005\u0000"+
		"*,\u0003\f\u0006\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0005\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0006\u0000\u0000./\u0005\u0004\u0000\u0000"+
		"/0\u0005\n\u0000\u000001\u0005\u0002\u0000\u000012\u0005\n\u0000\u0000"+
		"23\u0005\u0002\u0000\u000034\u0005\n\u0000\u000045\u0005\u0005\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000067\u0005\u0007\u0000\u000078\u0005\u0004"+
		"\u0000\u000089\u0005\n\u0000\u00009:\u0005\u0005\u0000\u0000:\t\u0001"+
		"\u0000\u0000\u0000;<\u0005\b\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0005"+
		"\n\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005"+
		"\u0005\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\t\u0000\u0000"+
		"CD\u0005\u0004\u0000\u0000DE\u0005\n\u0000\u0000EF\u0005\u0005\u0000\u0000"+
		"F\r\u0001\u0000\u0000\u0000\u0004\u0011\u0018\"+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}