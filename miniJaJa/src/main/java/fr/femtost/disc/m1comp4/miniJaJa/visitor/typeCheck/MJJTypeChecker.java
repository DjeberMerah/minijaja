package fr.femtost.disc.m1comp4.miniJaJa.visitor.typeCheck;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.*;
import fr.femtost.disc.m1comp4.miniJaJa.decls.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJOmega;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJBool;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNeg;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdenTab;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.*;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJInc;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;
import fr.femtost.disc.m1comp4.memory.symbolTable.ScopeSymbolTable;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJTypeChecker implements IMJJVisitor {

    private MJJTypeChecker() {}

    private static MJJTypeChecker INSTANCE = new MJJTypeChecker();

    private static ScopeSymbolTable ssTable;

    public static void typeCheck(MJJClass mjjClass) {
        ssTable = new ScopeSymbolTable();
        mjjClass.accept(INSTANCE);

    }

    public Object visit(MJJAdd mjjAdd) {

        EType lexpType = (EType)mjjAdd.getLeftExp().accept(this);
        EType rexpType = (EType)mjjAdd.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "+", EType.INTEGER);
    }

    public Object visit(MJJAffect mjjAffect) {

        EType idType = (EType)mjjAffect.getId().accept(this);
        EType expType = (EType)mjjAffect.getExp().accept(this);

        return ErrorTypeManager.assertEquals(idType, expType, mjjAffect.getLineNumber(),mjjAffect.getColumnNumber());
    }

    public Object visit(MJJAnd mjjAnd) {

        EType lexpType = (EType)mjjAnd.getLeftExp().accept(this);
        EType rexpType = (EType)mjjAnd.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "&&", EType.BOOLEAN);
    }

    public Object visit(MJJBool mjjBool) {
        return EType.BOOLEAN; }

    public Object visit(MJJCallE mjjCallE) { return null; } //TODO R2

    public Object visit(MJJCallI mjjCallI) { return null; } //TODO R2

    public Object visit(MJJClass mjjClass) {

        ssTable.beginScope();
        for (MJJDecl d : mjjClass.getDecls()) d.accept(this);

        mjjClass.getMain().accept(this);
        ssTable.endScope();

        return null;
    }

    public Object visit(MJJConst mjjConst) {

        if (mjjConst.getExp() != null) {

            EType expType = (EType)mjjConst.getExp().accept(this);
            if (ErrorTypeManager.assertEquals(mjjConst.getType(), expType,mjjConst.getLineNumber(),mjjConst.getColumnNumber()) == null) return null;

        }

        ssTable.putSymbol(mjjConst.getId().getLabel(), mjjConst.getType());

        return null;
    }

    public Object visit(MJJDiv mjjDiv) {

        EType lexpType = (EType)mjjDiv.getLeftExp().accept(this);
        EType rexpType = (EType)mjjDiv.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "/", EType.INTEGER);
    }

    public Object visit(MJJEqual mjjEqual) {

        EType lexpType = (EType)mjjEqual.getLeftExp().accept(this);
        EType rexpType = (EType)mjjEqual.getRightExp().accept(this);

        if (ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "==", EType.BOOLEAN, EType.INTEGER) != null){
            return EType.BOOLEAN;
        }

        return null;
    }

    public Object visit(MJJGreaterThan mjjGreaterThan) {

        EType lexpType = (EType)mjjGreaterThan.getLeftExp().accept(this);
        EType rexpType = (EType)mjjGreaterThan.getRightExp().accept(this);

        if (ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, ">", EType.INTEGER) != null){
            return EType.BOOLEAN;
        }
        return null;
    }

    public Object visit(MJJHeader mjjHeader) { return mjjHeader.getType(); }

    public Object visit(MJJIf mjjIf) {

        //Condition
        EType conditionType = (EType)mjjIf.getCondition().accept(this);
        ErrorTypeManager.assertEquals(EType.BOOLEAN, conditionType,mjjIf.getLineNumber(),mjjIf.getColumnNumber());

        //Then instructions block
        ssTable.beginScope();
        for (MJJInstr i : mjjIf.getThenInstrs()) i.accept(this);
        ssTable.endScope();

        //Else instructions block
        ssTable.beginScope();
        for (MJJInstr i : mjjIf.getElseInstrs()) i.accept(this);
        ssTable.endScope();

        return null;
    }

    public Object visit(MJJInc mjjInc) {

        EType expType = (EType)mjjInc.getId().accept(this);

        return ErrorTypeManager.assertEqualsUnaryOperator(expType, "++", EType.INTEGER);
    }

    public Object visit(MJJIdent mjjIdent) {
        EType a = (EType) ssTable.getSymbol(mjjIdent.getLabel(),false);
        if (a != null) return a;
        ErrorTypeManager.identNotFound(mjjIdent.getLabel(), mjjIdent.getLineNumber(), mjjIdent.getColumnNumber());
        return null;
    }

    public Object visit(MJJIdenTab mjjIdenTab) {

        return mjjIdenTab.getId().accept(this);
    }

    public Object visit(MJJMain mjjMain) {

        ssTable.beginScope();
        for (MJJNotMethDecl d : mjjMain.getVars()) d.accept(this);
        for (MJJInstr i : mjjMain.getInstrs()) i.accept(this);
        ssTable.endScope();

        return null;
    }

    public Object visit(MJJMeth mjjMeth) {

        ssTable.putSymbol(mjjMeth.getId().getLabel(), mjjMeth);
        for (MJJHeader h : mjjMeth.getHeaders()) h.accept(this);

        ssTable.beginScope();
        for (MJJHeader h : mjjMeth.getHeaders()) h.accept(this);
        for (MJJNotMethDecl d : mjjMeth.getVars()) d.accept(this);

        int i;
        for (i = 0 ; i < mjjMeth.getInstrs().size() -  1; i++)
            mjjMeth.getInstrs().get(i).accept(this);

        if (!mjjMeth.getType().equals(EType.VOID)) { //The return type must be checked

            EType returnType = (EType)mjjMeth.getInstrs().get(i).accept(this);
            ErrorTypeManager.assertEquals(mjjMeth.getType(), returnType, mjjMeth.getLineNumber(), mjjMeth.getColumnNumber());

        } else mjjMeth.getInstrs().get(i).accept(this);
        ssTable.endScope();

        return null;
    }

    public Object visit(MJJMult mjjMult) {

        EType lexpType = (EType)mjjMult.getLeftExp().accept(this);
        EType rexpType = (EType)mjjMult.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "*", EType.INTEGER);
    }

    public Object visit(MJJNum mjjNum) { return EType.INTEGER; }

    public Object visit(MJJNeg mjjNeg) {

        EType expType = (EType)mjjNeg.getExp().accept(this);

        return ErrorTypeManager.assertEqualsUnaryOperator(expType, "-", EType.INTEGER);
    }

    public Object visit(MJJNot mjjNot) {

        EType expType = (EType)mjjNot.getExp().accept(this);

        return ErrorTypeManager.assertEqualsUnaryOperator(expType, "!", EType.BOOLEAN);
    }

    public Object visit(MJJOr mjjOr)  {

        EType lexpType = (EType)mjjOr.getLeftExp().accept(this);
        EType rexpType = (EType)mjjOr.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "||", EType.BOOLEAN);
    }

    public Object visit(MJJReturn mjjReturn) { return mjjReturn.getExp().accept(this); }

    public Object visit(MJJSub mjjSub)  {

        EType lexpType = (EType)mjjSub.getLeftExp().accept(this);
        EType rexpType = (EType)mjjSub.getRightExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(lexpType, rexpType, "-", EType.INTEGER);
    }

    public Object visit(MJJSum mjjSum)  {

        EType idType = (EType)mjjSum.getId().accept(this);
        EType expType = (EType)mjjSum.getExp().accept(this);

        return ErrorTypeManager.assertEqualsBinaryOperator(idType, expType, "+=", EType.INTEGER);
    }

    public Object visit(MJJTab mjjTab) {
        //TODO Considérer le fait que mjjTab crée un tableau, utile pour des tests sémantiques
        ssTable.putSymbol(mjjTab.getId().getLabel(), mjjTab.getType());

        return null;
    }

    public Object visit(MJJVar mjjVar) {

        if (mjjVar.getExp() != null) {

            EType expType = (EType)mjjVar.getExp().accept(this);
            if (ErrorTypeManager.assertEquals(mjjVar.getType(), expType, mjjVar.getLineNumber(), mjjVar.getColumnNumber(),true) == null) return null;

        }

        ssTable.putSymbol(mjjVar.getId().getLabel(), mjjVar.getType());

        return null;
    }

    public Object visit(MJJWhile mjjWhile) {

        EType conditionType = (EType)mjjWhile.getCondition().accept(this);
        ErrorTypeManager.assertEquals(EType.BOOLEAN, conditionType, mjjWhile.getLineNumber(), mjjWhile.getColumnNumber());

        ssTable.beginScope();
        for (MJJInstr i : mjjWhile.getInstrs()) i.accept(this);
        ssTable.endScope();

        return null;
    }

    public Object visit(MJJOmega mjjOmega) {
        return EType.OMEGA;
    }

    public Object visit(MJJPrint mjjPrint) {
        return null;
    }

    @Override
    public Object visit(MJJPrintS mjjPrintS) {
        return null;
    }
}