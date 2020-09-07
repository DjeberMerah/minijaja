// $ANTLR null /home/frosqh/workspace/m1comp4/MiniJaJa.g 2018-10-03 12:45:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MiniJaJaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECTATION", "APPELI", "BLOCK", 
		"BOOL", "CALL", "CLASSE", "COMMENT", "CST", "DECLS", "IDENT", "IDF", "ILCOMMENT", 
		"INCREMENT", "INSTRS", "INT", "LISTEXP", "METH", "NBRE", "PARAM", "RETOUR", 
		"SI", "SOMME", "TAB", "TABLEAU", "TANTQUE", "TYPE", "VAR", "VARS", "VEC", 
		"VIDE", "VOID", "WS", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", "'++'", 
		"'+='", "','", "'-'", "'/'", "';'", "'='", "'=='", "'>'", "'['", "']'", 
		"'class'", "'else'", "'final'", "'if'", "'main'", "'return'", "'while'", 
		"'{'", "'||'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "vexp", "exp", "instrs", "vars", "exp1", "classe", "decls", 
		"decl", "listexp", "terme", "fichier", "methmain", "exp2", "varz", "instr", 
		"finalvar", "axiom", "ident", "ent", "type", "methode", "fact", "typemeth"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public MiniJaJaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public MiniJaJaParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public MiniJaJaParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return MiniJaJaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/frosqh/workspace/m1comp4/MiniJaJa.g"; }


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:37:1: axiom : fichier EOF -> fichier ;
	public final MiniJaJaParser.axiom_return axiom() throws RecognitionException {
		MiniJaJaParser.axiom_return retval = new MiniJaJaParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try { dbg.enterRule(getGrammarFileName(), "axiom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:37:7: ( fichier EOF -> fichier )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:37:9: fichier EOF
			{
			dbg.location(37,9);
			pushFollow(FOLLOW_fichier_in_axiom156);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());dbg.location(37,17);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom158);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: fichier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:20: -> fichier
			{
				dbg.location(37,23);
				adaptor.addChild(root_0, stream_fichier.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "axiom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:40:1: fichier : ( classe )* ;
	public final MiniJaJaParser.fichier_return fichier() throws RecognitionException {
		MiniJaJaParser.fichier_return retval = new MiniJaJaParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope classe3 =null;


		try { dbg.enterRule(getGrammarFileName(), "fichier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:40:9: ( ( classe )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:40:11: ( classe )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(40,11);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:40:11: ( classe )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==53) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:40:11: classe
					{
					dbg.location(40,11);
					pushFollow(FOLLOW_classe_in_fichier170);
					classe3=classe();
					state._fsp--;

					adaptor.addChild(root_0, classe3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fichier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fichier"


	public static class classe_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classe"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:43:1: classe : 'class' ident '{' decls methmain '}' -> ^( CLASSE ident decls methmain ) ;
	public final MiniJaJaParser.classe_return classe() throws RecognitionException {
		MiniJaJaParser.classe_return retval = new MiniJaJaParser.classe_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal4=null;
		Token char_literal6=null;
		Token char_literal9=null;
		ParserRuleReturnScope ident5 =null;
		ParserRuleReturnScope decls7 =null;
		ParserRuleReturnScope methmain8 =null;

		CommonTree string_literal4_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal9_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_methmain=new RewriteRuleSubtreeStream(adaptor,"rule methmain");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");

		try { dbg.enterRule(getGrammarFileName(), "classe");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:43:8: ( 'class' ident '{' decls methmain '}' -> ^( CLASSE ident decls methmain ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:43:10: 'class' ident '{' decls methmain '}'
			{
			dbg.location(43,10);
			string_literal4=(Token)match(input,53,FOLLOW_53_in_classe181);  
			stream_53.add(string_literal4);
			dbg.location(43,18);
			pushFollow(FOLLOW_ident_in_classe183);
			ident5=ident();
			state._fsp--;

			stream_ident.add(ident5.getTree());dbg.location(43,24);
			char_literal6=(Token)match(input,60,FOLLOW_60_in_classe185);  
			stream_60.add(char_literal6);
			dbg.location(43,27);
			pushFollow(FOLLOW_decls_in_classe186);
			decls7=decls();
			state._fsp--;

			stream_decls.add(decls7.getTree());dbg.location(43,33);
			pushFollow(FOLLOW_methmain_in_classe188);
			methmain8=methmain();
			state._fsp--;

			stream_methmain.add(methmain8.getTree());dbg.location(43,41);
			char_literal9=(Token)match(input,62,FOLLOW_62_in_classe189);  
			stream_62.add(char_literal9);

			// AST REWRITE
			// elements: decls, ident, methmain
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 43:45: -> ^( CLASSE ident decls methmain )
			{
				dbg.location(43,48);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:43:48: ^( CLASSE ident decls methmain )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(43,50);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASSE, "CLASSE"), root_1);
				dbg.location(43,57);
				adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(43,63);
				adaptor.addChild(root_1, stream_decls.nextTree());dbg.location(43,69);
				adaptor.addChild(root_1, stream_methmain.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "classe");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "classe"


	public static class ident_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ident"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:46:1: ident : IDF -> ^( IDENT IDF ) ;
	public final MiniJaJaParser.ident_return ident() throws RecognitionException {
		MiniJaJaParser.ident_return retval = new MiniJaJaParser.ident_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF10=null;

		CommonTree IDF10_tree=null;
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

		try { dbg.enterRule(getGrammarFileName(), "ident");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:46:7: ( IDF -> ^( IDENT IDF ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:46:9: IDF
			{
			dbg.location(46,9);
			IDF10=(Token)match(input,IDF,FOLLOW_IDF_in_ident210);  
			stream_IDF.add(IDF10);

			// AST REWRITE
			// elements: IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 46:13: -> ^( IDENT IDF )
			{
				dbg.location(46,16);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:46:16: ^( IDENT IDF )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(46,18);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT, "IDENT"), root_1);
				dbg.location(46,24);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ident");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ident"


	public static class decls_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decls"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:1: decls : ( decl ';' )* -> ^( DECLS ( decl )* ) ;
	public final MiniJaJaParser.decls_return decls() throws RecognitionException {
		MiniJaJaParser.decls_return retval = new MiniJaJaParser.decls_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		ParserRuleReturnScope decl11 =null;

		CommonTree char_literal12_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try { dbg.enterRule(getGrammarFileName(), "decls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:7: ( ( decl ';' )* -> ^( DECLS ( decl )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:9: ( decl ';' )*
			{
			dbg.location(49,9);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:9: ( decl ';' )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==TYPE||LA2_0==VOID||LA2_0==55) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:10: decl ';'
					{
					dbg.location(49,10);
					pushFollow(FOLLOW_decl_in_decls228);
					decl11=decl();
					state._fsp--;

					stream_decl.add(decl11.getTree());dbg.location(49,15);
					char_literal12=(Token)match(input,47,FOLLOW_47_in_decls230);  
					stream_47.add(char_literal12);

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			// AST REWRITE
			// elements: decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 49:21: -> ^( DECLS ( decl )* )
			{
				dbg.location(49,24);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:24: ^( DECLS ( decl )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(49,26);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLS, "DECLS"), root_1);
				dbg.location(49,32);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:49:32: ( decl )*
				while ( stream_decl.hasNext() ) {
					dbg.location(49,32);
					adaptor.addChild(root_1, stream_decl.nextTree());
				}
				stream_decl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decls"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:1: decl : ( typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) ) | finalvar );
	public final MiniJaJaParser.decl_return decl() throws RecognitionException {
		MiniJaJaParser.decl_return retval = new MiniJaJaParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		Token char_literal18=null;
		ParserRuleReturnScope typemeth13 =null;
		ParserRuleReturnScope ident14 =null;
		ParserRuleReturnScope vexp15 =null;
		ParserRuleReturnScope exp17 =null;
		ParserRuleReturnScope methode19 =null;
		ParserRuleReturnScope finalvar20 =null;

		CommonTree char_literal16_tree=null;
		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_methode=new RewriteRuleSubtreeStream(adaptor,"rule methode");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
		RewriteRuleSubtreeStream stream_typemeth=new RewriteRuleSubtreeStream(adaptor,"rule typemeth");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:6: ( typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) ) | finalvar )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==TYPE||LA5_0==VOID) ) {
				alt5=1;
			}
			else if ( (LA5_0==55) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:8: typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) )
					{
					dbg.location(52,8);
					pushFollow(FOLLOW_typemeth_in_decl250);
					typemeth13=typemeth();
					state._fsp--;

					stream_typemeth.add(typemeth13.getTree());dbg.location(52,17);
					pushFollow(FOLLOW_ident_in_decl252);
					ident14=ident();
					state._fsp--;

					stream_ident.add(ident14.getTree());dbg.location(52,23);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:23: ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) )
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= 47 && LA4_0 <= 48)||LA4_0==51) ) {
						alt4=1;
					}
					else if ( (LA4_0==38) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:24: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
							{
							dbg.location(52,24);
							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:24: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
							int alt3=2;
							try { dbg.enterSubRule(3);
							try { dbg.enterDecision(3, decisionCanBacktrack[3]);

							int LA3_0 = input.LA(1);
							if ( ((LA3_0 >= 47 && LA3_0 <= 48)) ) {
								alt3=1;
							}
							else if ( (LA3_0==51) ) {
								alt3=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(3);}

							switch (alt3) {
								case 1 :
									dbg.enterAlt(1);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:25: vexp
									{
									dbg.location(52,25);
									pushFollow(FOLLOW_vexp_in_decl256);
									vexp15=vexp();
									state._fsp--;

									stream_vexp.add(vexp15.getTree());
									// AST REWRITE
									// elements: ident, vexp, typemeth
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 52:30: -> ^( VAR ident typemeth vexp )
									{
										dbg.location(52,33);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:33: ^( VAR ident typemeth vexp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(52,35);
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
										dbg.location(52,39);
										adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(52,45);
										adaptor.addChild(root_1, stream_typemeth.nextTree());dbg.location(52,54);
										adaptor.addChild(root_1, stream_vexp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:62: '[' exp ']'
									{
									dbg.location(52,62);
									char_literal16=(Token)match(input,51,FOLLOW_51_in_decl272);  
									stream_51.add(char_literal16);
									dbg.location(52,66);
									pushFollow(FOLLOW_exp_in_decl274);
									exp17=exp();
									state._fsp--;

									stream_exp.add(exp17.getTree());dbg.location(52,70);
									char_literal18=(Token)match(input,52,FOLLOW_52_in_decl276);  
									stream_52.add(char_literal18);

									// AST REWRITE
									// elements: ident, exp, typemeth
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 52:74: -> ^( TABLEAU ident typemeth exp )
									{
										dbg.location(52,77);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:77: ^( TABLEAU ident typemeth exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(52,79);
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLEAU, "TABLEAU"), root_1);
										dbg.location(52,87);
										adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(52,93);
										adaptor.addChild(root_1, stream_typemeth.nextTree());dbg.location(52,102);
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}
							} finally {dbg.exitSubRule(3);}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:110: methode
							{
							dbg.location(52,110);
							pushFollow(FOLLOW_methode_in_decl293);
							methode19=methode();
							state._fsp--;

							stream_methode.add(methode19.getTree());
							// AST REWRITE
							// elements: methode, typemeth, ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 52:117: -> ^( METH typemeth ident ( methode )? )
							{
								dbg.location(52,120);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:120: ^( METH typemeth ident ( methode )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(52,122);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH, "METH"), root_1);
								dbg.location(52,127);
								adaptor.addChild(root_1, stream_typemeth.nextTree());dbg.location(52,136);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(52,143);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:143: ( methode )?
								if ( stream_methode.hasNext() ) {
									dbg.location(52,143);
									adaptor.addChild(root_1, stream_methode.nextTree());
								}
								stream_methode.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:52:156: finalvar
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(52,156);
					pushFollow(FOLLOW_finalvar_in_decl311);
					finalvar20=finalvar();
					state._fsp--;

					adaptor.addChild(root_0, finalvar20.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(53, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class varz_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varz"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:1: varz : ( vars ';' )* -> ^( VARS ( vars )* ) ;
	public final MiniJaJaParser.varz_return varz() throws RecognitionException {
		MiniJaJaParser.varz_return retval = new MiniJaJaParser.varz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal22=null;
		ParserRuleReturnScope vars21 =null;

		CommonTree char_literal22_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "varz");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:7: ( ( vars ';' )* -> ^( VARS ( vars )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:10: ( vars ';' )*
			{
			dbg.location(55,10);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:10: ( vars ';' )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==TYPE||LA6_0==VOID||LA6_0==55) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:11: vars ';'
					{
					dbg.location(55,11);
					pushFollow(FOLLOW_vars_in_varz323);
					vars21=vars();
					state._fsp--;

					stream_vars.add(vars21.getTree());dbg.location(55,16);
					char_literal22=(Token)match(input,47,FOLLOW_47_in_varz325);  
					stream_47.add(char_literal22);

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			// AST REWRITE
			// elements: vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 55:22: -> ^( VARS ( vars )* )
			{
				dbg.location(55,25);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:25: ^( VARS ( vars )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(55,27);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARS, "VARS"), root_1);
				dbg.location(55,32);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:55:32: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(55,32);
					adaptor.addChild(root_1, stream_vars.nextTree());
				}
				stream_vars.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varz");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "varz"


	public static class vars_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:1: vars : ( typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | finalvar );
	public final MiniJaJaParser.vars_return vars() throws RecognitionException {
		MiniJaJaParser.vars_return retval = new MiniJaJaParser.vars_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal26=null;
		Token char_literal28=null;
		ParserRuleReturnScope typemeth23 =null;
		ParserRuleReturnScope ident24 =null;
		ParserRuleReturnScope vexp25 =null;
		ParserRuleReturnScope exp27 =null;
		ParserRuleReturnScope finalvar29 =null;

		CommonTree char_literal26_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
		RewriteRuleSubtreeStream stream_typemeth=new RewriteRuleSubtreeStream(adaptor,"rule typemeth");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:6: ( typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | finalvar )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==TYPE||LA8_0==VOID) ) {
				alt8=1;
			}
			else if ( (LA8_0==55) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:8: typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
					{
					dbg.location(58,8);
					pushFollow(FOLLOW_typemeth_in_vars346);
					typemeth23=typemeth();
					state._fsp--;

					stream_typemeth.add(typemeth23.getTree());dbg.location(58,17);
					pushFollow(FOLLOW_ident_in_vars348);
					ident24=ident();
					state._fsp--;

					stream_ident.add(ident24.getTree());dbg.location(58,23);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:23: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 47 && LA7_0 <= 48)) ) {
						alt7=1;
					}
					else if ( (LA7_0==51) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:24: vexp
							{
							dbg.location(58,24);
							pushFollow(FOLLOW_vexp_in_vars351);
							vexp25=vexp();
							state._fsp--;

							stream_vexp.add(vexp25.getTree());
							// AST REWRITE
							// elements: ident, vexp, typemeth
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 58:29: -> ^( VAR ident typemeth vexp )
							{
								dbg.location(58,32);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:32: ^( VAR ident typemeth vexp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(58,34);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
								dbg.location(58,38);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(58,44);
								adaptor.addChild(root_1, stream_typemeth.nextTree());dbg.location(58,53);
								adaptor.addChild(root_1, stream_vexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:61: '[' exp ']'
							{
							dbg.location(58,61);
							char_literal26=(Token)match(input,51,FOLLOW_51_in_vars367);  
							stream_51.add(char_literal26);
							dbg.location(58,65);
							pushFollow(FOLLOW_exp_in_vars369);
							exp27=exp();
							state._fsp--;

							stream_exp.add(exp27.getTree());dbg.location(58,69);
							char_literal28=(Token)match(input,52,FOLLOW_52_in_vars371);  
							stream_52.add(char_literal28);

							// AST REWRITE
							// elements: exp, ident, typemeth
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 58:73: -> ^( TABLEAU ident typemeth exp )
							{
								dbg.location(58,76);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:58:76: ^( TABLEAU ident typemeth exp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(58,78);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLEAU, "TABLEAU"), root_1);
								dbg.location(58,86);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(58,92);
								adaptor.addChild(root_1, stream_typemeth.nextTree());dbg.location(58,101);
								adaptor.addChild(root_1, stream_exp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:59:4: finalvar
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(59,4);
					pushFollow(FOLLOW_finalvar_in_vars389);
					finalvar29=finalvar();
					state._fsp--;

					adaptor.addChild(root_0, finalvar29.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vars"


	public static class finalvar_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "finalvar"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:62:1: finalvar : 'final' type ident vexp -> ^( CST type ident vexp ) ;
	public final MiniJaJaParser.finalvar_return finalvar() throws RecognitionException {
		MiniJaJaParser.finalvar_return retval = new MiniJaJaParser.finalvar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal30=null;
		ParserRuleReturnScope type31 =null;
		ParserRuleReturnScope ident32 =null;
		ParserRuleReturnScope vexp33 =null;

		CommonTree string_literal30_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "finalvar");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:62:10: ( 'final' type ident vexp -> ^( CST type ident vexp ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:62:12: 'final' type ident vexp
			{
			dbg.location(62,12);
			string_literal30=(Token)match(input,55,FOLLOW_55_in_finalvar398);  
			stream_55.add(string_literal30);
			dbg.location(62,20);
			pushFollow(FOLLOW_type_in_finalvar400);
			type31=type();
			state._fsp--;

			stream_type.add(type31.getTree());dbg.location(62,25);
			pushFollow(FOLLOW_ident_in_finalvar402);
			ident32=ident();
			state._fsp--;

			stream_ident.add(ident32.getTree());dbg.location(62,31);
			pushFollow(FOLLOW_vexp_in_finalvar404);
			vexp33=vexp();
			state._fsp--;

			stream_vexp.add(vexp33.getTree());
			// AST REWRITE
			// elements: ident, vexp, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 62:36: -> ^( CST type ident vexp )
			{
				dbg.location(62,39);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:62:39: ^( CST type ident vexp )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(62,41);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CST, "CST"), root_1);
				dbg.location(62,45);
				adaptor.addChild(root_1, stream_type.nextTree());dbg.location(62,50);
				adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(62,56);
				adaptor.addChild(root_1, stream_vexp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "finalvar");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "finalvar"


	public static class vexp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vexp"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:65:1: vexp : ( '=' exp -> exp | -> VIDE );
	public final MiniJaJaParser.vexp_return vexp() throws RecognitionException {
		MiniJaJaParser.vexp_return retval = new MiniJaJaParser.vexp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal34=null;
		ParserRuleReturnScope exp35 =null;

		CommonTree char_literal34_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "vexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:65:6: ( '=' exp -> exp | -> VIDE )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==48) ) {
				alt9=1;
			}
			else if ( (LA9_0==47) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:65:8: '=' exp
					{
					dbg.location(65,8);
					char_literal34=(Token)match(input,48,FOLLOW_48_in_vexp425);  
					stream_48.add(char_literal34);
					dbg.location(65,12);
					pushFollow(FOLLOW_exp_in_vexp427);
					exp35=exp();
					state._fsp--;

					stream_exp.add(exp35.getTree());
					// AST REWRITE
					// elements: exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 65:16: -> exp
					{
						dbg.location(65,19);
						adaptor.addChild(root_0, stream_exp.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:66:4: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 66:4: -> VIDE
					{
						dbg.location(66,7);
						adaptor.addChild(root_0, (CommonTree)adaptor.create(VIDE, "VIDE"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vexp"


	public static class methode_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methode"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:1: methode : '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}' -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )? ;
	public final MiniJaJaParser.methode_return methode() throws RecognitionException {
		MiniJaJaParser.methode_return retval = new MiniJaJaParser.methode_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		Token char_literal39=null;
		Token char_literal42=null;
		Token char_literal43=null;
		Token char_literal46=null;
		ParserRuleReturnScope type37 =null;
		ParserRuleReturnScope ident38 =null;
		ParserRuleReturnScope type40 =null;
		ParserRuleReturnScope ident41 =null;
		ParserRuleReturnScope varz44 =null;
		ParserRuleReturnScope instrs45 =null;

		CommonTree char_literal36_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree char_literal42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_varz=new RewriteRuleSubtreeStream(adaptor,"rule varz");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "methode");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:9: ( '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}' -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:11: '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}'
			{
			dbg.location(69,11);
			char_literal36=(Token)match(input,38,FOLLOW_38_in_methode447);  
			stream_38.add(char_literal36);
			dbg.location(69,15);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:15: ( type ident ( ',' type ident )* )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==TYPE) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:16: type ident ( ',' type ident )*
					{
					dbg.location(69,16);
					pushFollow(FOLLOW_type_in_methode450);
					type37=type();
					state._fsp--;

					stream_type.add(type37.getTree());dbg.location(69,21);
					pushFollow(FOLLOW_ident_in_methode452);
					ident38=ident();
					state._fsp--;

					stream_ident.add(ident38.getTree());dbg.location(69,27);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:27: ( ',' type ident )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==44) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:28: ',' type ident
							{
							dbg.location(69,28);
							char_literal39=(Token)match(input,44,FOLLOW_44_in_methode455);  
							stream_44.add(char_literal39);
							dbg.location(69,32);
							pushFollow(FOLLOW_type_in_methode457);
							type40=type();
							state._fsp--;

							stream_type.add(type40.getTree());dbg.location(69,37);
							pushFollow(FOLLOW_ident_in_methode459);
							ident41=ident();
							state._fsp--;

							stream_ident.add(ident41.getTree());
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(69,48);
			char_literal42=(Token)match(input,39,FOLLOW_39_in_methode466);  
			stream_39.add(char_literal42);
			dbg.location(69,52);
			char_literal43=(Token)match(input,60,FOLLOW_60_in_methode468);  
			stream_60.add(char_literal43);
			dbg.location(69,55);
			pushFollow(FOLLOW_varz_in_methode469);
			varz44=varz();
			state._fsp--;

			stream_varz.add(varz44.getTree());dbg.location(69,60);
			pushFollow(FOLLOW_instrs_in_methode471);
			instrs45=instrs();
			state._fsp--;

			stream_instrs.add(instrs45.getTree());dbg.location(69,66);
			char_literal46=(Token)match(input,62,FOLLOW_62_in_methode472);  
			stream_62.add(char_literal46);

			// AST REWRITE
			// elements: instrs, varz, type, ident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:70: -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )?
			{
				dbg.location(69,73);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:73: ( ^( PARAM type ident ) )*
				while ( stream_type.hasNext()||stream_ident.hasNext() ) {
					dbg.location(69,73);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:73: ^( PARAM type ident )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(69,75);
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
					dbg.location(69,81);
					adaptor.addChild(root_1, stream_type.nextTree());dbg.location(69,86);
					adaptor.addChild(root_1, stream_ident.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_ident.reset();
				dbg.location(69,94);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:94: ( varz )?
				if ( stream_varz.hasNext() ) {
					dbg.location(69,94);
					adaptor.addChild(root_0, stream_varz.nextTree());
				}
				stream_varz.reset();
				dbg.location(69,100);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:69:100: ( instrs )?
				if ( stream_instrs.hasNext() ) {
					dbg.location(69,100);
					adaptor.addChild(root_0, stream_instrs.nextTree());
				}
				stream_instrs.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "methode");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "methode"


	public static class methmain_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methmain"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:1: methmain : 'main' '{' varz instrs '}' -> ^( 'main' ( varz )? ( instrs )? ) ;
	public final MiniJaJaParser.methmain_return methmain() throws RecognitionException {
		MiniJaJaParser.methmain_return retval = new MiniJaJaParser.methmain_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal47=null;
		Token char_literal48=null;
		Token char_literal51=null;
		ParserRuleReturnScope varz49 =null;
		ParserRuleReturnScope instrs50 =null;

		CommonTree string_literal47_tree=null;
		CommonTree char_literal48_tree=null;
		CommonTree char_literal51_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_varz=new RewriteRuleSubtreeStream(adaptor,"rule varz");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");

		try { dbg.enterRule(getGrammarFileName(), "methmain");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:10: ( 'main' '{' varz instrs '}' -> ^( 'main' ( varz )? ( instrs )? ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:12: 'main' '{' varz instrs '}'
			{
			dbg.location(72,12);
			string_literal47=(Token)match(input,57,FOLLOW_57_in_methmain498);  
			stream_57.add(string_literal47);
			dbg.location(72,19);
			char_literal48=(Token)match(input,60,FOLLOW_60_in_methmain500);  
			stream_60.add(char_literal48);
			dbg.location(72,22);
			pushFollow(FOLLOW_varz_in_methmain501);
			varz49=varz();
			state._fsp--;

			stream_varz.add(varz49.getTree());dbg.location(72,27);
			pushFollow(FOLLOW_instrs_in_methmain503);
			instrs50=instrs();
			state._fsp--;

			stream_instrs.add(instrs50.getTree());dbg.location(72,33);
			char_literal51=(Token)match(input,62,FOLLOW_62_in_methmain504);  
			stream_62.add(char_literal51);

			// AST REWRITE
			// elements: varz, 57, instrs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 72:37: -> ^( 'main' ( varz )? ( instrs )? )
			{
				dbg.location(72,40);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:40: ^( 'main' ( varz )? ( instrs )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,42);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_57.nextNode(), root_1);
				dbg.location(72,49);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:49: ( varz )?
				if ( stream_varz.hasNext() ) {
					dbg.location(72,49);
					adaptor.addChild(root_1, stream_varz.nextTree());
				}
				stream_varz.reset();
				dbg.location(72,55);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:72:55: ( instrs )?
				if ( stream_instrs.hasNext() ) {
					dbg.location(72,55);
					adaptor.addChild(root_1, stream_instrs.nextTree());
				}
				stream_instrs.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "methmain");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "methmain"


	public static class instrs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instrs"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:1: instrs : ( instr ';' )* -> ^( INSTRS ( instr )* ) ;
	public final MiniJaJaParser.instrs_return instrs() throws RecognitionException {
		MiniJaJaParser.instrs_return retval = new MiniJaJaParser.instrs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal53=null;
		ParserRuleReturnScope instr52 =null;

		CommonTree char_literal53_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");

		try { dbg.enterRule(getGrammarFileName(), "instrs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:8: ( ( instr ';' )* -> ^( INSTRS ( instr )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:9: ( instr ';' )*
			{
			dbg.location(75,9);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:9: ( instr ';' )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==IDF||LA12_0==56||(LA12_0 >= 58 && LA12_0 <= 59)) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:10: instr ';'
					{
					dbg.location(75,10);
					pushFollow(FOLLOW_instr_in_instrs525);
					instr52=instr();
					state._fsp--;

					stream_instr.add(instr52.getTree());dbg.location(75,16);
					char_literal53=(Token)match(input,47,FOLLOW_47_in_instrs527);  
					stream_47.add(char_literal53);

					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: instr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 75:22: -> ^( INSTRS ( instr )* )
			{
				dbg.location(75,25);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:25: ^( INSTRS ( instr )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(75,27);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRS, "INSTRS"), root_1);
				dbg.location(75,34);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:75:34: ( instr )*
				while ( stream_instr.hasNext() ) {
					dbg.location(75,34);
					adaptor.addChild(root_1, stream_instr.nextTree());
				}
				stream_instr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instrs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instrs"


	public static class instr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instr"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:78:1: instr : ( ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) ) ) | 'return' exp -> ^( RETOUR exp ) | 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )? -> ^( SI exp instrs ( instrs )? ) | 'while' '(' exp ')' '{' instrs '}' -> ^( TANTQUE exp ( instrs )? ) );
	public final MiniJaJaParser.instr_return instr() throws RecognitionException {
		MiniJaJaParser.instr_return retval = new MiniJaJaParser.instr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		Token string_literal57=null;
		Token string_literal58=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal65=null;
		Token char_literal66=null;
		Token string_literal68=null;
		Token string_literal69=null;
		Token string_literal71=null;
		Token string_literal73=null;
		Token char_literal75=null;
		Token char_literal77=null;
		Token string_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		Token string_literal82=null;
		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope ident54 =null;
		ParserRuleReturnScope exp56 =null;
		ParserRuleReturnScope exp59 =null;
		ParserRuleReturnScope listexp61 =null;
		ParserRuleReturnScope exp64 =null;
		ParserRuleReturnScope exp67 =null;
		ParserRuleReturnScope exp70 =null;
		ParserRuleReturnScope exp72 =null;
		ParserRuleReturnScope exp74 =null;
		ParserRuleReturnScope instrs76 =null;
		ParserRuleReturnScope instrs80 =null;
		ParserRuleReturnScope exp84 =null;
		ParserRuleReturnScope instrs87 =null;

		CommonTree char_literal55_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree string_literal58_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal65_tree=null;
		CommonTree char_literal66_tree=null;
		CommonTree string_literal68_tree=null;
		CommonTree string_literal69_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal73_tree=null;
		CommonTree char_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree string_literal78_tree=null;
		CommonTree char_literal79_tree=null;
		CommonTree char_literal81_tree=null;
		CommonTree string_literal82_tree=null;
		CommonTree char_literal83_tree=null;
		CommonTree char_literal85_tree=null;
		CommonTree char_literal86_tree=null;
		CommonTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_listexp=new RewriteRuleSubtreeStream(adaptor,"rule listexp");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "instr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:78:7: ( ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) ) ) | 'return' exp -> ^( RETOUR exp ) | 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )? -> ^( SI exp instrs ( instrs )? ) | 'while' '(' exp ')' '{' instrs '}' -> ^( TANTQUE exp ( instrs )? ) )
			int alt17=4;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt17=1;
				}
				break;
			case 58:
				{
				alt17=2;
				}
				break;
			case 56:
				{
				alt17=3;
				}
				break;
			case 59:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:78:10: ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) ) )
					{
					dbg.location(78,10);
					pushFollow(FOLLOW_ident_in_instr548);
					ident54=ident();
					state._fsp--;

					stream_ident.add(ident54.getTree());dbg.location(78,15);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:78:15: ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) ) )
					int alt15=3;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					switch ( input.LA(1) ) {
					case 42:
					case 43:
					case 48:
						{
						alt15=1;
						}
						break;
					case 38:
						{
						alt15=2;
						}
						break;
					case 51:
						{
						alt15=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:6: ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) )
							{
							dbg.location(79,6);
							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:6: ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) )
							int alt13=3;
							try { dbg.enterSubRule(13);
							try { dbg.enterDecision(13, decisionCanBacktrack[13]);

							switch ( input.LA(1) ) {
							case 48:
								{
								alt13=1;
								}
								break;
							case 42:
								{
								alt13=2;
								}
								break;
							case 43:
								{
								alt13=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 13, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}
							} finally {dbg.exitDecision(13);}

							switch (alt13) {
								case 1 :
									dbg.enterAlt(1);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:7: '=' exp
									{
									dbg.location(79,7);
									char_literal55=(Token)match(input,48,FOLLOW_48_in_instr559);  
									stream_48.add(char_literal55);
									dbg.location(79,11);
									pushFollow(FOLLOW_exp_in_instr561);
									exp56=exp();
									state._fsp--;

									stream_exp.add(exp56.getTree());
									// AST REWRITE
									// elements: exp, ident
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 79:15: -> ^( AFFECTATION ident exp )
									{
										dbg.location(79,18);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:18: ^( AFFECTATION ident exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(79,20);
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);
										dbg.location(79,32);
										adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(79,38);
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:46: '++'
									{
									dbg.location(79,46);
									string_literal57=(Token)match(input,42,FOLLOW_42_in_instr576);  
									stream_42.add(string_literal57);

									// AST REWRITE
									// elements: ident
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 79:51: -> ^( INCREMENT ident )
									{
										dbg.location(79,54);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:54: ^( INCREMENT ident )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(79,56);
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCREMENT, "INCREMENT"), root_1);
										dbg.location(79,66);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 3 :
									dbg.enterAlt(3);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:75: '+=' exp
									{
									dbg.location(79,75);
									string_literal58=(Token)match(input,43,FOLLOW_43_in_instr588);  
									stream_43.add(string_literal58);
									dbg.location(79,80);
									pushFollow(FOLLOW_exp_in_instr590);
									exp59=exp();
									state._fsp--;

									stream_exp.add(exp59.getTree());
									// AST REWRITE
									// elements: ident, exp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 79:84: -> ^( SOMME ident exp )
									{
										dbg.location(79,87);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:79:87: ^( SOMME ident exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(79,89);
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SOMME, "SOMME"), root_1);
										dbg.location(79,95);
										adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(79,101);
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}
							} finally {dbg.exitSubRule(13);}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:80:8: '(' listexp ')'
							{
							dbg.location(80,8);
							char_literal60=(Token)match(input,38,FOLLOW_38_in_instr611);  
							stream_38.add(char_literal60);
							dbg.location(80,11);
							pushFollow(FOLLOW_listexp_in_instr612);
							listexp61=listexp();
							state._fsp--;

							stream_listexp.add(listexp61.getTree());dbg.location(80,18);
							char_literal62=(Token)match(input,39,FOLLOW_39_in_instr613);  
							stream_39.add(char_literal62);

							// AST REWRITE
							// elements: ident, listexp
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 80:22: -> ^( APPELI ident ( listexp )? )
							{
								dbg.location(80,25);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:80:25: ^( APPELI ident ( listexp )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(80,27);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPELI, "APPELI"), root_1);
								dbg.location(80,34);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(80,40);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:80:40: ( listexp )?
								if ( stream_listexp.hasNext() ) {
									dbg.location(80,40);
									adaptor.addChild(root_1, stream_listexp.nextTree());
								}
								stream_listexp.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:9: '[' exp ']' ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) )
							{
							dbg.location(81,9);
							char_literal63=(Token)match(input,51,FOLLOW_51_in_instr634);  
							stream_51.add(char_literal63);
							dbg.location(81,12);
							pushFollow(FOLLOW_exp_in_instr635);
							exp64=exp();
							state._fsp--;

							stream_exp.add(exp64.getTree());dbg.location(81,15);
							char_literal65=(Token)match(input,52,FOLLOW_52_in_instr636);  
							stream_52.add(char_literal65);
							dbg.location(81,19);
							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:19: ( '=' exp -> ^( '=' ^( TAB ident ( exp )? ) exp ) | '++' -> ^( '++' ^( TAB ident exp ) ) | '+=' exp -> ^( '+=' ^( TAB ident ( exp )? ) exp ) )
							int alt14=3;
							try { dbg.enterSubRule(14);
							try { dbg.enterDecision(14, decisionCanBacktrack[14]);

							switch ( input.LA(1) ) {
							case 48:
								{
								alt14=1;
								}
								break;
							case 42:
								{
								alt14=2;
								}
								break;
							case 43:
								{
								alt14=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 14, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}
							} finally {dbg.exitDecision(14);}

							switch (alt14) {
								case 1 :
									dbg.enterAlt(1);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:20: '=' exp
									{
									dbg.location(81,20);
									char_literal66=(Token)match(input,48,FOLLOW_48_in_instr639);  
									stream_48.add(char_literal66);
									dbg.location(81,24);
									pushFollow(FOLLOW_exp_in_instr641);
									exp67=exp();
									state._fsp--;

									stream_exp.add(exp67.getTree());
									// AST REWRITE
									// elements: 48, exp, ident, exp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 81:28: -> ^( '=' ^( TAB ident ( exp )? ) exp )
									{
										dbg.location(81,31);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:31: ^( '=' ^( TAB ident ( exp )? ) exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(81,33);
										root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
										dbg.location(81,37);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:37: ^( TAB ident ( exp )? )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										dbg.location(81,39);
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										dbg.location(81,43);
										adaptor.addChild(root_2, stream_ident.nextTree());dbg.location(81,49);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:49: ( exp )?
										if ( stream_exp.hasNext() ) {
											dbg.location(81,49);
											adaptor.addChild(root_2, stream_exp.nextTree());
										}
										stream_exp.reset();

										adaptor.addChild(root_1, root_2);
										}
										dbg.location(81,55);
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:60: '++'
									{
									dbg.location(81,60);
									string_literal68=(Token)match(input,42,FOLLOW_42_in_instr660);  
									stream_42.add(string_literal68);

									// AST REWRITE
									// elements: 42, ident, exp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 81:65: -> ^( '++' ^( TAB ident exp ) )
									{
										dbg.location(81,68);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:68: ^( '++' ^( TAB ident exp ) )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(81,70);
										root_1 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_1);
										dbg.location(81,75);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:75: ^( TAB ident exp )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										dbg.location(81,77);
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										dbg.location(81,81);
										adaptor.addChild(root_2, stream_ident.nextTree());dbg.location(81,87);
										adaptor.addChild(root_2, stream_exp.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 3 :
									dbg.enterAlt(3);

									// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:95: '+=' exp
									{
									dbg.location(81,95);
									string_literal69=(Token)match(input,43,FOLLOW_43_in_instr678);  
									stream_43.add(string_literal69);
									dbg.location(81,100);
									pushFollow(FOLLOW_exp_in_instr680);
									exp70=exp();
									state._fsp--;

									stream_exp.add(exp70.getTree());
									// AST REWRITE
									// elements: 43, exp, ident, exp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 81:104: -> ^( '+=' ^( TAB ident ( exp )? ) exp )
									{
										dbg.location(81,107);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:107: ^( '+=' ^( TAB ident ( exp )? ) exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										dbg.location(81,109);
										root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
										dbg.location(81,114);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:114: ^( TAB ident ( exp )? )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										dbg.location(81,116);
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										dbg.location(81,121);
										adaptor.addChild(root_2, stream_ident.nextTree());dbg.location(81,127);
										// /home/frosqh/workspace/m1comp4/MiniJaJa.g:81:127: ( exp )?
										if ( stream_exp.hasNext() ) {
											dbg.location(81,127);
											adaptor.addChild(root_2, stream_exp.nextTree());
										}
										stream_exp.reset();

										adaptor.addChild(root_1, root_2);
										}
										dbg.location(81,133);
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}
							} finally {dbg.exitSubRule(14);}

							}
							break;

					}
					} finally {dbg.exitSubRule(15);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:83:5: 'return' exp
					{
					dbg.location(83,5);
					string_literal71=(Token)match(input,58,FOLLOW_58_in_instr711);  
					stream_58.add(string_literal71);
					dbg.location(83,14);
					pushFollow(FOLLOW_exp_in_instr713);
					exp72=exp();
					state._fsp--;

					stream_exp.add(exp72.getTree());
					// AST REWRITE
					// elements: exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:18: -> ^( RETOUR exp )
					{
						dbg.location(83,21);
						// /home/frosqh/workspace/m1comp4/MiniJaJa.g:83:21: ^( RETOUR exp )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(83,23);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETOUR, "RETOUR"), root_1);
						dbg.location(83,30);
						adaptor.addChild(root_1, stream_exp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:84:5: 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )?
					{
					dbg.location(84,5);
					string_literal73=(Token)match(input,56,FOLLOW_56_in_instr727);  
					stream_56.add(string_literal73);
					dbg.location(84,10);
					pushFollow(FOLLOW_exp_in_instr729);
					exp74=exp();
					state._fsp--;

					stream_exp.add(exp74.getTree());dbg.location(84,14);
					char_literal75=(Token)match(input,60,FOLLOW_60_in_instr731);  
					stream_60.add(char_literal75);
					dbg.location(84,18);
					pushFollow(FOLLOW_instrs_in_instr733);
					instrs76=instrs();
					state._fsp--;

					stream_instrs.add(instrs76.getTree());dbg.location(84,25);
					char_literal77=(Token)match(input,62,FOLLOW_62_in_instr735);  
					stream_62.add(char_literal77);
					dbg.location(84,29);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:84:29: ( 'else' '{' instrs '}' )?
					int alt16=2;
					try { dbg.enterSubRule(16);
					try { dbg.enterDecision(16, decisionCanBacktrack[16]);

					int LA16_0 = input.LA(1);
					if ( (LA16_0==54) ) {
						alt16=1;
					}
					} finally {dbg.exitDecision(16);}

					switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:84:30: 'else' '{' instrs '}'
							{
							dbg.location(84,30);
							string_literal78=(Token)match(input,54,FOLLOW_54_in_instr738);  
							stream_54.add(string_literal78);
							dbg.location(84,37);
							char_literal79=(Token)match(input,60,FOLLOW_60_in_instr740);  
							stream_60.add(char_literal79);
							dbg.location(84,41);
							pushFollow(FOLLOW_instrs_in_instr742);
							instrs80=instrs();
							state._fsp--;

							stream_instrs.add(instrs80.getTree());dbg.location(84,48);
							char_literal81=(Token)match(input,62,FOLLOW_62_in_instr744);  
							stream_62.add(char_literal81);

							}
							break;

					}
					} finally {dbg.exitSubRule(16);}

					// AST REWRITE
					// elements: instrs, exp, instrs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 84:55: -> ^( SI exp instrs ( instrs )? )
					{
						dbg.location(84,58);
						// /home/frosqh/workspace/m1comp4/MiniJaJa.g:84:58: ^( SI exp instrs ( instrs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(84,60);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SI, "SI"), root_1);
						dbg.location(84,63);
						adaptor.addChild(root_1, stream_exp.nextTree());dbg.location(84,67);
						adaptor.addChild(root_1, stream_instrs.nextTree());dbg.location(84,74);
						// /home/frosqh/workspace/m1comp4/MiniJaJa.g:84:74: ( instrs )?
						if ( stream_instrs.hasNext() ) {
							dbg.location(84,74);
							adaptor.addChild(root_1, stream_instrs.nextTree());
						}
						stream_instrs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:85:5: 'while' '(' exp ')' '{' instrs '}'
					{
					dbg.location(85,5);
					string_literal82=(Token)match(input,59,FOLLOW_59_in_instr766);  
					stream_59.add(string_literal82);
					dbg.location(85,13);
					char_literal83=(Token)match(input,38,FOLLOW_38_in_instr768);  
					stream_38.add(char_literal83);
					dbg.location(85,16);
					pushFollow(FOLLOW_exp_in_instr769);
					exp84=exp();
					state._fsp--;

					stream_exp.add(exp84.getTree());dbg.location(85,19);
					char_literal85=(Token)match(input,39,FOLLOW_39_in_instr770);  
					stream_39.add(char_literal85);
					dbg.location(85,23);
					char_literal86=(Token)match(input,60,FOLLOW_60_in_instr772);  
					stream_60.add(char_literal86);
					dbg.location(85,26);
					pushFollow(FOLLOW_instrs_in_instr773);
					instrs87=instrs();
					state._fsp--;

					stream_instrs.add(instrs87.getTree());dbg.location(85,32);
					char_literal88=(Token)match(input,62,FOLLOW_62_in_instr774);  
					stream_62.add(char_literal88);

					// AST REWRITE
					// elements: exp, instrs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 85:36: -> ^( TANTQUE exp ( instrs )? )
					{
						dbg.location(85,39);
						// /home/frosqh/workspace/m1comp4/MiniJaJa.g:85:39: ^( TANTQUE exp ( instrs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(85,41);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TANTQUE, "TANTQUE"), root_1);
						dbg.location(85,49);
						adaptor.addChild(root_1, stream_exp.nextTree());dbg.location(85,53);
						// /home/frosqh/workspace/m1comp4/MiniJaJa.g:85:53: ( instrs )?
						if ( stream_instrs.hasNext() ) {
							dbg.location(85,53);
							adaptor.addChild(root_1, stream_instrs.nextTree());
						}
						stream_instrs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instr"


	public static class listexp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listexp"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:1: listexp : ( exp ( ',' exp )* )? -> ^( LISTEXP ( exp )* ) ;
	public final MiniJaJaParser.listexp_return listexp() throws RecognitionException {
		MiniJaJaParser.listexp_return retval = new MiniJaJaParser.listexp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal90=null;
		ParserRuleReturnScope exp89 =null;
		ParserRuleReturnScope exp91 =null;

		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "listexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:9: ( ( exp ( ',' exp )* )? -> ^( LISTEXP ( exp )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:11: ( exp ( ',' exp )* )?
			{
			dbg.location(96,11);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:11: ( exp ( ',' exp )* )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==BOOL||LA19_0==IDF||LA19_0==INT||LA19_0==36||LA19_0==38||LA19_0==45) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:12: exp ( ',' exp )*
					{
					dbg.location(96,12);
					pushFollow(FOLLOW_exp_in_listexp798);
					exp89=exp();
					state._fsp--;

					stream_exp.add(exp89.getTree());dbg.location(96,16);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:16: ( ',' exp )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==44) ) {
							alt18=1;
						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:17: ',' exp
							{
							dbg.location(96,17);
							char_literal90=(Token)match(input,44,FOLLOW_44_in_listexp801);  
							stream_44.add(char_literal90);
							dbg.location(96,21);
							pushFollow(FOLLOW_exp_in_listexp803);
							exp91=exp();
							state._fsp--;

							stream_exp.add(exp91.getTree());
							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}

			// AST REWRITE
			// elements: exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 96:29: -> ^( LISTEXP ( exp )* )
			{
				dbg.location(96,32);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:32: ^( LISTEXP ( exp )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(96,34);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTEXP, "LISTEXP"), root_1);
				dbg.location(96,42);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:96:42: ( exp )*
				while ( stream_exp.hasNext() ) {
					dbg.location(96,42);
					adaptor.addChild(root_1, stream_exp.nextTree());
				}
				stream_exp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "listexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "listexp"


	public static class exp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:1: exp : ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )* ;
	public final MiniJaJaParser.exp_return exp() throws RecognitionException {
		MiniJaJaParser.exp_return retval = new MiniJaJaParser.exp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal92=null;
		Token string_literal95=null;
		Token string_literal97=null;
		ParserRuleReturnScope exp193 =null;
		ParserRuleReturnScope exp194 =null;
		ParserRuleReturnScope exp196 =null;
		ParserRuleReturnScope exp198 =null;

		CommonTree char_literal92_tree=null;
		CommonTree string_literal95_tree=null;
		CommonTree string_literal97_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:5: ( ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:7: ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(99,7);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:7: ( '!' ^ exp1 | exp1 )
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==36) ) {
				alt20=1;
			}
			else if ( (LA20_0==BOOL||LA20_0==IDF||LA20_0==INT||LA20_0==38||LA20_0==45) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:8: '!' ^ exp1
					{
					dbg.location(99,11);
					char_literal92=(Token)match(input,36,FOLLOW_36_in_exp826); 
					char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal92_tree, root_0);
					dbg.location(99,13);
					pushFollow(FOLLOW_exp1_in_exp829);
					exp193=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp193.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:20: exp1
					{
					dbg.location(99,20);
					pushFollow(FOLLOW_exp1_in_exp833);
					exp194=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp194.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(99,26);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:26: ( '&&' ^ exp1 | '||' ^ exp1 )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=3;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==37) ) {
					alt21=1;
				}
				else if ( (LA21_0==61) ) {
					alt21=2;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:27: '&&' ^ exp1
					{
					dbg.location(99,31);
					string_literal95=(Token)match(input,37,FOLLOW_37_in_exp837); 
					string_literal95_tree = (CommonTree)adaptor.create(string_literal95);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal95_tree, root_0);
					dbg.location(99,33);
					pushFollow(FOLLOW_exp1_in_exp840);
					exp196=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp196.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:99:40: '||' ^ exp1
					{
					dbg.location(99,44);
					string_literal97=(Token)match(input,61,FOLLOW_61_in_exp844); 
					string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal97_tree, root_0);
					dbg.location(99,46);
					pushFollow(FOLLOW_exp1_in_exp847);
					exp198=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp198.getTree());

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(100, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"


	public static class exp1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp1"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:1: exp1 : ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )* ;
	public final MiniJaJaParser.exp1_return exp1() throws RecognitionException {
		MiniJaJaParser.exp1_return retval = new MiniJaJaParser.exp1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope exp299 =null;
		ParserRuleReturnScope exp2101 =null;
		ParserRuleReturnScope exp2103 =null;

		CommonTree string_literal100_tree=null;
		CommonTree char_literal102_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exp1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:6: ( ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:8: ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(102,8);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:8: ( exp2 )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:9: exp2
			{
			dbg.location(102,9);
			pushFollow(FOLLOW_exp2_in_exp1859);
			exp299=exp2();
			state._fsp--;

			adaptor.addChild(root_0, exp299.getTree());

			}
			dbg.location(102,15);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:15: ( '==' ^ exp2 | '>' ^ exp2 )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=3;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==49) ) {
					alt22=1;
				}
				else if ( (LA22_0==50) ) {
					alt22=2;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:16: '==' ^ exp2
					{
					dbg.location(102,20);
					string_literal100=(Token)match(input,49,FOLLOW_49_in_exp1863); 
					string_literal100_tree = (CommonTree)adaptor.create(string_literal100);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal100_tree, root_0);
					dbg.location(102,22);
					pushFollow(FOLLOW_exp2_in_exp1866);
					exp2101=exp2();
					state._fsp--;

					adaptor.addChild(root_0, exp2101.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:102:29: '>' ^ exp2
					{
					dbg.location(102,32);
					char_literal102=(Token)match(input,50,FOLLOW_50_in_exp1870); 
					char_literal102_tree = (CommonTree)adaptor.create(char_literal102);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal102_tree, root_0);
					dbg.location(102,34);
					pushFollow(FOLLOW_exp2_in_exp1873);
					exp2103=exp2();
					state._fsp--;

					adaptor.addChild(root_0, exp2103.getTree());

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp1"


	public static class exp2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp2"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:1: exp2 : ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )* ;
	public final MiniJaJaParser.exp2_return exp2() throws RecognitionException {
		MiniJaJaParser.exp2_return retval = new MiniJaJaParser.exp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal104=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope terme105 =null;
		ParserRuleReturnScope terme106 =null;
		ParserRuleReturnScope terme108 =null;
		ParserRuleReturnScope terme110 =null;

		CommonTree char_literal104_tree=null;
		CommonTree char_literal107_tree=null;
		CommonTree char_literal109_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exp2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:6: ( ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:8: ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(105,8);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:8: ( '-' ^ terme | terme )
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==45) ) {
				alt23=1;
			}
			else if ( (LA23_0==BOOL||LA23_0==IDF||LA23_0==INT||LA23_0==38) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:9: '-' ^ terme
					{
					dbg.location(105,12);
					char_literal104=(Token)match(input,45,FOLLOW_45_in_exp2885); 
					char_literal104_tree = (CommonTree)adaptor.create(char_literal104);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal104_tree, root_0);
					dbg.location(105,14);
					pushFollow(FOLLOW_terme_in_exp2888);
					terme105=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme105.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:22: terme
					{
					dbg.location(105,22);
					pushFollow(FOLLOW_terme_in_exp2892);
					terme106=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme106.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(105,29);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:29: ( '+' ^ terme | '-' ^ terme )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=3;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==41) ) {
					alt24=1;
				}
				else if ( (LA24_0==45) ) {
					alt24=2;
				}

				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:30: '+' ^ terme
					{
					dbg.location(105,33);
					char_literal107=(Token)match(input,41,FOLLOW_41_in_exp2896); 
					char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal107_tree, root_0);
					dbg.location(105,35);
					pushFollow(FOLLOW_terme_in_exp2899);
					terme108=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme108.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:105:43: '-' ^ terme
					{
					dbg.location(105,46);
					char_literal109=(Token)match(input,45,FOLLOW_45_in_exp2903); 
					char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);
					dbg.location(105,48);
					pushFollow(FOLLOW_terme_in_exp2906);
					terme110=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme110.getTree());

					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(106, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp2"


	public static class terme_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "terme"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:1: terme : fact ( '*' ^ fact | '/' ^ fact )* ;
	public final MiniJaJaParser.terme_return terme() throws RecognitionException {
		MiniJaJaParser.terme_return retval = new MiniJaJaParser.terme_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal112=null;
		Token char_literal114=null;
		ParserRuleReturnScope fact111 =null;
		ParserRuleReturnScope fact113 =null;
		ParserRuleReturnScope fact115 =null;

		CommonTree char_literal112_tree=null;
		CommonTree char_literal114_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "terme");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:7: ( fact ( '*' ^ fact | '/' ^ fact )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:9: fact ( '*' ^ fact | '/' ^ fact )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(108,9);
			pushFollow(FOLLOW_fact_in_terme917);
			fact111=fact();
			state._fsp--;

			adaptor.addChild(root_0, fact111.getTree());
			dbg.location(108,14);
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:14: ( '*' ^ fact | '/' ^ fact )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=3;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==40) ) {
					alt25=1;
				}
				else if ( (LA25_0==46) ) {
					alt25=2;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:15: '*' ^ fact
					{
					dbg.location(108,18);
					char_literal112=(Token)match(input,40,FOLLOW_40_in_terme920); 
					char_literal112_tree = (CommonTree)adaptor.create(char_literal112);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal112_tree, root_0);
					dbg.location(108,20);
					pushFollow(FOLLOW_fact_in_terme923);
					fact113=fact();
					state._fsp--;

					adaptor.addChild(root_0, fact113.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:108:27: '/' ^ fact
					{
					dbg.location(108,30);
					char_literal114=(Token)match(input,46,FOLLOW_46_in_terme927); 
					char_literal114_tree = (CommonTree)adaptor.create(char_literal114);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal114_tree, root_0);
					dbg.location(108,32);
					pushFollow(FOLLOW_fact_in_terme930);
					fact115=fact();
					state._fsp--;

					adaptor.addChild(root_0, fact115.getTree());

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(109, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "terme");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "terme"


	public static class fact_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fact"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:1: fact : ( ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELI ident listexp ) | -> ident ) | BOOL | ent | '(' exp ')' -> exp );
	public final MiniJaJaParser.fact_return fact() throws RecognitionException {
		MiniJaJaParser.fact_return retval = new MiniJaJaParser.fact_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal117=null;
		Token char_literal119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token BOOL123=null;
		Token char_literal125=null;
		Token char_literal127=null;
		ParserRuleReturnScope ident116 =null;
		ParserRuleReturnScope exp118 =null;
		ParserRuleReturnScope listexp121 =null;
		ParserRuleReturnScope ent124 =null;
		ParserRuleReturnScope exp126 =null;

		CommonTree char_literal117_tree=null;
		CommonTree char_literal119_tree=null;
		CommonTree char_literal120_tree=null;
		CommonTree char_literal122_tree=null;
		CommonTree BOOL123_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree char_literal127_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_listexp=new RewriteRuleSubtreeStream(adaptor,"rule listexp");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "fact");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:6: ( ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELI ident listexp ) | -> ident ) | BOOL | ent | '(' exp ')' -> exp )
			int alt27=4;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt27=1;
				}
				break;
			case BOOL:
				{
				alt27=2;
				}
				break;
			case INT:
				{
				alt27=3;
				}
				break;
			case 38:
				{
				alt27=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:8: ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELI ident listexp ) | -> ident )
					{
					dbg.location(111,8);
					pushFollow(FOLLOW_ident_in_fact941);
					ident116=ident();
					state._fsp--;

					stream_ident.add(ident116.getTree());dbg.location(111,13);
					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:13: ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELI ident listexp ) | -> ident )
					int alt26=3;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					switch ( input.LA(1) ) {
					case 51:
						{
						alt26=1;
						}
						break;
					case 38:
						{
						alt26=2;
						}
						break;
					case 37:
					case 39:
					case 40:
					case 41:
					case 44:
					case 45:
					case 46:
					case 47:
					case 49:
					case 50:
					case 52:
					case 60:
					case 61:
						{
						alt26=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:14: '[' exp ']'
							{
							dbg.location(111,14);
							char_literal117=(Token)match(input,51,FOLLOW_51_in_fact943);  
							stream_51.add(char_literal117);
							dbg.location(111,17);
							pushFollow(FOLLOW_exp_in_fact944);
							exp118=exp();
							state._fsp--;

							stream_exp.add(exp118.getTree());dbg.location(111,20);
							char_literal119=(Token)match(input,52,FOLLOW_52_in_fact945);  
							stream_52.add(char_literal119);

							// AST REWRITE
							// elements: ident, exp
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 111:24: -> ^( TAB ident exp )
							{
								dbg.location(111,27);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:27: ^( TAB ident exp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(111,29);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_1);
								dbg.location(111,33);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(111,39);
								adaptor.addChild(root_1, stream_exp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:45: '(' listexp ')'
							{
							dbg.location(111,45);
							char_literal120=(Token)match(input,38,FOLLOW_38_in_fact958);  
							stream_38.add(char_literal120);
							dbg.location(111,49);
							pushFollow(FOLLOW_listexp_in_fact960);
							listexp121=listexp();
							state._fsp--;

							stream_listexp.add(listexp121.getTree());dbg.location(111,57);
							char_literal122=(Token)match(input,39,FOLLOW_39_in_fact962);  
							stream_39.add(char_literal122);

							// AST REWRITE
							// elements: ident, listexp
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 111:61: -> ^( APPELI ident listexp )
							{
								dbg.location(111,64);
								// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:64: ^( APPELI ident listexp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								dbg.location(111,66);
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPELI, "APPELI"), root_1);
								dbg.location(111,73);
								adaptor.addChild(root_1, stream_ident.nextTree());dbg.location(111,79);
								adaptor.addChild(root_1, stream_listexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/m1comp4/MiniJaJa.g:111:90: 
							{
							// AST REWRITE
							// elements: ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 111:90: -> ident
							{
								dbg.location(111,93);
								adaptor.addChild(root_0, stream_ident.nextTree());
							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(26);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:112:5: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(112,5);
					BOOL123=(Token)match(input,BOOL,FOLLOW_BOOL_in_fact985); 
					BOOL123_tree = (CommonTree)adaptor.create(BOOL123);
					adaptor.addChild(root_0, BOOL123_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:113:5: ent
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(113,5);
					pushFollow(FOLLOW_ent_in_fact991);
					ent124=ent();
					state._fsp--;

					adaptor.addChild(root_0, ent124.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:114:5: '(' exp ')'
					{
					dbg.location(114,5);
					char_literal125=(Token)match(input,38,FOLLOW_38_in_fact997);  
					stream_38.add(char_literal125);
					dbg.location(114,9);
					pushFollow(FOLLOW_exp_in_fact999);
					exp126=exp();
					state._fsp--;

					stream_exp.add(exp126.getTree());dbg.location(114,13);
					char_literal127=(Token)match(input,39,FOLLOW_39_in_fact1001);  
					stream_39.add(char_literal127);

					// AST REWRITE
					// elements: exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 114:17: -> exp
					{
						dbg.location(114,20);
						adaptor.addChild(root_0, stream_exp.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(115, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fact");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fact"


	public static class typemeth_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typemeth"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:117:1: typemeth : ( VOID | type );
	public final MiniJaJaParser.typemeth_return typemeth() throws RecognitionException {
		MiniJaJaParser.typemeth_return retval = new MiniJaJaParser.typemeth_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VOID128=null;
		ParserRuleReturnScope type129 =null;

		CommonTree VOID128_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "typemeth");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:117:10: ( VOID | type )
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==VOID) ) {
				alt28=1;
			}
			else if ( (LA28_0==TYPE) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:117:12: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(117,12);
					VOID128=(Token)match(input,VOID,FOLLOW_VOID_in_typemeth1014); 
					VOID128_tree = (CommonTree)adaptor.create(VOID128);
					adaptor.addChild(root_0, VOID128_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/m1comp4/MiniJaJa.g:118:6: type
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(118,6);
					pushFollow(FOLLOW_type_in_typemeth1021);
					type129=type();
					state._fsp--;

					adaptor.addChild(root_0, type129.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(119, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typemeth");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "typemeth"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:121:1: type : TYPE ;
	public final MiniJaJaParser.type_return type() throws RecognitionException {
		MiniJaJaParser.type_return retval = new MiniJaJaParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPE130=null;

		CommonTree TYPE130_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:121:6: ( TYPE )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:121:7: TYPE
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(121,7);
			TYPE130=(Token)match(input,TYPE,FOLLOW_TYPE_in_type1029); 
			TYPE130_tree = (CommonTree)adaptor.create(TYPE130);
			adaptor.addChild(root_0, TYPE130_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(122, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type"


	public static class ent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ent"
	// /home/frosqh/workspace/m1comp4/MiniJaJa.g:124:1: ent : INT -> ^( NBRE INT ) ;
	public final MiniJaJaParser.ent_return ent() throws RecognitionException {
		MiniJaJaParser.ent_return retval = new MiniJaJaParser.ent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT131=null;

		CommonTree INT131_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "ent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:124:6: ( INT -> ^( NBRE INT ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/m1comp4/MiniJaJa.g:124:9: INT
			{
			dbg.location(124,9);
			INT131=(Token)match(input,INT,FOLLOW_INT_in_ent1040);  
			stream_INT.add(INT131);

			// AST REWRITE
			// elements: INT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 124:13: -> ^( NBRE INT )
			{
				dbg.location(124,16);
				// /home/frosqh/workspace/m1comp4/MiniJaJa.g:124:16: ^( NBRE INT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(124,18);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NBRE, "NBRE"), root_1);
				dbg.location(124,23);
				adaptor.addChild(root_1, stream_INT.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(125, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ent"

	// Delegated rules



	public static final BitSet FOLLOW_fichier_in_axiom156 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classe_in_fichier170 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_classe181 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_classe183 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_classe185 = new BitSet(new long[]{0x0280000420000000L});
	public static final BitSet FOLLOW_decls_in_classe186 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_methmain_in_classe188 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_classe189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_ident210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decls228 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_decls230 = new BitSet(new long[]{0x0080000420000002L});
	public static final BitSet FOLLOW_typemeth_in_decl250 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_decl252 = new BitSet(new long[]{0x0009004000000000L});
	public static final BitSet FOLLOW_vexp_in_decl256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_decl272 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_decl274 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_decl276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methode_in_decl293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalvar_in_decl311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_varz323 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_varz325 = new BitSet(new long[]{0x0080000420000002L});
	public static final BitSet FOLLOW_typemeth_in_vars346 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_vars348 = new BitSet(new long[]{0x0009000000000000L});
	public static final BitSet FOLLOW_vexp_in_vars351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_vars367 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_vars369 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_vars371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalvar_in_vars389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_finalvar398 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_type_in_finalvar400 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_finalvar402 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_vexp_in_finalvar404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_vexp425 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_vexp427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_methode447 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_type_in_methode450 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_methode452 = new BitSet(new long[]{0x0000108000000000L});
	public static final BitSet FOLLOW_44_in_methode455 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_type_in_methode457 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ident_in_methode459 = new BitSet(new long[]{0x0000108000000000L});
	public static final BitSet FOLLOW_39_in_methode466 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_methode468 = new BitSet(new long[]{0x4D80000420004000L});
	public static final BitSet FOLLOW_varz_in_methode469 = new BitSet(new long[]{0x4D00000000004000L});
	public static final BitSet FOLLOW_instrs_in_methode471 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_methode472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_methmain498 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_methmain500 = new BitSet(new long[]{0x4D80000420004000L});
	public static final BitSet FOLLOW_varz_in_methmain501 = new BitSet(new long[]{0x4D00000000004000L});
	public static final BitSet FOLLOW_instrs_in_methmain503 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_methmain504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instr_in_instrs525 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_instrs527 = new BitSet(new long[]{0x0D00000000004002L});
	public static final BitSet FOLLOW_ident_in_instr548 = new BitSet(new long[]{0x00090C4000000000L});
	public static final BitSet FOLLOW_48_in_instr559 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_instr576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_instr588 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_instr611 = new BitSet(new long[]{0x000020D000044080L});
	public static final BitSet FOLLOW_listexp_in_instr612 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instr613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_instr634 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr635 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_instr636 = new BitSet(new long[]{0x00010C0000000000L});
	public static final BitSet FOLLOW_48_in_instr639 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_instr660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_instr678 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_instr711 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_instr727 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr729 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_instr731 = new BitSet(new long[]{0x4D00000000004000L});
	public static final BitSet FOLLOW_instrs_in_instr733 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_instr735 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_instr738 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_instr740 = new BitSet(new long[]{0x4D00000000004000L});
	public static final BitSet FOLLOW_instrs_in_instr742 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_instr744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_instr766 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_instr768 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_instr769 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instr770 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_instr772 = new BitSet(new long[]{0x4D00000000004000L});
	public static final BitSet FOLLOW_instrs_in_instr773 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_instr774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_listexp798 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_listexp801 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_listexp803 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_36_in_exp826 = new BitSet(new long[]{0x0000204000044080L});
	public static final BitSet FOLLOW_exp1_in_exp829 = new BitSet(new long[]{0x2000002000000002L});
	public static final BitSet FOLLOW_exp1_in_exp833 = new BitSet(new long[]{0x2000002000000002L});
	public static final BitSet FOLLOW_37_in_exp837 = new BitSet(new long[]{0x0000204000044080L});
	public static final BitSet FOLLOW_exp1_in_exp840 = new BitSet(new long[]{0x2000002000000002L});
	public static final BitSet FOLLOW_61_in_exp844 = new BitSet(new long[]{0x0000204000044080L});
	public static final BitSet FOLLOW_exp1_in_exp847 = new BitSet(new long[]{0x2000002000000002L});
	public static final BitSet FOLLOW_exp2_in_exp1859 = new BitSet(new long[]{0x0006000000000002L});
	public static final BitSet FOLLOW_49_in_exp1863 = new BitSet(new long[]{0x0000204000044080L});
	public static final BitSet FOLLOW_exp2_in_exp1866 = new BitSet(new long[]{0x0006000000000002L});
	public static final BitSet FOLLOW_50_in_exp1870 = new BitSet(new long[]{0x0000204000044080L});
	public static final BitSet FOLLOW_exp2_in_exp1873 = new BitSet(new long[]{0x0006000000000002L});
	public static final BitSet FOLLOW_45_in_exp2885 = new BitSet(new long[]{0x0000004000044080L});
	public static final BitSet FOLLOW_terme_in_exp2888 = new BitSet(new long[]{0x0000220000000002L});
	public static final BitSet FOLLOW_terme_in_exp2892 = new BitSet(new long[]{0x0000220000000002L});
	public static final BitSet FOLLOW_41_in_exp2896 = new BitSet(new long[]{0x0000004000044080L});
	public static final BitSet FOLLOW_terme_in_exp2899 = new BitSet(new long[]{0x0000220000000002L});
	public static final BitSet FOLLOW_45_in_exp2903 = new BitSet(new long[]{0x0000004000044080L});
	public static final BitSet FOLLOW_terme_in_exp2906 = new BitSet(new long[]{0x0000220000000002L});
	public static final BitSet FOLLOW_fact_in_terme917 = new BitSet(new long[]{0x0000410000000002L});
	public static final BitSet FOLLOW_40_in_terme920 = new BitSet(new long[]{0x0000004000044080L});
	public static final BitSet FOLLOW_fact_in_terme923 = new BitSet(new long[]{0x0000410000000002L});
	public static final BitSet FOLLOW_46_in_terme927 = new BitSet(new long[]{0x0000004000044080L});
	public static final BitSet FOLLOW_fact_in_terme930 = new BitSet(new long[]{0x0000410000000002L});
	public static final BitSet FOLLOW_ident_in_fact941 = new BitSet(new long[]{0x0008004000000002L});
	public static final BitSet FOLLOW_51_in_fact943 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_fact944 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_fact945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_fact958 = new BitSet(new long[]{0x000020D000044080L});
	public static final BitSet FOLLOW_listexp_in_fact960 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_fact962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_fact985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ent_in_fact991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_fact997 = new BitSet(new long[]{0x0000205000044080L});
	public static final BitSet FOLLOW_exp_in_fact999 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_fact1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_typemeth1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typemeth1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ent1040 = new BitSet(new long[]{0x0000000000000002L});
}
