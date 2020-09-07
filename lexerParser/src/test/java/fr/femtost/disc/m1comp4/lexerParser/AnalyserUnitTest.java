package fr.femtost.disc.m1comp4.lexerParser;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AnalyserUnitTest {

    private class DiskFileExplorer {


        private final String initialPath;
        private Boolean recursivePath;
        private final List<String> authExt = Arrays.asList("mjj");

        public DiskFileExplorer(String path, Boolean subFolder){
            initialPath = path;
            recursivePath = subFolder;
        }

        public List<String> list() {
            return listDirectory(initialPath);
        }

        private List<String> listDirectory(String dir){
            List<String> s = new ArrayList<>();
            String s2;
            String ext;
            File file = new File(dir);
            File[] files = file.listFiles();
            if (files==null) {
                return s;
            }
            for (File f : files) {
                ext = "";
                s2 = f.getName();
                int j = s2.lastIndexOf(".");
                if (j > 0)
                    ext = s2.substring(j + 1);
                if (authExt.contains(ext)) {
                    s.add(f.getAbsolutePath());
                }
                if (f.isDirectory() && recursivePath) {
                    s.addAll(listDirectory(f.getAbsolutePath()));
                }
            }
            return s;
        }
    }

    @Test
    public void testSimple() throws IOException {
        DiskFileExplorer diskFileExplorer = new DiskFileExplorer("../Programmes/MiniJaJa/Basique",true);
        List<String> l = diskFileExplorer.list();
        for (String s : l){
            byte[] encoded = Files.readAllBytes(Paths.get(s));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.err;
            System.setErr(ps);
            Analyzer.getAstFromSource(new String(encoded));
            System.setErr(old);
            Assert.assertTrue(baos.toString().length()==0);
        }
    }

    @Test
    public void testComplex() throws IOException {
        DiskFileExplorer diskFileExplorer = new DiskFileExplorer("../Programmes/MiniJaJa/Complexe",true);
        List<String> l = diskFileExplorer.list();
        for (String s : l){
            byte[] encoded = Files.readAllBytes(Paths.get(s));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.err;
            System.setErr(ps);
            Analyzer.getAstFromSource(new String(encoded));
            System.setErr(old);
            Assert.assertTrue(baos.toString().length()==0);
        }
    }

    @Test
    public void testFailSemantique() throws IOException {
        DiskFileExplorer diskFileExplorer = new DiskFileExplorer("../Programmes/MiniJaJa/Fail/semantique",true);
        List<String> l = diskFileExplorer.list();
        for (String s : l){
            System.out.println(s);
            byte[] encoded = Files.readAllBytes(Paths.get(s));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.err;
            System.setErr(ps);
            Analyzer.getAstFromSource(new String(encoded));
            System.setErr(old);
            System.out.println(baos.toString());
            Assert.assertTrue(baos.toString().length()==0);
        }
    }
    
    @Test
    public void testFailSyntaxique() throws IOException {
        DiskFileExplorer diskFileExplorer = new DiskFileExplorer("../Programmes/MiniJaJa/Fail/syntaxique",true);
        List<String> l = diskFileExplorer.list();
        for (String s : l){
            byte[] encoded = Files.readAllBytes(Paths.get(s));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.err;
            System.setErr(ps);
            Analyzer.getAstFromSource(new String(encoded));
            System.setErr(old);
            Assert.assertTrue(baos.toString().length()>0);
        }
    }

}
