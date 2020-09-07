// $ANTLR 3.5.2 MiniJaJa.g 2018-11-05 15:15:22
package fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniJaJaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int AFFECTATION=4;
	public static final int APPELE=5;
	public static final int APPELI=6;
	public static final int BLOCK=7;
	public static final int BOOL=8;
	public static final int CALL=9;
	public static final int CLASSE=10;
	public static final int COMMENT=11;
	public static final int CST=12;
	public static final int DECLS=13;
	public static final int IDENT=14;
	public static final int IDF=15;
	public static final int ILCOMMENT=16;
	public static final int INCREMENT=17;
	public static final int INSTRS=18;
	public static final int INT=19;
	public static final int LISTEXP=20;
	public static final int METH=21;
	public static final int NBRE=22;
	public static final int PARAM=23;
	public static final int PRINTS=24;
	public static final int RETOUR=25;
	public static final int SI=26;
	public static final int SOMME=27;
	public static final int String=28;
	public static final int TAB=29;
	public static final int TABLEAU=30;
	public static final int TANTQUE=31;
	public static final int TYPE=32;
	public static final int VAR=33;
	public static final int VARS=34;
	public static final int VEC=35;
	public static final int VIDE=36;
	public static final int VOID=37;
	public static final int WS=38;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MiniJaJaLexer() {} 
	public MiniJaJaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MiniJaJaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "MiniJaJa.g"; }

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:4:7: ( '!' )
			// MiniJaJa.g:4:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:5:7: ( '&&' )
			// MiniJaJa.g:5:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:6:7: ( '(' )
			// MiniJaJa.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:7:7: ( ')' )
			// MiniJaJa.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:8:7: ( '*' )
			// MiniJaJa.g:8:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:9:7: ( '+' )
			// MiniJaJa.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:10:7: ( '++' )
			// MiniJaJa.g:10:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:11:7: ( '+=' )
			// MiniJaJa.g:11:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:12:7: ( ',' )
			// MiniJaJa.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:13:7: ( '-' )
			// MiniJaJa.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:14:7: ( '/' )
			// MiniJaJa.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:15:7: ( ';' )
			// MiniJaJa.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:16:7: ( '=' )
			// MiniJaJa.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:17:7: ( '==' )
			// MiniJaJa.g:17:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:18:7: ( '>' )
			// MiniJaJa.g:18:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:19:7: ( '[' )
			// MiniJaJa.g:19:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:20:7: ( ']' )
			// MiniJaJa.g:20:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:21:7: ( 'class' )
			// MiniJaJa.g:21:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:22:7: ( 'else' )
			// MiniJaJa.g:22:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:23:7: ( 'final' )
			// MiniJaJa.g:23:9: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:24:7: ( 'if' )
			// MiniJaJa.g:24:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:25:7: ( 'main' )
			// MiniJaJa.g:25:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:26:7: ( 'print' )
			// MiniJaJa.g:26:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:27:7: ( 'return' )
			// MiniJaJa.g:27:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:28:7: ( 'while' )
			// MiniJaJa.g:28:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:29:7: ( '{' )
			// MiniJaJa.g:29:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:30:7: ( '||' )
			// MiniJaJa.g:30:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:31:7: ( '}' )
			// MiniJaJa.g:31:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:135:6: ( 'void' )
			// MiniJaJa.g:135:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:138:6: ( 'int' | 'boolean' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='i') ) {
				alt1=1;
			}
			else if ( (LA1_0=='b') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// MiniJaJa.g:138:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// MiniJaJa.g:138:16: 'boolean'
					{
					match("boolean"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:142:6: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// MiniJaJa.g:142:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// MiniJaJa.g:142:17: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:145:8: ( ( '0' .. '9' )+ )
			// MiniJaJa.g:145:10: ( '0' .. '9' )+
			{
			// MiniJaJa.g:145:10: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// MiniJaJa.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:148:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// MiniJaJa.g:148:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// MiniJaJa.g:148:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// MiniJaJa.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDF"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:151:8: ( '\"' ( . )* '\"' )
			// MiniJaJa.g:151:10: '\"' ( . )* '\"'
			{
			match('\"'); 
			// MiniJaJa.g:151:14: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// MiniJaJa.g:151:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:154:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// MiniJaJa.g:154:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// MiniJaJa.g:154:18: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// MiniJaJa.g:154:46: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "ILCOMMENT"
	public final void mILCOMMENT() throws RecognitionException {
		try {
			int _type = ILCOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:157:13: ( '//' (~ ( '\\r' | '\\n' ) )* )
			// MiniJaJa.g:157:16: '//' (~ ( '\\r' | '\\n' ) )*
			{
			match("//"); 

			// MiniJaJa.g:157:21: (~ ( '\\r' | '\\n' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// MiniJaJa.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ILCOMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MiniJaJa.g:160:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// MiniJaJa.g:160:10: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// MiniJaJa.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | VOID | TYPE | BOOL | INT | IDF | String | COMMENT | ILCOMMENT | WS )
		int alt8=37;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// MiniJaJa.g:1:10: T__39
				{
				mT__39(); 

				}
				break;
			case 2 :
				// MiniJaJa.g:1:16: T__40
				{
				mT__40(); 

				}
				break;
			case 3 :
				// MiniJaJa.g:1:22: T__41
				{
				mT__41(); 

				}
				break;
			case 4 :
				// MiniJaJa.g:1:28: T__42
				{
				mT__42(); 

				}
				break;
			case 5 :
				// MiniJaJa.g:1:34: T__43
				{
				mT__43(); 

				}
				break;
			case 6 :
				// MiniJaJa.g:1:40: T__44
				{
				mT__44(); 

				}
				break;
			case 7 :
				// MiniJaJa.g:1:46: T__45
				{
				mT__45(); 

				}
				break;
			case 8 :
				// MiniJaJa.g:1:52: T__46
				{
				mT__46(); 

				}
				break;
			case 9 :
				// MiniJaJa.g:1:58: T__47
				{
				mT__47(); 

				}
				break;
			case 10 :
				// MiniJaJa.g:1:64: T__48
				{
				mT__48(); 

				}
				break;
			case 11 :
				// MiniJaJa.g:1:70: T__49
				{
				mT__49(); 

				}
				break;
			case 12 :
				// MiniJaJa.g:1:76: T__50
				{
				mT__50(); 

				}
				break;
			case 13 :
				// MiniJaJa.g:1:82: T__51
				{
				mT__51(); 

				}
				break;
			case 14 :
				// MiniJaJa.g:1:88: T__52
				{
				mT__52(); 

				}
				break;
			case 15 :
				// MiniJaJa.g:1:94: T__53
				{
				mT__53(); 

				}
				break;
			case 16 :
				// MiniJaJa.g:1:100: T__54
				{
				mT__54(); 

				}
				break;
			case 17 :
				// MiniJaJa.g:1:106: T__55
				{
				mT__55(); 

				}
				break;
			case 18 :
				// MiniJaJa.g:1:112: T__56
				{
				mT__56(); 

				}
				break;
			case 19 :
				// MiniJaJa.g:1:118: T__57
				{
				mT__57(); 

				}
				break;
			case 20 :
				// MiniJaJa.g:1:124: T__58
				{
				mT__58(); 

				}
				break;
			case 21 :
				// MiniJaJa.g:1:130: T__59
				{
				mT__59(); 

				}
				break;
			case 22 :
				// MiniJaJa.g:1:136: T__60
				{
				mT__60(); 

				}
				break;
			case 23 :
				// MiniJaJa.g:1:142: T__61
				{
				mT__61(); 

				}
				break;
			case 24 :
				// MiniJaJa.g:1:148: T__62
				{
				mT__62(); 

				}
				break;
			case 25 :
				// MiniJaJa.g:1:154: T__63
				{
				mT__63(); 

				}
				break;
			case 26 :
				// MiniJaJa.g:1:160: T__64
				{
				mT__64(); 

				}
				break;
			case 27 :
				// MiniJaJa.g:1:166: T__65
				{
				mT__65(); 

				}
				break;
			case 28 :
				// MiniJaJa.g:1:172: T__66
				{
				mT__66(); 

				}
				break;
			case 29 :
				// MiniJaJa.g:1:178: VOID
				{
				mVOID(); 

				}
				break;
			case 30 :
				// MiniJaJa.g:1:183: TYPE
				{
				mTYPE(); 

				}
				break;
			case 31 :
				// MiniJaJa.g:1:188: BOOL
				{
				mBOOL(); 

				}
				break;
			case 32 :
				// MiniJaJa.g:1:193: INT
				{
				mINT(); 

				}
				break;
			case 33 :
				// MiniJaJa.g:1:197: IDF
				{
				mIDF(); 

				}
				break;
			case 34 :
				// MiniJaJa.g:1:201: String
				{
				mString(); 

				}
				break;
			case 35 :
				// MiniJaJa.g:1:208: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 36 :
				// MiniJaJa.g:1:216: ILCOMMENT
				{
				mILCOMMENT(); 

				}
				break;
			case 37 :
				// MiniJaJa.g:1:226: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\6\uffff\1\43\2\uffff\1\46\1\uffff\1\50\3\uffff\10\36\3\uffff\3\36\14"+
		"\uffff\4\36\1\72\14\36\1\uffff\1\107\10\36\1\120\2\36\1\uffff\1\123\3"+
		"\36\1\127\1\36\1\131\1\132\1\uffff\1\133\1\131\1\uffff\1\134\1\36\1\136"+
		"\1\uffff\1\36\4\uffff\1\140\1\uffff\1\36\1\uffff\1\107";
	static final String DFA8_eofS =
		"\142\uffff";
	static final String DFA8_minS =
		"\1\11\5\uffff\1\53\2\uffff\1\52\1\uffff\1\75\3\uffff\2\154\1\141\1\146"+
		"\1\141\1\162\1\145\1\150\3\uffff\2\157\1\162\14\uffff\1\141\1\163\1\156"+
		"\1\154\1\60\1\164\2\151\1\164\2\151\1\157\1\165\1\163\1\145\1\141\1\163"+
		"\1\uffff\1\60\2\156\1\165\1\154\1\144\1\154\1\145\1\163\1\60\1\154\1\145"+
		"\1\uffff\1\60\1\164\1\162\1\145\1\60\1\145\2\60\1\uffff\2\60\1\uffff\1"+
		"\60\1\156\1\60\1\uffff\1\141\4\uffff\1\60\1\uffff\1\156\1\uffff\1\60";
	static final String DFA8_maxS =
		"\1\175\5\uffff\1\75\2\uffff\1\57\1\uffff\1\75\3\uffff\2\154\1\151\1\156"+
		"\1\141\1\162\1\145\1\150\3\uffff\2\157\1\162\14\uffff\1\141\1\163\1\156"+
		"\1\154\1\172\1\164\2\151\1\164\2\151\1\157\1\165\1\163\1\145\1\141\1\163"+
		"\1\uffff\1\172\2\156\1\165\1\154\1\144\1\154\1\145\1\163\1\172\1\154\1"+
		"\145\1\uffff\1\172\1\164\1\162\1\145\1\172\1\145\2\172\1\uffff\2\172\1"+
		"\uffff\1\172\1\156\1\172\1\uffff\1\141\4\uffff\1\172\1\uffff\1\156\1\uffff"+
		"\1\172";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\11\1\12\1\uffff\1\14\1\uffff\1"+
		"\17\1\20\1\21\10\uffff\1\32\1\33\1\34\3\uffff\1\40\1\41\1\42\1\45\1\7"+
		"\1\10\1\6\1\43\1\44\1\13\1\16\1\15\21\uffff\1\25\14\uffff\1\36\10\uffff"+
		"\1\23\2\uffff\1\26\3\uffff\1\35\1\uffff\1\37\1\22\1\24\1\27\1\uffff\1"+
		"\31\1\uffff\1\30\1\uffff";
	static final String DFA8_specialS =
		"\142\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\40\2\uffff\1\40\22\uffff\1\40\1\1\1\37\3\uffff\1\2\1\uffff\1\3\1\4"+
			"\1\5\1\6\1\7\1\10\1\uffff\1\11\12\35\1\uffff\1\12\1\uffff\1\13\1\14\2"+
			"\uffff\32\36\1\15\1\uffff\1\16\3\uffff\1\36\1\33\1\17\1\36\1\20\1\21"+
			"\2\36\1\22\3\36\1\23\2\36\1\24\1\36\1\25\1\36\1\34\1\36\1\32\1\26\3\36"+
			"\1\27\1\30\1\31",
			"",
			"",
			"",
			"",
			"",
			"\1\41\21\uffff\1\42",
			"",
			"",
			"\1\44\4\uffff\1\45",
			"",
			"\1\47",
			"",
			"",
			"",
			"\1\51",
			"\1\52",
			"\1\54\7\uffff\1\53",
			"\1\55\7\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\121",
			"\1\122",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\124",
			"\1\125",
			"\1\126",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\130",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\135",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\137",
			"",
			"",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\141",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | VOID | TYPE | BOOL | INT | IDF | String | COMMENT | ILCOMMENT | WS );";
		}
	}

}
