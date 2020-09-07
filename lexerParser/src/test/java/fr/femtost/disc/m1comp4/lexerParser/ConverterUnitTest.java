package fr.femtost.disc.m1comp4.lexerParser;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.JJCPrinter;
import fr.femtost.disc.m1comp4.miniJaJa.MJJClass;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.MJJCompilator;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.MJJInterpretor;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ConverterUnitTest {

    @Test
    public void testSimpleInter() throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get("../Programmes/MiniJaJa/Basique/comparaison_if.mjj"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        System.setErr(ps);
        CommonTree AST = Analyzer.getAstFromSource(new String(encoded));
        MJJClass classe = Converter.treeToClasses(AST);
        MJJInterpretor.interpret(classe);
        System.setErr(old);
    }

    @Test
    public void testSimpleCompile() throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get("../Programmes/MiniJaJa/Basique/comparaison_if.mjj"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        System.setErr(ps);
        CommonTree AST = Analyzer.getAstFromSource(new String(encoded));
        MJJClass classe = Converter.treeToClasses(AST);
        ArrayList<JJCInstr> l = MJJCompilator.compile(classe);
        System.out.println(JJCPrinter.toString(l));
        System.setErr(old);
    }
}
