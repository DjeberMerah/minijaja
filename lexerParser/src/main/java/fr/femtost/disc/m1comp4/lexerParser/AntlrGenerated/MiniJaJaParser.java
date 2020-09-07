// $ANTLR 3.5.2 MiniJaJa.g 2018-11-05 15:15:22
package fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MiniJaJaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECTATION", "APPELE", "APPELI", 
		"BLOCK", "BOOL", "CALL", "CLASSE", "COMMENT", "CST", "DECLS", "IDENT", 
		"IDF", "ILCOMMENT", "INCREMENT", "INSTRS", "INT", "LISTEXP", "METH", "NBRE", 
		"PARAM", "PRINTS", "RETOUR", "SI", "SOMME", "String", "TAB", "TABLEAU", 
		"TANTQUE", "TYPE", "VAR", "VARS", "VEC", "VIDE", "VOID", "WS", "'!'", 
		"'&&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'/'", 
		"';'", "'='", "'=='", "'>'", "'['", "']'", "'class'", "'else'", "'final'", 
		"'if'", "'main'", "'print'", "'return'", "'while'", "'{'", "'||'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MiniJaJaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MiniJaJaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return MiniJaJaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "MiniJaJa.g"; }


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// MiniJaJa.g:44:1: axiom : fichier EOF -> fichier ;
	public final MiniJaJaParser.axiom_return axiom() throws RecognitionException {
		MiniJaJaParser.axiom_return retval = new MiniJaJaParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try {
			// MiniJaJa.g:44:7: ( fichier EOF -> fichier )
			// MiniJaJa.g:44:9: fichier EOF
			{
			pushFollow(FOLLOW_fichier_in_axiom179);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom181);  
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
			// 44:20: -> fichier
			{
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
		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// MiniJaJa.g:47:1: fichier : ( classe )* ;
	public final MiniJaJaParser.fichier_return fichier() throws RecognitionException {
		MiniJaJaParser.fichier_return retval = new MiniJaJaParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope classe3 =null;


		try {
			// MiniJaJa.g:47:9: ( ( classe )* )
			// MiniJaJa.g:47:11: ( classe )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// MiniJaJa.g:47:11: ( classe )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==56) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// MiniJaJa.g:47:11: classe
					{
					pushFollow(FOLLOW_classe_in_fichier193);
					classe3=classe();
					state._fsp--;

					adaptor.addChild(root_0, classe3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

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
		return retval;
	}
	// $ANTLR end "fichier"


	public static class classe_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classe"
	// MiniJaJa.g:50:1: classe : 'class' ident '{' decls methmain '}' -> ^( CLASSE ident decls methmain ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_methmain=new RewriteRuleSubtreeStream(adaptor,"rule methmain");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");

		try {
			// MiniJaJa.g:50:8: ( 'class' ident '{' decls methmain '}' -> ^( CLASSE ident decls methmain ) )
			// MiniJaJa.g:50:10: 'class' ident '{' decls methmain '}'
			{
			string_literal4=(Token)match(input,56,FOLLOW_56_in_classe204);  
			stream_56.add(string_literal4);

			pushFollow(FOLLOW_ident_in_classe206);
			ident5=ident();
			state._fsp--;

			stream_ident.add(ident5.getTree());
			char_literal6=(Token)match(input,64,FOLLOW_64_in_classe208);  
			stream_64.add(char_literal6);

			pushFollow(FOLLOW_decls_in_classe209);
			decls7=decls();
			state._fsp--;

			stream_decls.add(decls7.getTree());
			pushFollow(FOLLOW_methmain_in_classe211);
			methmain8=methmain();
			state._fsp--;

			stream_methmain.add(methmain8.getTree());
			char_literal9=(Token)match(input,66,FOLLOW_66_in_classe212);  
			stream_66.add(char_literal9);

			// AST REWRITE
			// elements: decls, methmain, ident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 50:45: -> ^( CLASSE ident decls methmain )
			{
				// MiniJaJa.g:50:48: ^( CLASSE ident decls methmain )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASSE, "CLASSE"), root_1);
				adaptor.addChild(root_1, stream_ident.nextTree());
				adaptor.addChild(root_1, stream_decls.nextTree());
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
		return retval;
	}
	// $ANTLR end "classe"


	public static class ident_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ident"
	// MiniJaJa.g:53:1: ident : IDF -> ^( IDENT IDF ) ;
	public final MiniJaJaParser.ident_return ident() throws RecognitionException {
		MiniJaJaParser.ident_return retval = new MiniJaJaParser.ident_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF10=null;

		CommonTree IDF10_tree=null;
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

		try {
			// MiniJaJa.g:53:7: ( IDF -> ^( IDENT IDF ) )
			// MiniJaJa.g:53:9: IDF
			{
			IDF10=(Token)match(input,IDF,FOLLOW_IDF_in_ident233);  
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
			// 53:13: -> ^( IDENT IDF )
			{
				// MiniJaJa.g:53:16: ^( IDENT IDF )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT, "IDENT"), root_1);
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
		return retval;
	}
	// $ANTLR end "ident"


	public static class decls_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decls"
	// MiniJaJa.g:56:1: decls : ( decl ';' )* -> ^( DECLS ( decl )* ) ;
	public final MiniJaJaParser.decls_return decls() throws RecognitionException {
		MiniJaJaParser.decls_return retval = new MiniJaJaParser.decls_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		ParserRuleReturnScope decl11 =null;

		CommonTree char_literal12_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// MiniJaJa.g:56:7: ( ( decl ';' )* -> ^( DECLS ( decl )* ) )
			// MiniJaJa.g:56:9: ( decl ';' )*
			{
			// MiniJaJa.g:56:9: ( decl ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TYPE||LA2_0==VOID||LA2_0==58) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// MiniJaJa.g:56:10: decl ';'
					{
					pushFollow(FOLLOW_decl_in_decls251);
					decl11=decl();
					state._fsp--;

					stream_decl.add(decl11.getTree());
					char_literal12=(Token)match(input,50,FOLLOW_50_in_decls253);  
					stream_50.add(char_literal12);

					}
					break;

				default :
					break loop2;
				}
			}

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
			// 56:21: -> ^( DECLS ( decl )* )
			{
				// MiniJaJa.g:56:24: ^( DECLS ( decl )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLS, "DECLS"), root_1);
				// MiniJaJa.g:56:32: ( decl )*
				while ( stream_decl.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "decls"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// MiniJaJa.g:59:1: decl : ( typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) ) | finalvar );
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_methode=new RewriteRuleSubtreeStream(adaptor,"rule methode");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
		RewriteRuleSubtreeStream stream_typemeth=new RewriteRuleSubtreeStream(adaptor,"rule typemeth");

		try {
			// MiniJaJa.g:59:6: ( typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) ) | finalvar )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TYPE||LA5_0==VOID) ) {
				alt5=1;
			}
			else if ( (LA5_0==58) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// MiniJaJa.g:59:8: typemeth ident ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) )
					{
					pushFollow(FOLLOW_typemeth_in_decl273);
					typemeth13=typemeth();
					state._fsp--;

					stream_typemeth.add(typemeth13.getTree());
					pushFollow(FOLLOW_ident_in_decl275);
					ident14=ident();
					state._fsp--;

					stream_ident.add(ident14.getTree());
					// MiniJaJa.g:59:23: ( ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | methode -> ^( METH typemeth ident ( methode )? ) )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= 50 && LA4_0 <= 51)||LA4_0==54) ) {
						alt4=1;
					}
					else if ( (LA4_0==41) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// MiniJaJa.g:59:24: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
							{
							// MiniJaJa.g:59:24: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( ((LA3_0 >= 50 && LA3_0 <= 51)) ) {
								alt3=1;
							}
							else if ( (LA3_0==54) ) {
								alt3=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}

							switch (alt3) {
								case 1 :
									// MiniJaJa.g:59:25: vexp
									{
									pushFollow(FOLLOW_vexp_in_decl279);
									vexp15=vexp();
									state._fsp--;

									stream_vexp.add(vexp15.getTree());
									// AST REWRITE
									// elements: ident, typemeth, vexp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 59:30: -> ^( VAR ident typemeth vexp )
									{
										// MiniJaJa.g:59:33: ^( VAR ident typemeth vexp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_1, stream_typemeth.nextTree());
										adaptor.addChild(root_1, stream_vexp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// MiniJaJa.g:59:62: '[' exp ']'
									{
									char_literal16=(Token)match(input,54,FOLLOW_54_in_decl295);  
									stream_54.add(char_literal16);

									pushFollow(FOLLOW_exp_in_decl297);
									exp17=exp();
									state._fsp--;

									stream_exp.add(exp17.getTree());
									char_literal18=(Token)match(input,55,FOLLOW_55_in_decl299);  
									stream_55.add(char_literal18);

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
									// 59:74: -> ^( TABLEAU ident typemeth exp )
									{
										// MiniJaJa.g:59:77: ^( TABLEAU ident typemeth exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLEAU, "TABLEAU"), root_1);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_1, stream_typemeth.nextTree());
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;
						case 2 :
							// MiniJaJa.g:59:110: methode
							{
							pushFollow(FOLLOW_methode_in_decl316);
							methode19=methode();
							state._fsp--;

							stream_methode.add(methode19.getTree());
							// AST REWRITE
							// elements: typemeth, methode, ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 59:117: -> ^( METH typemeth ident ( methode )? )
							{
								// MiniJaJa.g:59:120: ^( METH typemeth ident ( methode )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METH, "METH"), root_1);
								adaptor.addChild(root_1, stream_typemeth.nextTree());
								adaptor.addChild(root_1, stream_ident.nextTree());
								// MiniJaJa.g:59:143: ( methode )?
								if ( stream_methode.hasNext() ) {
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

					}
					break;
				case 2 :
					// MiniJaJa.g:59:156: finalvar
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_finalvar_in_decl334);
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
		return retval;
	}
	// $ANTLR end "decl"


	public static class varz_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varz"
	// MiniJaJa.g:62:1: varz : ( vars ';' )* -> ^( VARS ( vars )* ) ;
	public final MiniJaJaParser.varz_return varz() throws RecognitionException {
		MiniJaJaParser.varz_return retval = new MiniJaJaParser.varz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal22=null;
		ParserRuleReturnScope vars21 =null;

		CommonTree char_literal22_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// MiniJaJa.g:62:7: ( ( vars ';' )* -> ^( VARS ( vars )* ) )
			// MiniJaJa.g:62:10: ( vars ';' )*
			{
			// MiniJaJa.g:62:10: ( vars ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==TYPE||LA6_0==VOID||LA6_0==58) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// MiniJaJa.g:62:11: vars ';'
					{
					pushFollow(FOLLOW_vars_in_varz346);
					vars21=vars();
					state._fsp--;

					stream_vars.add(vars21.getTree());
					char_literal22=(Token)match(input,50,FOLLOW_50_in_varz348);  
					stream_50.add(char_literal22);

					}
					break;

				default :
					break loop6;
				}
			}

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
			// 62:22: -> ^( VARS ( vars )* )
			{
				// MiniJaJa.g:62:25: ^( VARS ( vars )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARS, "VARS"), root_1);
				// MiniJaJa.g:62:32: ( vars )*
				while ( stream_vars.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "varz"


	public static class vars_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// MiniJaJa.g:65:1: vars : ( typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | finalvar );
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
		RewriteRuleSubtreeStream stream_typemeth=new RewriteRuleSubtreeStream(adaptor,"rule typemeth");

		try {
			// MiniJaJa.g:65:6: ( typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) ) | finalvar )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==TYPE||LA8_0==VOID) ) {
				alt8=1;
			}
			else if ( (LA8_0==58) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// MiniJaJa.g:65:8: typemeth ident ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
					{
					pushFollow(FOLLOW_typemeth_in_vars369);
					typemeth23=typemeth();
					state._fsp--;

					stream_typemeth.add(typemeth23.getTree());
					pushFollow(FOLLOW_ident_in_vars371);
					ident24=ident();
					state._fsp--;

					stream_ident.add(ident24.getTree());
					// MiniJaJa.g:65:23: ( vexp -> ^( VAR ident typemeth vexp ) | '[' exp ']' -> ^( TABLEAU ident typemeth exp ) )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 50 && LA7_0 <= 51)) ) {
						alt7=1;
					}
					else if ( (LA7_0==54) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// MiniJaJa.g:65:24: vexp
							{
							pushFollow(FOLLOW_vexp_in_vars374);
							vexp25=vexp();
							state._fsp--;

							stream_vexp.add(vexp25.getTree());
							// AST REWRITE
							// elements: typemeth, vexp, ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 65:29: -> ^( VAR ident typemeth vexp )
							{
								// MiniJaJa.g:65:32: ^( VAR ident typemeth vexp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
								adaptor.addChild(root_1, stream_ident.nextTree());
								adaptor.addChild(root_1, stream_typemeth.nextTree());
								adaptor.addChild(root_1, stream_vexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// MiniJaJa.g:65:61: '[' exp ']'
							{
							char_literal26=(Token)match(input,54,FOLLOW_54_in_vars390);  
							stream_54.add(char_literal26);

							pushFollow(FOLLOW_exp_in_vars392);
							exp27=exp();
							state._fsp--;

							stream_exp.add(exp27.getTree());
							char_literal28=(Token)match(input,55,FOLLOW_55_in_vars394);  
							stream_55.add(char_literal28);

							// AST REWRITE
							// elements: typemeth, exp, ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 65:73: -> ^( TABLEAU ident typemeth exp )
							{
								// MiniJaJa.g:65:76: ^( TABLEAU ident typemeth exp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLEAU, "TABLEAU"), root_1);
								adaptor.addChild(root_1, stream_ident.nextTree());
								adaptor.addChild(root_1, stream_typemeth.nextTree());
								adaptor.addChild(root_1, stream_exp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// MiniJaJa.g:66:4: finalvar
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_finalvar_in_vars412);
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
		return retval;
	}
	// $ANTLR end "vars"


	public static class finalvar_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "finalvar"
	// MiniJaJa.g:69:1: finalvar : 'final' type ident vexp -> ^( CST type ident vexp ) ;
	public final MiniJaJaParser.finalvar_return finalvar() throws RecognitionException {
		MiniJaJaParser.finalvar_return retval = new MiniJaJaParser.finalvar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal30=null;
		ParserRuleReturnScope type31 =null;
		ParserRuleReturnScope ident32 =null;
		ParserRuleReturnScope vexp33 =null;

		CommonTree string_literal30_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_vexp=new RewriteRuleSubtreeStream(adaptor,"rule vexp");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// MiniJaJa.g:69:10: ( 'final' type ident vexp -> ^( CST type ident vexp ) )
			// MiniJaJa.g:69:12: 'final' type ident vexp
			{
			string_literal30=(Token)match(input,58,FOLLOW_58_in_finalvar421);  
			stream_58.add(string_literal30);

			pushFollow(FOLLOW_type_in_finalvar423);
			type31=type();
			state._fsp--;

			stream_type.add(type31.getTree());
			pushFollow(FOLLOW_ident_in_finalvar425);
			ident32=ident();
			state._fsp--;

			stream_ident.add(ident32.getTree());
			pushFollow(FOLLOW_vexp_in_finalvar427);
			vexp33=vexp();
			state._fsp--;

			stream_vexp.add(vexp33.getTree());
			// AST REWRITE
			// elements: vexp, type, ident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:36: -> ^( CST type ident vexp )
			{
				// MiniJaJa.g:69:39: ^( CST type ident vexp )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CST, "CST"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_ident.nextTree());
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
		return retval;
	}
	// $ANTLR end "finalvar"


	public static class vexp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vexp"
	// MiniJaJa.g:72:1: vexp : ( '=' exp -> exp | -> VIDE );
	public final MiniJaJaParser.vexp_return vexp() throws RecognitionException {
		MiniJaJaParser.vexp_return retval = new MiniJaJaParser.vexp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal34=null;
		ParserRuleReturnScope exp35 =null;

		CommonTree char_literal34_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// MiniJaJa.g:72:6: ( '=' exp -> exp | -> VIDE )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==51) ) {
				alt9=1;
			}
			else if ( (LA9_0==50) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// MiniJaJa.g:72:8: '=' exp
					{
					char_literal34=(Token)match(input,51,FOLLOW_51_in_vexp448);  
					stream_51.add(char_literal34);

					pushFollow(FOLLOW_exp_in_vexp450);
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
					// 72:16: -> exp
					{
						adaptor.addChild(root_0, stream_exp.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// MiniJaJa.g:73:4: 
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
					// 73:4: -> VIDE
					{
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
		return retval;
	}
	// $ANTLR end "vexp"


	public static class methode_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methode"
	// MiniJaJa.g:76:1: methode : '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}' -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )? ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_varz=new RewriteRuleSubtreeStream(adaptor,"rule varz");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// MiniJaJa.g:76:9: ( '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}' -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )? )
			// MiniJaJa.g:76:11: '(' ( type ident ( ',' type ident )* )? ')' '{' varz instrs '}'
			{
			char_literal36=(Token)match(input,41,FOLLOW_41_in_methode470);  
			stream_41.add(char_literal36);

			// MiniJaJa.g:76:15: ( type ident ( ',' type ident )* )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==TYPE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// MiniJaJa.g:76:16: type ident ( ',' type ident )*
					{
					pushFollow(FOLLOW_type_in_methode473);
					type37=type();
					state._fsp--;

					stream_type.add(type37.getTree());
					pushFollow(FOLLOW_ident_in_methode475);
					ident38=ident();
					state._fsp--;

					stream_ident.add(ident38.getTree());
					// MiniJaJa.g:76:27: ( ',' type ident )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==47) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// MiniJaJa.g:76:28: ',' type ident
							{
							char_literal39=(Token)match(input,47,FOLLOW_47_in_methode478);  
							stream_47.add(char_literal39);

							pushFollow(FOLLOW_type_in_methode480);
							type40=type();
							state._fsp--;

							stream_type.add(type40.getTree());
							pushFollow(FOLLOW_ident_in_methode482);
							ident41=ident();
							state._fsp--;

							stream_ident.add(ident41.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

			}

			char_literal42=(Token)match(input,42,FOLLOW_42_in_methode489);  
			stream_42.add(char_literal42);

			char_literal43=(Token)match(input,64,FOLLOW_64_in_methode491);  
			stream_64.add(char_literal43);

			pushFollow(FOLLOW_varz_in_methode492);
			varz44=varz();
			state._fsp--;

			stream_varz.add(varz44.getTree());
			pushFollow(FOLLOW_instrs_in_methode494);
			instrs45=instrs();
			state._fsp--;

			stream_instrs.add(instrs45.getTree());
			char_literal46=(Token)match(input,66,FOLLOW_66_in_methode495);  
			stream_66.add(char_literal46);

			// AST REWRITE
			// elements: ident, type, varz, instrs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 76:70: -> ( ^( PARAM type ident ) )* ( varz )? ( instrs )?
			{
				// MiniJaJa.g:76:73: ( ^( PARAM type ident ) )*
				while ( stream_ident.hasNext()||stream_type.hasNext() ) {
					// MiniJaJa.g:76:73: ^( PARAM type ident )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_1, stream_ident.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_ident.reset();
				stream_type.reset();

				// MiniJaJa.g:76:94: ( varz )?
				if ( stream_varz.hasNext() ) {
					adaptor.addChild(root_0, stream_varz.nextTree());
				}
				stream_varz.reset();

				// MiniJaJa.g:76:100: ( instrs )?
				if ( stream_instrs.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "methode"


	public static class methmain_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methmain"
	// MiniJaJa.g:79:1: methmain : 'main' '{' varz instrs '}' -> ^( 'main' ( varz )? ( instrs )? ) ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_varz=new RewriteRuleSubtreeStream(adaptor,"rule varz");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");

		try {
			// MiniJaJa.g:79:10: ( 'main' '{' varz instrs '}' -> ^( 'main' ( varz )? ( instrs )? ) )
			// MiniJaJa.g:79:12: 'main' '{' varz instrs '}'
			{
			string_literal47=(Token)match(input,60,FOLLOW_60_in_methmain521);  
			stream_60.add(string_literal47);

			char_literal48=(Token)match(input,64,FOLLOW_64_in_methmain523);  
			stream_64.add(char_literal48);

			pushFollow(FOLLOW_varz_in_methmain524);
			varz49=varz();
			state._fsp--;

			stream_varz.add(varz49.getTree());
			pushFollow(FOLLOW_instrs_in_methmain526);
			instrs50=instrs();
			state._fsp--;

			stream_instrs.add(instrs50.getTree());
			char_literal51=(Token)match(input,66,FOLLOW_66_in_methmain527);  
			stream_66.add(char_literal51);

			// AST REWRITE
			// elements: varz, instrs, 60
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 79:37: -> ^( 'main' ( varz )? ( instrs )? )
			{
				// MiniJaJa.g:79:40: ^( 'main' ( varz )? ( instrs )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_60.nextNode(), root_1);
				// MiniJaJa.g:79:49: ( varz )?
				if ( stream_varz.hasNext() ) {
					adaptor.addChild(root_1, stream_varz.nextTree());
				}
				stream_varz.reset();

				// MiniJaJa.g:79:55: ( instrs )?
				if ( stream_instrs.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "methmain"


	public static class instrs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instrs"
	// MiniJaJa.g:82:1: instrs : ( instr ';' )* -> ^( INSTRS ( instr )* ) ;
	public final MiniJaJaParser.instrs_return instrs() throws RecognitionException {
		MiniJaJaParser.instrs_return retval = new MiniJaJaParser.instrs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal53=null;
		ParserRuleReturnScope instr52 =null;

		CommonTree char_literal53_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");

		try {
			// MiniJaJa.g:82:8: ( ( instr ';' )* -> ^( INSTRS ( instr )* ) )
			// MiniJaJa.g:82:9: ( instr ';' )*
			{
			// MiniJaJa.g:82:9: ( instr ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==IDF||LA12_0==59||(LA12_0 >= 61 && LA12_0 <= 63)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// MiniJaJa.g:82:10: instr ';'
					{
					pushFollow(FOLLOW_instr_in_instrs548);
					instr52=instr();
					state._fsp--;

					stream_instr.add(instr52.getTree());
					char_literal53=(Token)match(input,50,FOLLOW_50_in_instrs550);  
					stream_50.add(char_literal53);

					}
					break;

				default :
					break loop12;
				}
			}

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
			// 82:22: -> ^( INSTRS ( instr )* )
			{
				// MiniJaJa.g:82:25: ^( INSTRS ( instr )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRS, "INSTRS"), root_1);
				// MiniJaJa.g:82:34: ( instr )*
				while ( stream_instr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "instrs"


	public static class instr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instr"
	// MiniJaJa.g:85:1: instr : ( ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) ) ) | 'return' exp -> ^( RETOUR exp ) | 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )? -> ^( SI exp instrs ( instrs )? ) | 'while' '(' exp ')' '{' instrs '}' -> ^( TANTQUE exp ( instrs )? ) | 'print' '(' ( exp -> ^( 'print' exp ) | String -> ^( PRINTS String ) ) ')' );
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
		Token string_literal89=null;
		Token char_literal90=null;
		Token String92=null;
		Token char_literal93=null;
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
		ParserRuleReturnScope exp91 =null;

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
		CommonTree string_literal89_tree=null;
		CommonTree char_literal90_tree=null;
		CommonTree String92_tree=null;
		CommonTree char_literal93_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_listexp=new RewriteRuleSubtreeStream(adaptor,"rule listexp");
		RewriteRuleSubtreeStream stream_instrs=new RewriteRuleSubtreeStream(adaptor,"rule instrs");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// MiniJaJa.g:85:7: ( ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) ) ) | 'return' exp -> ^( RETOUR exp ) | 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )? -> ^( SI exp instrs ( instrs )? ) | 'while' '(' exp ')' '{' instrs '}' -> ^( TANTQUE exp ( instrs )? ) | 'print' '(' ( exp -> ^( 'print' exp ) | String -> ^( PRINTS String ) ) ')' )
			int alt18=5;
			switch ( input.LA(1) ) {
			case IDF:
				{
				alt18=1;
				}
				break;
			case 62:
				{
				alt18=2;
				}
				break;
			case 59:
				{
				alt18=3;
				}
				break;
			case 63:
				{
				alt18=4;
				}
				break;
			case 61:
				{
				alt18=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// MiniJaJa.g:85:10: ident ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) ) )
					{
					pushFollow(FOLLOW_ident_in_instr571);
					ident54=ident();
					state._fsp--;

					stream_ident.add(ident54.getTree());
					// MiniJaJa.g:85:15: ( ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) ) | '(' listexp ')' -> ^( APPELI ident ( listexp )? ) | '[' exp ']' ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) ) )
					int alt15=3;
					switch ( input.LA(1) ) {
					case 45:
					case 46:
					case 51:
						{
						alt15=1;
						}
						break;
					case 41:
						{
						alt15=2;
						}
						break;
					case 54:
						{
						alt15=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// MiniJaJa.g:86:6: ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) )
							{
							// MiniJaJa.g:86:6: ( '=' exp -> ^( AFFECTATION ident exp ) | '++' -> ^( INCREMENT ident ) | '+=' exp -> ^( SOMME ident exp ) )
							int alt13=3;
							switch ( input.LA(1) ) {
							case 51:
								{
								alt13=1;
								}
								break;
							case 45:
								{
								alt13=2;
								}
								break;
							case 46:
								{
								alt13=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 13, 0, input);
								throw nvae;
							}
							switch (alt13) {
								case 1 :
									// MiniJaJa.g:86:7: '=' exp
									{
									char_literal55=(Token)match(input,51,FOLLOW_51_in_instr582);  
									stream_51.add(char_literal55);

									pushFollow(FOLLOW_exp_in_instr584);
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
									// 86:15: -> ^( AFFECTATION ident exp )
									{
										// MiniJaJa.g:86:18: ^( AFFECTATION ident exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// MiniJaJa.g:86:46: '++'
									{
									string_literal57=(Token)match(input,45,FOLLOW_45_in_instr599);  
									stream_45.add(string_literal57);

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
									// 86:51: -> ^( INCREMENT ident )
									{
										// MiniJaJa.g:86:54: ^( INCREMENT ident )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCREMENT, "INCREMENT"), root_1);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 3 :
									// MiniJaJa.g:86:75: '+=' exp
									{
									string_literal58=(Token)match(input,46,FOLLOW_46_in_instr611);  
									stream_46.add(string_literal58);

									pushFollow(FOLLOW_exp_in_instr613);
									exp59=exp();
									state._fsp--;

									stream_exp.add(exp59.getTree());
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
									// 86:84: -> ^( SOMME ident exp )
									{
										// MiniJaJa.g:86:87: ^( SOMME ident exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SOMME, "SOMME"), root_1);
										adaptor.addChild(root_1, stream_ident.nextTree());
										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;
						case 2 :
							// MiniJaJa.g:87:8: '(' listexp ')'
							{
							char_literal60=(Token)match(input,41,FOLLOW_41_in_instr634);  
							stream_41.add(char_literal60);

							pushFollow(FOLLOW_listexp_in_instr635);
							listexp61=listexp();
							state._fsp--;

							stream_listexp.add(listexp61.getTree());
							char_literal62=(Token)match(input,42,FOLLOW_42_in_instr636);  
							stream_42.add(char_literal62);

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
							// 87:22: -> ^( APPELI ident ( listexp )? )
							{
								// MiniJaJa.g:87:25: ^( APPELI ident ( listexp )? )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPELI, "APPELI"), root_1);
								adaptor.addChild(root_1, stream_ident.nextTree());
								// MiniJaJa.g:87:40: ( listexp )?
								if ( stream_listexp.hasNext() ) {
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
							// MiniJaJa.g:88:9: '[' exp ']' ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) )
							{
							char_literal63=(Token)match(input,54,FOLLOW_54_in_instr657);  
							stream_54.add(char_literal63);

							pushFollow(FOLLOW_exp_in_instr658);
							exp64=exp();
							state._fsp--;

							stream_exp.add(exp64.getTree());
							char_literal65=(Token)match(input,55,FOLLOW_55_in_instr659);  
							stream_55.add(char_literal65);

							// MiniJaJa.g:88:19: ( '=' exp -> ^( AFFECTATION ^( TAB ident exp ) exp ) | '++' -> ^( INCREMENT ^( TAB ident exp ) ) | '+=' exp -> ^( SOMME ^( TAB ident exp ) exp ) )
							int alt14=3;
							switch ( input.LA(1) ) {
							case 51:
								{
								alt14=1;
								}
								break;
							case 45:
								{
								alt14=2;
								}
								break;
							case 46:
								{
								alt14=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 14, 0, input);
								throw nvae;
							}
							switch (alt14) {
								case 1 :
									// MiniJaJa.g:88:20: '=' exp
									{
									char_literal66=(Token)match(input,51,FOLLOW_51_in_instr662);  
									stream_51.add(char_literal66);

									pushFollow(FOLLOW_exp_in_instr664);
									exp67=exp();
									state._fsp--;

									stream_exp.add(exp67.getTree());
									// AST REWRITE
									// elements: ident, exp, exp
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 88:28: -> ^( AFFECTATION ^( TAB ident exp ) exp )
									{
										// MiniJaJa.g:88:31: ^( AFFECTATION ^( TAB ident exp ) exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);
										// MiniJaJa.g:88:45: ^( TAB ident exp )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										adaptor.addChild(root_2, stream_ident.nextTree());
										adaptor.addChild(root_2, stream_exp.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// MiniJaJa.g:88:67: '++'
									{
									string_literal68=(Token)match(input,45,FOLLOW_45_in_instr682);  
									stream_45.add(string_literal68);

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
									// 88:72: -> ^( INCREMENT ^( TAB ident exp ) )
									{
										// MiniJaJa.g:88:75: ^( INCREMENT ^( TAB ident exp ) )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCREMENT, "INCREMENT"), root_1);
										// MiniJaJa.g:88:87: ^( TAB ident exp )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										adaptor.addChild(root_2, stream_ident.nextTree());
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
									// MiniJaJa.g:88:107: '+=' exp
									{
									string_literal69=(Token)match(input,46,FOLLOW_46_in_instr700);  
									stream_46.add(string_literal69);

									pushFollow(FOLLOW_exp_in_instr702);
									exp70=exp();
									state._fsp--;

									stream_exp.add(exp70.getTree());
									// AST REWRITE
									// elements: exp, exp, ident
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 88:116: -> ^( SOMME ^( TAB ident exp ) exp )
									{
										// MiniJaJa.g:88:119: ^( SOMME ^( TAB ident exp ) exp )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SOMME, "SOMME"), root_1);
										// MiniJaJa.g:88:127: ^( TAB ident exp )
										{
										CommonTree root_2 = (CommonTree)adaptor.nil();
										root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_2);
										adaptor.addChild(root_2, stream_ident.nextTree());
										adaptor.addChild(root_2, stream_exp.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										adaptor.addChild(root_1, stream_exp.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// MiniJaJa.g:90:5: 'return' exp
					{
					string_literal71=(Token)match(input,62,FOLLOW_62_in_instr732);  
					stream_62.add(string_literal71);

					pushFollow(FOLLOW_exp_in_instr734);
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
					// 90:18: -> ^( RETOUR exp )
					{
						// MiniJaJa.g:90:21: ^( RETOUR exp )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETOUR, "RETOUR"), root_1);
						adaptor.addChild(root_1, stream_exp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// MiniJaJa.g:91:5: 'if' exp '{' instrs '}' ( 'else' '{' instrs '}' )?
					{
					string_literal73=(Token)match(input,59,FOLLOW_59_in_instr748);  
					stream_59.add(string_literal73);

					pushFollow(FOLLOW_exp_in_instr750);
					exp74=exp();
					state._fsp--;

					stream_exp.add(exp74.getTree());
					char_literal75=(Token)match(input,64,FOLLOW_64_in_instr752);  
					stream_64.add(char_literal75);

					pushFollow(FOLLOW_instrs_in_instr754);
					instrs76=instrs();
					state._fsp--;

					stream_instrs.add(instrs76.getTree());
					char_literal77=(Token)match(input,66,FOLLOW_66_in_instr756);  
					stream_66.add(char_literal77);

					// MiniJaJa.g:91:29: ( 'else' '{' instrs '}' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==57) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// MiniJaJa.g:91:30: 'else' '{' instrs '}'
							{
							string_literal78=(Token)match(input,57,FOLLOW_57_in_instr759);  
							stream_57.add(string_literal78);

							char_literal79=(Token)match(input,64,FOLLOW_64_in_instr761);  
							stream_64.add(char_literal79);

							pushFollow(FOLLOW_instrs_in_instr763);
							instrs80=instrs();
							state._fsp--;

							stream_instrs.add(instrs80.getTree());
							char_literal81=(Token)match(input,66,FOLLOW_66_in_instr765);  
							stream_66.add(char_literal81);

							}
							break;

					}

					// AST REWRITE
					// elements: instrs, instrs, exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 91:55: -> ^( SI exp instrs ( instrs )? )
					{
						// MiniJaJa.g:91:58: ^( SI exp instrs ( instrs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SI, "SI"), root_1);
						adaptor.addChild(root_1, stream_exp.nextTree());
						adaptor.addChild(root_1, stream_instrs.nextTree());
						// MiniJaJa.g:91:74: ( instrs )?
						if ( stream_instrs.hasNext() ) {
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
					// MiniJaJa.g:92:5: 'while' '(' exp ')' '{' instrs '}'
					{
					string_literal82=(Token)match(input,63,FOLLOW_63_in_instr787);  
					stream_63.add(string_literal82);

					char_literal83=(Token)match(input,41,FOLLOW_41_in_instr789);  
					stream_41.add(char_literal83);

					pushFollow(FOLLOW_exp_in_instr790);
					exp84=exp();
					state._fsp--;

					stream_exp.add(exp84.getTree());
					char_literal85=(Token)match(input,42,FOLLOW_42_in_instr791);  
					stream_42.add(char_literal85);

					char_literal86=(Token)match(input,64,FOLLOW_64_in_instr793);  
					stream_64.add(char_literal86);

					pushFollow(FOLLOW_instrs_in_instr794);
					instrs87=instrs();
					state._fsp--;

					stream_instrs.add(instrs87.getTree());
					char_literal88=(Token)match(input,66,FOLLOW_66_in_instr795);  
					stream_66.add(char_literal88);

					// AST REWRITE
					// elements: instrs, exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 92:36: -> ^( TANTQUE exp ( instrs )? )
					{
						// MiniJaJa.g:92:39: ^( TANTQUE exp ( instrs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TANTQUE, "TANTQUE"), root_1);
						adaptor.addChild(root_1, stream_exp.nextTree());
						// MiniJaJa.g:92:53: ( instrs )?
						if ( stream_instrs.hasNext() ) {
							adaptor.addChild(root_1, stream_instrs.nextTree());
						}
						stream_instrs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// MiniJaJa.g:93:5: 'print' '(' ( exp -> ^( 'print' exp ) | String -> ^( PRINTS String ) ) ')'
					{
					string_literal89=(Token)match(input,61,FOLLOW_61_in_instr812);  
					stream_61.add(string_literal89);

					char_literal90=(Token)match(input,41,FOLLOW_41_in_instr814);  
					stream_41.add(char_literal90);

					// MiniJaJa.g:93:16: ( exp -> ^( 'print' exp ) | String -> ^( PRINTS String ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==BOOL||LA17_0==IDF||LA17_0==INT||LA17_0==39||LA17_0==41||LA17_0==48) ) {
						alt17=1;
					}
					else if ( (LA17_0==String) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// MiniJaJa.g:93:17: exp
							{
							pushFollow(FOLLOW_exp_in_instr816);
							exp91=exp();
							state._fsp--;

							stream_exp.add(exp91.getTree());
							// AST REWRITE
							// elements: exp, 61
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 93:20: -> ^( 'print' exp )
							{
								// MiniJaJa.g:93:23: ^( 'print' exp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_61.nextNode(), root_1);
								adaptor.addChild(root_1, stream_exp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// MiniJaJa.g:93:40: String
							{
							String92=(Token)match(input,String,FOLLOW_String_in_instr827);  
							stream_String.add(String92);

							// AST REWRITE
							// elements: String
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 93:47: -> ^( PRINTS String )
							{
								// MiniJaJa.g:93:50: ^( PRINTS String )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINTS, "PRINTS"), root_1);
								adaptor.addChild(root_1, stream_String.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					char_literal93=(Token)match(input,42,FOLLOW_42_in_instr839);  
					stream_42.add(char_literal93);

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
		return retval;
	}
	// $ANTLR end "instr"


	public static class listexp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listexp"
	// MiniJaJa.g:104:1: listexp : ( exp ( ',' exp )* )? -> ^( LISTEXP ( exp )* ) ;
	public final MiniJaJaParser.listexp_return listexp() throws RecognitionException {
		MiniJaJaParser.listexp_return retval = new MiniJaJaParser.listexp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal95=null;
		ParserRuleReturnScope exp94 =null;
		ParserRuleReturnScope exp96 =null;

		CommonTree char_literal95_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// MiniJaJa.g:104:9: ( ( exp ( ',' exp )* )? -> ^( LISTEXP ( exp )* ) )
			// MiniJaJa.g:104:11: ( exp ( ',' exp )* )?
			{
			// MiniJaJa.g:104:11: ( exp ( ',' exp )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BOOL||LA20_0==IDF||LA20_0==INT||LA20_0==39||LA20_0==41||LA20_0==48) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// MiniJaJa.g:104:12: exp ( ',' exp )*
					{
					pushFollow(FOLLOW_exp_in_listexp852);
					exp94=exp();
					state._fsp--;

					stream_exp.add(exp94.getTree());
					// MiniJaJa.g:104:16: ( ',' exp )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==47) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// MiniJaJa.g:104:17: ',' exp
							{
							char_literal95=(Token)match(input,47,FOLLOW_47_in_listexp855);  
							stream_47.add(char_literal95);

							pushFollow(FOLLOW_exp_in_listexp857);
							exp96=exp();
							state._fsp--;

							stream_exp.add(exp96.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

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
			// 104:29: -> ^( LISTEXP ( exp )* )
			{
				// MiniJaJa.g:104:32: ^( LISTEXP ( exp )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTEXP, "LISTEXP"), root_1);
				// MiniJaJa.g:104:42: ( exp )*
				while ( stream_exp.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "listexp"


	public static class exp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// MiniJaJa.g:107:1: exp : ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )* ;
	public final MiniJaJaParser.exp_return exp() throws RecognitionException {
		MiniJaJaParser.exp_return retval = new MiniJaJaParser.exp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal97=null;
		Token string_literal100=null;
		Token string_literal102=null;
		ParserRuleReturnScope exp198 =null;
		ParserRuleReturnScope exp199 =null;
		ParserRuleReturnScope exp1101 =null;
		ParserRuleReturnScope exp1103 =null;

		CommonTree char_literal97_tree=null;
		CommonTree string_literal100_tree=null;
		CommonTree string_literal102_tree=null;

		try {
			// MiniJaJa.g:107:5: ( ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )* )
			// MiniJaJa.g:107:7: ( '!' ^ exp1 | exp1 ) ( '&&' ^ exp1 | '||' ^ exp1 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// MiniJaJa.g:107:7: ( '!' ^ exp1 | exp1 )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==39) ) {
				alt21=1;
			}
			else if ( (LA21_0==BOOL||LA21_0==IDF||LA21_0==INT||LA21_0==41||LA21_0==48) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// MiniJaJa.g:107:8: '!' ^ exp1
					{
					char_literal97=(Token)match(input,39,FOLLOW_39_in_exp880); 
					char_literal97_tree = (CommonTree)adaptor.create(char_literal97);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal97_tree, root_0);

					pushFollow(FOLLOW_exp1_in_exp883);
					exp198=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp198.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:107:20: exp1
					{
					pushFollow(FOLLOW_exp1_in_exp887);
					exp199=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp199.getTree());

					}
					break;

			}

			// MiniJaJa.g:107:26: ( '&&' ^ exp1 | '||' ^ exp1 )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==40) ) {
					alt22=1;
				}
				else if ( (LA22_0==65) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// MiniJaJa.g:107:27: '&&' ^ exp1
					{
					string_literal100=(Token)match(input,40,FOLLOW_40_in_exp891); 
					string_literal100_tree = (CommonTree)adaptor.create(string_literal100);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal100_tree, root_0);

					pushFollow(FOLLOW_exp1_in_exp894);
					exp1101=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp1101.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:107:40: '||' ^ exp1
					{
					string_literal102=(Token)match(input,65,FOLLOW_65_in_exp898); 
					string_literal102_tree = (CommonTree)adaptor.create(string_literal102);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal102_tree, root_0);

					pushFollow(FOLLOW_exp1_in_exp901);
					exp1103=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp1103.getTree());

					}
					break;

				default :
					break loop22;
				}
			}

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
		return retval;
	}
	// $ANTLR end "exp"


	public static class exp1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp1"
	// MiniJaJa.g:110:1: exp1 : ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )* ;
	public final MiniJaJaParser.exp1_return exp1() throws RecognitionException {
		MiniJaJaParser.exp1_return retval = new MiniJaJaParser.exp1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope exp2104 =null;
		ParserRuleReturnScope exp2106 =null;
		ParserRuleReturnScope exp2108 =null;

		CommonTree string_literal105_tree=null;
		CommonTree char_literal107_tree=null;

		try {
			// MiniJaJa.g:110:6: ( ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )* )
			// MiniJaJa.g:110:8: ( exp2 ) ( '==' ^ exp2 | '>' ^ exp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// MiniJaJa.g:110:8: ( exp2 )
			// MiniJaJa.g:110:9: exp2
			{
			pushFollow(FOLLOW_exp2_in_exp1913);
			exp2104=exp2();
			state._fsp--;

			adaptor.addChild(root_0, exp2104.getTree());

			}

			// MiniJaJa.g:110:15: ( '==' ^ exp2 | '>' ^ exp2 )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==52) ) {
					alt23=1;
				}
				else if ( (LA23_0==53) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// MiniJaJa.g:110:16: '==' ^ exp2
					{
					string_literal105=(Token)match(input,52,FOLLOW_52_in_exp1917); 
					string_literal105_tree = (CommonTree)adaptor.create(string_literal105);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal105_tree, root_0);

					pushFollow(FOLLOW_exp2_in_exp1920);
					exp2106=exp2();
					state._fsp--;

					adaptor.addChild(root_0, exp2106.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:110:29: '>' ^ exp2
					{
					char_literal107=(Token)match(input,53,FOLLOW_53_in_exp1924); 
					char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal107_tree, root_0);

					pushFollow(FOLLOW_exp2_in_exp1927);
					exp2108=exp2();
					state._fsp--;

					adaptor.addChild(root_0, exp2108.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

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
		return retval;
	}
	// $ANTLR end "exp1"


	public static class exp2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exp2"
	// MiniJaJa.g:113:1: exp2 : ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )* ;
	public final MiniJaJaParser.exp2_return exp2() throws RecognitionException {
		MiniJaJaParser.exp2_return retval = new MiniJaJaParser.exp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal109=null;
		Token char_literal112=null;
		Token char_literal114=null;
		ParserRuleReturnScope terme110 =null;
		ParserRuleReturnScope terme111 =null;
		ParserRuleReturnScope terme113 =null;
		ParserRuleReturnScope terme115 =null;

		CommonTree char_literal109_tree=null;
		CommonTree char_literal112_tree=null;
		CommonTree char_literal114_tree=null;

		try {
			// MiniJaJa.g:113:6: ( ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )* )
			// MiniJaJa.g:113:8: ( '-' ^ terme | terme ) ( '+' ^ terme | '-' ^ terme )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// MiniJaJa.g:113:8: ( '-' ^ terme | terme )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==48) ) {
				alt24=1;
			}
			else if ( (LA24_0==BOOL||LA24_0==IDF||LA24_0==INT||LA24_0==41) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// MiniJaJa.g:113:9: '-' ^ terme
					{
					char_literal109=(Token)match(input,48,FOLLOW_48_in_exp2939); 
					char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);

					pushFollow(FOLLOW_terme_in_exp2942);
					terme110=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme110.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:113:22: terme
					{
					pushFollow(FOLLOW_terme_in_exp2946);
					terme111=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme111.getTree());

					}
					break;

			}

			// MiniJaJa.g:113:29: ( '+' ^ terme | '-' ^ terme )*
			loop25:
			while (true) {
				int alt25=3;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==44) ) {
					alt25=1;
				}
				else if ( (LA25_0==48) ) {
					alt25=2;
				}

				switch (alt25) {
				case 1 :
					// MiniJaJa.g:113:30: '+' ^ terme
					{
					char_literal112=(Token)match(input,44,FOLLOW_44_in_exp2950); 
					char_literal112_tree = (CommonTree)adaptor.create(char_literal112);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal112_tree, root_0);

					pushFollow(FOLLOW_terme_in_exp2953);
					terme113=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme113.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:113:43: '-' ^ terme
					{
					char_literal114=(Token)match(input,48,FOLLOW_48_in_exp2957); 
					char_literal114_tree = (CommonTree)adaptor.create(char_literal114);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal114_tree, root_0);

					pushFollow(FOLLOW_terme_in_exp2960);
					terme115=terme();
					state._fsp--;

					adaptor.addChild(root_0, terme115.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

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
		return retval;
	}
	// $ANTLR end "exp2"


	public static class terme_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "terme"
	// MiniJaJa.g:116:1: terme : fact ( '*' ^ fact | '/' ^ fact )* ;
	public final MiniJaJaParser.terme_return terme() throws RecognitionException {
		MiniJaJaParser.terme_return retval = new MiniJaJaParser.terme_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal117=null;
		Token char_literal119=null;
		ParserRuleReturnScope fact116 =null;
		ParserRuleReturnScope fact118 =null;
		ParserRuleReturnScope fact120 =null;

		CommonTree char_literal117_tree=null;
		CommonTree char_literal119_tree=null;

		try {
			// MiniJaJa.g:116:7: ( fact ( '*' ^ fact | '/' ^ fact )* )
			// MiniJaJa.g:116:9: fact ( '*' ^ fact | '/' ^ fact )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_fact_in_terme971);
			fact116=fact();
			state._fsp--;

			adaptor.addChild(root_0, fact116.getTree());

			// MiniJaJa.g:116:14: ( '*' ^ fact | '/' ^ fact )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==43) ) {
					alt26=1;
				}
				else if ( (LA26_0==49) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// MiniJaJa.g:116:15: '*' ^ fact
					{
					char_literal117=(Token)match(input,43,FOLLOW_43_in_terme974); 
					char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal117_tree, root_0);

					pushFollow(FOLLOW_fact_in_terme977);
					fact118=fact();
					state._fsp--;

					adaptor.addChild(root_0, fact118.getTree());

					}
					break;
				case 2 :
					// MiniJaJa.g:116:27: '/' ^ fact
					{
					char_literal119=(Token)match(input,49,FOLLOW_49_in_terme981); 
					char_literal119_tree = (CommonTree)adaptor.create(char_literal119);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal119_tree, root_0);

					pushFollow(FOLLOW_fact_in_terme984);
					fact120=fact();
					state._fsp--;

					adaptor.addChild(root_0, fact120.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

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
		return retval;
	}
	// $ANTLR end "terme"


	public static class fact_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fact"
	// MiniJaJa.g:119:1: fact : ( ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELE ident listexp ) | -> ident ) | BOOL | ent | '(' exp ')' -> exp );
	public final MiniJaJaParser.fact_return fact() throws RecognitionException {
		MiniJaJaParser.fact_return retval = new MiniJaJaParser.fact_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal122=null;
		Token char_literal124=null;
		Token char_literal125=null;
		Token char_literal127=null;
		Token BOOL128=null;
		Token char_literal130=null;
		Token char_literal132=null;
		ParserRuleReturnScope ident121 =null;
		ParserRuleReturnScope exp123 =null;
		ParserRuleReturnScope listexp126 =null;
		ParserRuleReturnScope ent129 =null;
		ParserRuleReturnScope exp131 =null;

		CommonTree char_literal122_tree=null;
		CommonTree char_literal124_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree BOOL128_tree=null;
		CommonTree char_literal130_tree=null;
		CommonTree char_literal132_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
		RewriteRuleSubtreeStream stream_listexp=new RewriteRuleSubtreeStream(adaptor,"rule listexp");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// MiniJaJa.g:119:6: ( ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELE ident listexp ) | -> ident ) | BOOL | ent | '(' exp ')' -> exp )
			int alt28=4;
			switch ( input.LA(1) ) {
			case IDF:
				{
				alt28=1;
				}
				break;
			case BOOL:
				{
				alt28=2;
				}
				break;
			case INT:
				{
				alt28=3;
				}
				break;
			case 41:
				{
				alt28=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// MiniJaJa.g:119:8: ident ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELE ident listexp ) | -> ident )
					{
					pushFollow(FOLLOW_ident_in_fact995);
					ident121=ident();
					state._fsp--;

					stream_ident.add(ident121.getTree());
					// MiniJaJa.g:119:13: ( '[' exp ']' -> ^( TAB ident exp ) | '(' listexp ')' -> ^( APPELE ident listexp ) | -> ident )
					int alt27=3;
					switch ( input.LA(1) ) {
					case 54:
						{
						alt27=1;
						}
						break;
					case 41:
						{
						alt27=2;
						}
						break;
					case 40:
					case 42:
					case 43:
					case 44:
					case 47:
					case 48:
					case 49:
					case 50:
					case 52:
					case 53:
					case 55:
					case 64:
					case 65:
						{
						alt27=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// MiniJaJa.g:119:14: '[' exp ']'
							{
							char_literal122=(Token)match(input,54,FOLLOW_54_in_fact997);  
							stream_54.add(char_literal122);

							pushFollow(FOLLOW_exp_in_fact998);
							exp123=exp();
							state._fsp--;

							stream_exp.add(exp123.getTree());
							char_literal124=(Token)match(input,55,FOLLOW_55_in_fact999);  
							stream_55.add(char_literal124);

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
							// 119:24: -> ^( TAB ident exp )
							{
								// MiniJaJa.g:119:27: ^( TAB ident exp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TAB, "TAB"), root_1);
								adaptor.addChild(root_1, stream_ident.nextTree());
								adaptor.addChild(root_1, stream_exp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// MiniJaJa.g:119:45: '(' listexp ')'
							{
							char_literal125=(Token)match(input,41,FOLLOW_41_in_fact1012);  
							stream_41.add(char_literal125);

							pushFollow(FOLLOW_listexp_in_fact1014);
							listexp126=listexp();
							state._fsp--;

							stream_listexp.add(listexp126.getTree());
							char_literal127=(Token)match(input,42,FOLLOW_42_in_fact1016);  
							stream_42.add(char_literal127);

							// AST REWRITE
							// elements: listexp, ident
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 119:61: -> ^( APPELE ident listexp )
							{
								// MiniJaJa.g:119:64: ^( APPELE ident listexp )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPELE, "APPELE"), root_1);
								adaptor.addChild(root_1, stream_ident.nextTree());
								adaptor.addChild(root_1, stream_listexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// MiniJaJa.g:119:90: 
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
							// 119:90: -> ident
							{
								adaptor.addChild(root_0, stream_ident.nextTree());
							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// MiniJaJa.g:120:5: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL128=(Token)match(input,BOOL,FOLLOW_BOOL_in_fact1039); 
					BOOL128_tree = (CommonTree)adaptor.create(BOOL128);
					adaptor.addChild(root_0, BOOL128_tree);

					}
					break;
				case 3 :
					// MiniJaJa.g:121:5: ent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ent_in_fact1045);
					ent129=ent();
					state._fsp--;

					adaptor.addChild(root_0, ent129.getTree());

					}
					break;
				case 4 :
					// MiniJaJa.g:122:5: '(' exp ')'
					{
					char_literal130=(Token)match(input,41,FOLLOW_41_in_fact1051);  
					stream_41.add(char_literal130);

					pushFollow(FOLLOW_exp_in_fact1053);
					exp131=exp();
					state._fsp--;

					stream_exp.add(exp131.getTree());
					char_literal132=(Token)match(input,42,FOLLOW_42_in_fact1055);  
					stream_42.add(char_literal132);

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
					// 122:17: -> exp
					{
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
		return retval;
	}
	// $ANTLR end "fact"


	public static class typemeth_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typemeth"
	// MiniJaJa.g:125:1: typemeth : ( VOID | type );
	public final MiniJaJaParser.typemeth_return typemeth() throws RecognitionException {
		MiniJaJaParser.typemeth_return retval = new MiniJaJaParser.typemeth_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VOID133=null;
		ParserRuleReturnScope type134 =null;

		CommonTree VOID133_tree=null;

		try {
			// MiniJaJa.g:125:10: ( VOID | type )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==VOID) ) {
				alt29=1;
			}
			else if ( (LA29_0==TYPE) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// MiniJaJa.g:125:12: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID133=(Token)match(input,VOID,FOLLOW_VOID_in_typemeth1068); 
					VOID133_tree = (CommonTree)adaptor.create(VOID133);
					adaptor.addChild(root_0, VOID133_tree);

					}
					break;
				case 2 :
					// MiniJaJa.g:126:6: type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_typemeth1075);
					type134=type();
					state._fsp--;

					adaptor.addChild(root_0, type134.getTree());

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
		return retval;
	}
	// $ANTLR end "typemeth"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// MiniJaJa.g:129:1: type : TYPE ;
	public final MiniJaJaParser.type_return type() throws RecognitionException {
		MiniJaJaParser.type_return retval = new MiniJaJaParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPE135=null;

		CommonTree TYPE135_tree=null;

		try {
			// MiniJaJa.g:129:6: ( TYPE )
			// MiniJaJa.g:129:7: TYPE
			{
			root_0 = (CommonTree)adaptor.nil();


			TYPE135=(Token)match(input,TYPE,FOLLOW_TYPE_in_type1083); 
			TYPE135_tree = (CommonTree)adaptor.create(TYPE135);
			adaptor.addChild(root_0, TYPE135_tree);

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
		return retval;
	}
	// $ANTLR end "type"


	public static class ent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ent"
	// MiniJaJa.g:132:1: ent : INT -> ^( NBRE INT ) ;
	public final MiniJaJaParser.ent_return ent() throws RecognitionException {
		MiniJaJaParser.ent_return retval = new MiniJaJaParser.ent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT136=null;

		CommonTree INT136_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// MiniJaJa.g:132:6: ( INT -> ^( NBRE INT ) )
			// MiniJaJa.g:132:9: INT
			{
			INT136=(Token)match(input,INT,FOLLOW_INT_in_ent1094);  
			stream_INT.add(INT136);

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
			// 132:13: -> ^( NBRE INT )
			{
				// MiniJaJa.g:132:16: ^( NBRE INT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NBRE, "NBRE"), root_1);
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
		return retval;
	}
	// $ANTLR end "ent"

	// Delegated rules



	public static final BitSet FOLLOW_fichier_in_axiom179 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classe_in_fichier193 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_classe204 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_classe206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_classe208 = new BitSet(new long[]{0x1400002100000000L});
	public static final BitSet FOLLOW_decls_in_classe209 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_methmain_in_classe211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_classe212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_ident233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decls251 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_decls253 = new BitSet(new long[]{0x0400002100000002L});
	public static final BitSet FOLLOW_typemeth_in_decl273 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_decl275 = new BitSet(new long[]{0x0048020000000000L});
	public static final BitSet FOLLOW_vexp_in_decl279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_decl295 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_decl297 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_decl299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methode_in_decl316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalvar_in_decl334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_varz346 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_varz348 = new BitSet(new long[]{0x0400002100000002L});
	public static final BitSet FOLLOW_typemeth_in_vars369 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_vars371 = new BitSet(new long[]{0x0048000000000000L});
	public static final BitSet FOLLOW_vexp_in_vars374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_vars390 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_vars392 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_vars394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalvar_in_vars412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_finalvar421 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_type_in_finalvar423 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_finalvar425 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_vexp_in_finalvar427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_vexp448 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_vexp450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_methode470 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_type_in_methode473 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_methode475 = new BitSet(new long[]{0x0000840000000000L});
	public static final BitSet FOLLOW_47_in_methode478 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_type_in_methode480 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ident_in_methode482 = new BitSet(new long[]{0x0000840000000000L});
	public static final BitSet FOLLOW_42_in_methode489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_methode491 = new BitSet(new long[]{0xEC00002100008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_varz_in_methode492 = new BitSet(new long[]{0xE800000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instrs_in_methode494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_methode495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_methmain521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_methmain523 = new BitSet(new long[]{0xEC00002100008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_varz_in_methmain524 = new BitSet(new long[]{0xE800000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instrs_in_methmain526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_methmain527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instr_in_instrs548 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_instrs550 = new BitSet(new long[]{0xE800000000008002L});
	public static final BitSet FOLLOW_ident_in_instr571 = new BitSet(new long[]{0x0048620000000000L});
	public static final BitSet FOLLOW_51_in_instr582 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_instr599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_instr611 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_instr634 = new BitSet(new long[]{0x0001068000088100L});
	public static final BitSet FOLLOW_listexp_in_instr635 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_instr636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_instr657 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr658 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_instr659 = new BitSet(new long[]{0x0008600000000000L});
	public static final BitSet FOLLOW_51_in_instr662 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_instr682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_instr700 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_instr732 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_instr748 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_instr752 = new BitSet(new long[]{0xE800000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instrs_in_instr754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_instr756 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_instr759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_instr761 = new BitSet(new long[]{0xE800000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instrs_in_instr763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_instr765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_instr787 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_instr789 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_instr790 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_instr791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_instr793 = new BitSet(new long[]{0xE800000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_instrs_in_instr794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_instr795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_instr812 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_instr814 = new BitSet(new long[]{0x0001028010088100L});
	public static final BitSet FOLLOW_exp_in_instr816 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_String_in_instr827 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_instr839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_listexp852 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_listexp855 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_listexp857 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_39_in_exp880 = new BitSet(new long[]{0x0001020000088100L});
	public static final BitSet FOLLOW_exp1_in_exp883 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_exp887 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exp891 = new BitSet(new long[]{0x0001020000088100L});
	public static final BitSet FOLLOW_exp1_in_exp894 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_exp898 = new BitSet(new long[]{0x0001020000088100L});
	public static final BitSet FOLLOW_exp1_in_exp901 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_exp2_in_exp1913 = new BitSet(new long[]{0x0030000000000002L});
	public static final BitSet FOLLOW_52_in_exp1917 = new BitSet(new long[]{0x0001020000088100L});
	public static final BitSet FOLLOW_exp2_in_exp1920 = new BitSet(new long[]{0x0030000000000002L});
	public static final BitSet FOLLOW_53_in_exp1924 = new BitSet(new long[]{0x0001020000088100L});
	public static final BitSet FOLLOW_exp2_in_exp1927 = new BitSet(new long[]{0x0030000000000002L});
	public static final BitSet FOLLOW_48_in_exp2939 = new BitSet(new long[]{0x0000020000088100L});
	public static final BitSet FOLLOW_terme_in_exp2942 = new BitSet(new long[]{0x0001100000000002L});
	public static final BitSet FOLLOW_terme_in_exp2946 = new BitSet(new long[]{0x0001100000000002L});
	public static final BitSet FOLLOW_44_in_exp2950 = new BitSet(new long[]{0x0000020000088100L});
	public static final BitSet FOLLOW_terme_in_exp2953 = new BitSet(new long[]{0x0001100000000002L});
	public static final BitSet FOLLOW_48_in_exp2957 = new BitSet(new long[]{0x0000020000088100L});
	public static final BitSet FOLLOW_terme_in_exp2960 = new BitSet(new long[]{0x0001100000000002L});
	public static final BitSet FOLLOW_fact_in_terme971 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_43_in_terme974 = new BitSet(new long[]{0x0000020000088100L});
	public static final BitSet FOLLOW_fact_in_terme977 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_49_in_terme981 = new BitSet(new long[]{0x0000020000088100L});
	public static final BitSet FOLLOW_fact_in_terme984 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_ident_in_fact995 = new BitSet(new long[]{0x0040020000000002L});
	public static final BitSet FOLLOW_54_in_fact997 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_fact998 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_fact999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_fact1012 = new BitSet(new long[]{0x0001068000088100L});
	public static final BitSet FOLLOW_listexp_in_fact1014 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_fact1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_fact1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ent_in_fact1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_fact1051 = new BitSet(new long[]{0x0001028000088100L});
	public static final BitSet FOLLOW_exp_in_fact1053 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_fact1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_typemeth1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typemeth1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ent1094 = new BitSet(new long[]{0x0000000000000002L});
}
