import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MiniJaJaLexer lex = new MiniJaJaLexer(new ANTLRFileStream("/home/frosqh/Downloads/synonymie.mjj", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MiniJaJaParser g = new MiniJaJaParser(tokens, 49100, null);
        try {
            g.axiom();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}