// $ANTLR null /home/frosqh/workspace/m1comp4/MiniJaJa.g 2018-10-03 12:45:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniJaJaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
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
	public static final int AFFECTATION=4;
	public static final int APPELI=5;
	public static final int BLOCK=6;
	public static final int BOOL=7;
	public static final int CALL=8;
	public static final int CLASSE=9;
	public static final int COMMENT=10;
	public static final int CST=11;
	public static final int DECLS=12;
	public static final int IDENT=13;
	public static final int IDF=14;
	public static final int ILCOMMENT=15;
	public static final int INCREMENT=16;
	public static final int INSTRS=17;
	public static final int INT=18;
	public static final int LISTEXP=19;
	public static final int METH=20;
	public static final int NBRE=21;
	public static final int PARAM=22;
	public static final int RETOUR=23;
	public static final int SI=24;
	public static final int SOMME=25;
	public static final int TAB=26;
	public static final int TABLEAU=27;
	public static final int TANTQUE=28;
	public static final int TYPE=29;
	public static final int VAR=30;
	public static final int VARS=31;
	public static final int VEC=32;
	public static final int VIDE=33;
	public static final int VOID=34;
	public static final int WS=35;

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
	@Override public String getGrammarFileName() { return "/home/frosqh/workspace/m1comp4/MiniJaJa.g"; }

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:2:7: ( '!' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:2:9: '!'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:3:7: ( '&&' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:3:9: '&&'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:4:7: ( '(' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:4:9: '('
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:5:7: ( ')' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:5:9: ')'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:6:7: ( '*' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:6:9: '*'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:7:7: ( '+' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:7:9: '+'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:8:7: ( '++' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:8:9: '++'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:9:7: ( '+=' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:9:9: '+='
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:10:7: ( ',' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:10:9: ','
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:11:7: ( '-' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:11:9: '-'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:12:7: ( '/' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:12:9: '/'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:13:7: ( ';' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:13:9: ';'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:14:7: ( '=' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:14:9: '='
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:15:7: ( '==' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:15:9: '=='
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:16:7: ( '>' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:16:9: '>'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:17:7: ( '[' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:17:9: '['
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:18:7: ( ']' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:18:9: ']'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:19:7: ( 'class' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:19:9: 'class'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:20:7: ( 'else' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:20:9: 'else'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:21:7: ( 'final' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:21:9: 'final'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:22:7: ( 'if' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:22:9: 'if'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:23:7: ( 'main' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:23:9: 'main'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:24:7: ( 'return' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:24:9: 'return'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:25:7: ( 'while' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:25:9: 'while'
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
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:26:7: ( '{' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:26:9: '{'
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:27:7: ( '||' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:27:9: '||'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:28:7: ( '}' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:28:9: '}'
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
	// $ANTLR end "T__62"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:127:6: ( 'void' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:127:8: 'void'
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:130:6: ( 'int' | 'boolean' )
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
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:130:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:130:16: 'boolean'
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:134:6: ( 'true' | 'false' )
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
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:134:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:134:17: 'false'
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:137:8: ( ( '0' .. '9' )+ )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:137:10: ( '0' .. '9' )+
			{
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:137:10: ( '0' .. '9' )+
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
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:140:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:140:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:140:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:143:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:143:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:143:18: ( options {greedy=false; } : . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						alt5=2;
					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:143:46: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:146:13: ( '//' (~ ( '\\r' | '\\n' ) )* )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:146:16: '//' (~ ( '\\r' | '\\n' ) )*
			{
			match("//"); 

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:146:21: (~ ( '\\r' | '\\n' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:
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
					break loop6;
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
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:149:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:149:10: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | VOID | TYPE | BOOL | INT | IDF | COMMENT | ILCOMMENT | WS )
		int alt7=35;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:10: T__36
				{
				mT__36(); 

				}
				break;
			case 2 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:16: T__37
				{
				mT__37(); 

				}
				break;
			case 3 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:22: T__38
				{
				mT__38(); 

				}
				break;
			case 4 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:28: T__39
				{
				mT__39(); 

				}
				break;
			case 5 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:34: T__40
				{
				mT__40(); 

				}
				break;
			case 6 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:40: T__41
				{
				mT__41(); 

				}
				break;
			case 7 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:46: T__42
				{
				mT__42(); 

				}
				break;
			case 8 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:52: T__43
				{
				mT__43(); 

				}
				break;
			case 9 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:58: T__44
				{
				mT__44(); 

				}
				break;
			case 10 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:64: T__45
				{
				mT__45(); 

				}
				break;
			case 11 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:70: T__46
				{
				mT__46(); 

				}
				break;
			case 12 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:76: T__47
				{
				mT__47(); 

				}
				break;
			case 13 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:82: T__48
				{
				mT__48(); 

				}
				break;
			case 14 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:88: T__49
				{
				mT__49(); 

				}
				break;
			case 15 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:94: T__50
				{
				mT__50(); 

				}
				break;
			case 16 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:100: T__51
				{
				mT__51(); 

				}
				break;
			case 17 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:106: T__52
				{
				mT__52(); 

				}
				break;
			case 18 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:112: T__53
				{
				mT__53(); 

				}
				break;
			case 19 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:118: T__54
				{
				mT__54(); 

				}
				break;
			case 20 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:124: T__55
				{
				mT__55(); 

				}
				break;
			case 21 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:130: T__56
				{
				mT__56(); 

				}
				break;
			case 22 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:136: T__57
				{
				mT__57(); 

				}
				break;
			case 23 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:142: T__58
				{
				mT__58(); 

				}
				break;
			case 24 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:148: T__59
				{
				mT__59(); 

				}
				break;
			case 25 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:154: T__60
				{
				mT__60(); 

				}
				break;
			case 26 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:160: T__61
				{
				mT__61(); 

				}
				break;
			case 27 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:166: T__62
				{
				mT__62(); 

				}
				break;
			case 28 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:172: VOID
				{
				mVOID(); 

				}
				break;
			case 29 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:177: TYPE
				{
				mTYPE(); 

				}
				break;
			case 30 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:182: BOOL
				{
				mBOOL(); 

				}
				break;
			case 31 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:187: INT
				{
				mINT(); 

				}
				break;
			case 32 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:191: IDF
				{
				mIDF(); 

				}
				break;
			case 33 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:195: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 34 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:203: ILCOMMENT
				{
				mILCOMMENT(); 

				}
				break;
			case 35 :
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:1:213: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\6\uffff\1\41\2\uffff\1\44\1\uffff\1\46\3\uffff\7\35\3\uffff\3\35\13\uffff"+
		"\4\35\1\67\13\35\1\uffff\1\103\7\35\1\113\2\35\1\uffff\1\116\2\35\1\121"+
		"\1\35\1\123\1\124\1\uffff\1\125\1\123\1\uffff\1\35\1\127\1\uffff\1\35"+
		"\3\uffff\1\131\1\uffff\1\35\1\uffff\1\103";
	static final String DFA7_eofS =
		"\133\uffff";
	static final String DFA7_minS =
		"\1\11\5\uffff\1\53\2\uffff\1\52\1\uffff\1\75\3\uffff\2\154\1\141\1\146"+
		"\1\141\1\145\1\150\3\uffff\2\157\1\162\13\uffff\1\141\1\163\1\156\1\154"+
		"\1\60\1\164\1\151\1\164\2\151\1\157\1\165\1\163\1\145\1\141\1\163\1\uffff"+
		"\1\60\1\156\1\165\1\154\1\144\1\154\1\145\1\163\1\60\1\154\1\145\1\uffff"+
		"\1\60\1\162\1\145\1\60\1\145\2\60\1\uffff\2\60\1\uffff\1\156\1\60\1\uffff"+
		"\1\141\3\uffff\1\60\1\uffff\1\156\1\uffff\1\60";
	static final String DFA7_maxS =
		"\1\175\5\uffff\1\75\2\uffff\1\57\1\uffff\1\75\3\uffff\2\154\1\151\1\156"+
		"\1\141\1\145\1\150\3\uffff\2\157\1\162\13\uffff\1\141\1\163\1\156\1\154"+
		"\1\172\1\164\1\151\1\164\2\151\1\157\1\165\1\163\1\145\1\141\1\163\1\uffff"+
		"\1\172\1\156\1\165\1\154\1\144\1\154\1\145\1\163\1\172\1\154\1\145\1\uffff"+
		"\1\172\1\162\1\145\1\172\1\145\2\172\1\uffff\2\172\1\uffff\1\156\1\172"+
		"\1\uffff\1\141\3\uffff\1\172\1\uffff\1\156\1\uffff\1\172";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\11\1\12\1\uffff\1\14\1\uffff\1"+
		"\17\1\20\1\21\7\uffff\1\31\1\32\1\33\3\uffff\1\37\1\40\1\43\1\7\1\10\1"+
		"\6\1\41\1\42\1\13\1\16\1\15\20\uffff\1\25\13\uffff\1\35\7\uffff\1\23\2"+
		"\uffff\1\26\2\uffff\1\34\1\uffff\1\36\1\22\1\24\1\uffff\1\30\1\uffff\1"+
		"\27\1\uffff";
	static final String DFA7_specialS =
		"\133\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\1\4\uffff\1\2\1\uffff\1\3\1\4\1\5"+
			"\1\6\1\7\1\10\1\uffff\1\11\12\34\1\uffff\1\12\1\uffff\1\13\1\14\2\uffff"+
			"\32\35\1\15\1\uffff\1\16\3\uffff\1\35\1\32\1\17\1\35\1\20\1\21\2\35\1"+
			"\22\3\35\1\23\4\35\1\24\1\35\1\33\1\35\1\31\1\25\3\35\1\26\1\27\1\30",
			"",
			"",
			"",
			"",
			"",
			"\1\37\21\uffff\1\40",
			"",
			"",
			"\1\42\4\uffff\1\43",
			"",
			"\1\45",
			"",
			"",
			"",
			"\1\47",
			"\1\50",
			"\1\52\7\uffff\1\51",
			"\1\53\7\uffff\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
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
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\114",
			"\1\115",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\117",
			"\1\120",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\122",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\126",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\130",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\132",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | VOID | TYPE | BOOL | INT | IDF | COMMENT | ILCOMMENT | WS );";
		}
	}

}
