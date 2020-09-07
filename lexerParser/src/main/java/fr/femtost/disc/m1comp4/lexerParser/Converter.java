package fr.femtost.disc.m1comp4.lexerParser;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.MJJClass;
import fr.femtost.disc.m1comp4.miniJaJa.MJJHeader;
import fr.femtost.disc.m1comp4.miniJaJa.MJJMain;
import fr.femtost.disc.m1comp4.miniJaJa.decls.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJOmega;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJBool;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNeg;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJId;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdenTab;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.*;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJInc;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public abstract class Converter {

    public static MJJClass treeToClasses(CommonTree AST) {
        return parseClass(AST);
    }

    private static ArrayList<MJJDecl> parseDecls(Tree node){
        ArrayList<MJJDecl> decls = new ArrayList<>();
        for (int i = 0; i < node.getChildCount(); i++) {
            MJJDecl decl = parseDecl(node.getChild(i));
            decls.add(decl);
        }
        return decls;
    }

    private static ArrayList<MJJNotMethDecl> parseVars(Tree node){
        ArrayList<MJJNotMethDecl> vars  = new ArrayList<>();
        for (int i = 0; i < node.getChildCount(); i++) {
            MJJNotMethDecl var = parseBigVar(node.getChild(i));
            vars.add(var);
        }
        return vars;
    }

    private static ArrayList<MJJInstr> parseInstrs(Tree node){
        ArrayList<MJJInstr> instrs = new ArrayList<>();
        for (int i = 0;i<node.getChildCount();i++){
            MJJInstr instr = parseInstr(node.getChild(i));
            instrs.add(instr);
        }
        return instrs;
    }

    private static ArrayList<MJJExp> parseExps(Tree node){
        ArrayList<MJJExp> exps = new ArrayList<>();
        for (int i = 0; i < node.getChildCount();i++){
            MJJExp exp = parseExp(node.getChild(i));
            exps.add(exp);
        }
        return exps;
    }

    private static MJJId parseId(Tree child) {
        switch (child.getText()){
            case "TAB":
                return parseTab(child);
            case "IDENT":
                return parseIdent(child);
            default:
                return null;
        }

    }

    private static MJJDecl parseDecl(Tree child) {
        switch (child.getText()){
            case "VAR":
            case "CST":
            case "TABLEAU":
                return parseBigVar(child);
            case "METH":
                return parseMeth(child);
            default:
                return null;
        }
    }

    private static MJJNotMethDecl parseBigVar(Tree child) {
        switch (child.getText()){
            case "VAR":
                return parseVar(child);
            case "TABLEAU":
                return parseTableau(child);
            case "CST":
                return parseCst(child);
            default:
                return null;
        }
    }

    private static MJJExPrime parseExpPrime(Tree AST){
        switch (AST.getText()){
            case "VIDE":
                return new MJJOmega(AST.getLine(),AST.getCharPositionInLine());
            case "APPELE":
                return parseAppelE(AST);
            case "&&":
                return parseAnd(AST);
            case "||":
                return parseOr(AST);
            case "!":
                return parseNot(AST);
            case "==":
                return parseEqual(AST);
            case ">":
                return parseGT(AST);
            case "-":
                return parseSubNeg(AST);
            case "+":
                return parseAdd(AST);
            case "*":
                return parseMul(AST);
            case "/":
                return parseDiv(AST);
            case "NBRE":
                return parseNbre(AST);
            case "true":
                return new MJJBool(true, AST.getLine(), AST.getCharPositionInLine());
            case "false":
                return new MJJBool(false, AST.getLine(), AST.getCharPositionInLine());
            default:
                return null;
        }
    }

    private static MJJInstr parseInstr(Tree AST){
        switch (AST.getText()){
            case "AFFECTATION":
                return parseAffectation(AST);
            case "INCREMENT":
                return parseIncrement(AST);
            case "SOMME":
                return parseSomme(AST);
            case "APPELI":
                return parseAppelI(AST);
            case "RETOUR":
                return parseRetour(AST);
            case "SI":
                return parseSi(AST);
            case "TANTQUE":
                return parseTantQue(AST);
            case "print":
                return parsePrint(AST);
            case "PRINTS":
                return parsePrintS(AST);
            default:
                return null;
        }
    }

    private static MJJExp parseExp(Tree AST){
        switch(AST.getText()){
            case "IDENT":
            case "TAB":
                return parseId(AST);
            default:
                return parseExpPrime(AST);
        }
    }

    private static EType parseType(Tree AST){
        return EType.get(AST.getText());
    }

    private static MJJClass parseClass(Tree AST){
        MJJIdent ident = parseIdent(AST.getChild(0));
        List<MJJDecl> decls = parseDecls(AST.getChild(1));
        MJJMain methmain = parseMain(AST.getChild(2));
        return new MJJClass( AST.getLine(), AST.getCharPositionInLine(), ident, decls, methmain);
    }

    private static MJJIdent parseIdent(Tree AST){
        return new MJJIdent(AST.getChild(0).getText(),AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJIdenTab parseTab(Tree AST){
        MJJIdent tabIdent = parseIdent(AST.getChild(0));
        MJJExPrime tabExp = parseExpPrime(AST.getChild(1));
        return new MJJIdenTab(tabIdent, tabExp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJVar parseVar(Tree AST){
        MJJIdent ident = parseIdent(AST.getChild(0));
        EType type = parseType(AST.getChild(1));
        MJJExp exp = new MJJOmega(AST.getLine(),AST.getCharPositionInLine());
        if (AST.getChildCount()>2)
            exp = parseExp(AST.getChild(2));
        return new MJJVar(type, ident, exp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJTab parseTableau(Tree AST){
        MJJIdent ident = parseIdent(AST.getChild(0));
        EType type = parseType(AST.getChild(1));
        MJJExPrime exp = parseExpPrime(AST.getChild(2));
        return new MJJTab(type, ident, exp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJMeth parseMeth(Tree AST){
        //TODO Regarder plus en détail
        EType type = parseType(AST.getChild(0));
        MJJIdent ident = parseIdent(AST.getChild(1));
        ArrayList<MJJHeader> params = new ArrayList<>();
        int i = 2;
        while (AST.getChild(i).getText().equals("PARAM")){
            EType paramType = parseType(AST.getChild(i).getChild(0));
            MJJIdent paramIdent = parseIdent(AST.getChild(i).getChild(1));
            params.add(new MJJHeader( AST.getLine(), AST.getCharPositionInLine(), paramType, paramIdent));
            i++;
        }
        ArrayList<MJJNotMethDecl> vars = parseVars(AST.getChild(i));
        ArrayList<MJJInstr> instrs = parseInstrs(AST.getChild(i + 1));
        return new MJJMeth(type, ident, params, vars, instrs, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJConst parseCst(Tree AST){
        EType type = parseType(AST.getChild(0));
        MJJIdent ident = parseIdent(AST.getChild(1));
        MJJExp exp = parseExp(AST.getChild(2));
        return new MJJConst(type, ident, exp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJAffect parseAffectation(Tree AST){
        MJJId motIdent = parseId(AST.getChild(0));
        MJJExp exp = parseExp(AST.getChild(1));
        return new MJJAffect(motIdent, exp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJMain parseMain(Tree AST){
        ArrayList<MJJNotMethDecl> vars = parseVars(AST.getChild(0));
        ArrayList<MJJInstr> instrs = parseInstrs(AST.getChild(1));
        return new MJJMain(AST.getLine(), AST.getCharPositionInLine(), vars, instrs);
    }

    private static MJJInc parseIncrement(Tree AST){
        MJJId motIdent = parseId(AST.getChild(0));
        return new MJJInc(motIdent, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJSum parseSomme(Tree AST){
        MJJId motIdent = parseId(AST.getChild(0));
        MJJExp exp = parseExp(AST.getChild(1));
        return new MJJSum(AST.getLine(), AST.getCharPositionInLine(), motIdent, exp);
    }

    private static MJJCallE parseAppelE(Tree AST){
        MJJIdent ident = parseIdent(AST.getChild(0));
        ArrayList<MJJExp> exps = parseExps(AST.getChild(1));
        return new MJJCallE(ident,AST.getLine(), AST.getCharPositionInLine(), exps.toArray(new MJJExp[exps.size()]));
    }

    private static MJJCallI parseAppelI(Tree AST){
        MJJIdent ident = parseIdent(AST.getChild(0));
        ArrayList<MJJExp> exps = parseExps(AST.getChild(1));
        return new MJJCallI(AST.getLine(), AST.getCharPositionInLine(), ident, exps);
    }

    private static MJJReturn parseRetour(Tree AST){
        MJJExp exp = parseExp(AST.getChild(0));
        return new MJJReturn(AST.getLine(), AST.getCharPositionInLine(), exp);
    }

    private static MJJIf parseSi(Tree AST){
        MJJExp exp = parseExp(AST.getChild(0));
        ArrayList<MJJInstr> ifInstrs = parseInstrs(AST.getChild(1));
        ArrayList<MJJInstr> elseInstrs;
        if (AST.getChildCount() > 2)
            elseInstrs=parseInstrs(AST.getChild(2));
        else
            elseInstrs=new ArrayList<>();
        return new MJJIf(AST.getLine(), AST.getCharPositionInLine(), exp, ifInstrs, elseInstrs);
    }

    private static MJJWhile parseTantQue(Tree AST){
        MJJExp exp = parseExp(AST.getChild(0));
        ArrayList<MJJInstr> instrs = parseInstrs(AST.getChild(1));
        return new MJJWhile(AST.getLine(), AST.getCharPositionInLine(),exp, instrs);
    }

    private static MJJPrint parsePrint(Tree AST){
        return new MJJPrint(AST.getLine(), AST.getCharPositionInLine(), parseExp(AST.getChild(0)));
    }

    private static MJJInstr parsePrintS(Tree AST) {
        return new MJJPrintS(AST.getLine(), AST.getCharPositionInLine(), AST.getChild(0).getText());
    }

    private static MJJAnd parseAnd(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJAnd(leftexp, rightexp, AST.getLine(), AST.getCharPositionInLine());
    }

    private static MJJOr parseOr(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJOr(leftexp, rightexp, AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJNot parseNot(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        return new MJJNot(leftexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJEqual parseEqual(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJEqual(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJGreaterThan parseGT(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJGreaterThan(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJExPrime parseSubNeg(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        if (AST.getChildCount() > 1) {
            MJJExp rightexp = parseExp(AST.getChild(1));
            return new MJJSub(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
        }
        return new MJJNeg(leftexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJAdd parseAdd(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJAdd(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJMult parseMul(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJMult(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJDiv parseDiv(Tree AST){
        MJJExp leftexp = parseExp(AST.getChild(0));
        MJJExp rightexp = parseExp(AST.getChild(1));
        return new MJJDiv(leftexp, rightexp,AST.getLine(),AST.getCharPositionInLine());
    }

    private static MJJNum parseNbre(Tree AST){
        return new MJJNum(Integer.parseInt(AST.getChild(0).getText()),AST.getLine(),AST.getCharPositionInLine());
    }

}
