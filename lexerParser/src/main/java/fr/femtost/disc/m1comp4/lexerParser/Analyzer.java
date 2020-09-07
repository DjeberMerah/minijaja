package fr.femtost.disc.m1comp4.lexerParser;

import fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated.MiniJaJaLexer;
import fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated.MiniJaJaParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public abstract class Analyzer {

    /**
     * Parse, analyze, and create the AST corresponding to a source code
     * @param sourceCode The String object containing source code to analyse
     * @return A CommonTree, the AST corresponding to the source code
     */
    public static CommonTree getAstFromSource(String sourceCode){
        CommonTree generatedAST;
        try {
            CharStream input = new ANTLRStringStream(sourceCode);
            MiniJaJaLexer miniJaJaLexer = new MiniJaJaLexer(input);
            CommonTokenStream commonTokenStream= new CommonTokenStream(miniJaJaLexer);
            MiniJaJaParser miniJaJaParser = new MiniJaJaParser(commonTokenStream);
            MiniJaJaParser.axiom_return r = miniJaJaParser.axiom();
            generatedAST = r.getTree();
        } catch (RecognitionException e) {
            System.err.println("Error at "+e.line+":"+e.charPositionInLine+", "+e.getMessage());
            return null;
        }
        if (ErrMessageConsole.isHasSeenError()){
            return null;
        }
        return generatedAST;
    }
}