package fr.femtost.disc.m1comp4.miniJaJa.visitor;

import fr.femtost.disc.m1comp4.miniJaJa.MJJClass;
import fr.femtost.disc.m1comp4.miniJaJa.MJJHeader;
import fr.femtost.disc.m1comp4.miniJaJa.MJJMain;
import fr.femtost.disc.m1comp4.miniJaJa.decls.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJOmega;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJBool;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNeg;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdenTab;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.*;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJInc;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;

public class MJJPrinter implements IMJJVisitor{
    StringBuilder s = new StringBuilder();

    public Object visit(MJJAdd mjjAdd) {
        mjjAdd.getLeftExp().accept(this);
        s.append(" + ");
        mjjAdd.getRightExp().accept(this);
        return null;
    }

    public Object visit(MJJAffect mjjAffect) {
        mjjAffect.getId().accept(this);
        s.append(" = ");
        mjjAffect.getExp().accept(this);
        s.append(";\n");
        return null;
    }

    public Object visit(MJJAnd mjjAnd) {
        mjjAnd.getLeftExp().accept(this);
        s.append(" && ");
        mjjAnd.getRightExp().accept(this);
        return null;
    }

    public Object visit(MJJBool mjjBool) {
        s.append(mjjBool.getValue());
        return null;
    }

    public Object visit(MJJCallE mjjCallE) {
        mjjCallE.getId().accept(this);
        s.append("(");
        for (MJJExp e : mjjCallE.getExps()){
            e.accept(this);
            s.append(",");
        }
        return null;
    }

    public Object visit(MJJCallI mjjCallI) {
        mjjCallI.getId().accept(this);
        s.append("(");
        for (MJJExp e : mjjCallI.getExps()){
            e.accept(this);
            s.append(",");
        }
        s.append(";\n");
        return null;
    }

    public Object visit(MJJClass mjjClass) {
        s.append("class ");
        mjjClass.getId().accept(this);
        s.append(" {\n");
        for (MJJDecl decl : mjjClass.getDecls()){
            decl.accept(this);
        }
        mjjClass.getMain().accept(this);
        s.append("}");
        return null;
    }

    public Object visit(MJJConst mjjConst) {
        s.append("final ").append(mjjConst.getType().toString()).append(" ");
        mjjConst.getId().accept(this);
        s.append(" = ");
        mjjConst.getExp().accept(this);
        s.append(";");

        return null;
    }

    public Object visit(MJJDiv mjjDiv) {
        mjjDiv.getLeftExp().accept(this);
        s.append(" / ");
        mjjDiv.getRightExp().accept(this);
        return null;
    }

    public Object visit(MJJEqual mjjEqual) {
        mjjEqual.getLeftExp().accept(this);
        s.append(" == ");
        mjjEqual.getRightExp().accept(this);
        return null;
    }

    public Object visit(MJJGreaterThan mjjGreaterThan) {
        mjjGreaterThan.getLeftExp().accept(this);
        s.append(" > ");
        mjjGreaterThan.getRightExp().accept(this);
        return null;
    }

    public Object visit(MJJHeader mjjHeader) {
        s.append(mjjHeader.getType()).append(" ");
        mjjHeader.getId().accept(this);
        return null;
    }

    public Object visit(MJJIf mjjIf) {
        s.append("if (");
        mjjIf.getCondition().accept(this);
        s.append(") {\n");
        for (MJJInstr i : mjjIf.getThenInstrs()){
            i.accept(this);
        }
        if(mjjIf.getElseInstrs().size()>0) {
            s.append("} else {\n");
            for (MJJInstr i : mjjIf.getElseInstrs()) {
                i.accept(this);
            }
        }
        s.append("};\n");
        return null;
    }

    public Object visit(MJJInc mjjInc) {
        mjjInc.getId().accept(this);
        s.append("++;\n");
        return null;
    }

    public Object visit(MJJIdent mjjIdent) {
        s.append(mjjIdent.getLabel());
        return null;
    }

    public Object visit(MJJIdenTab mjjIdenTab) {
        mjjIdenTab.getId().accept(this);
        s.append("[");
        mjjIdenTab.getExp().accept(this);
        s.append("]");
        return null;
    }

    public Object visit(MJJMain mjjMain) {
        s.append("main { \n");
        for (MJJNotMethDecl var : mjjMain.getVars()){
            var.accept(this);
        }
        for (MJJInstr ins : mjjMain.getInstrs()){
            ins.accept(this);
        }
        s.append("}\n");
        return null;
    }

    public Object visit(MJJMeth mjjMeth) {
        return null;
    }

    public Object visit(MJJMult mjjMult) {
        return null;
    }

    public Object visit(MJJNum mjjNum) {
        return null;
    }

    public Object visit(MJJNeg mjjNeg) {
        return null;
    }

    public Object visit(MJJNot mjjNot) {
        return null;
    }

    public Object visit(MJJOr mjjOr) {
        return null;
    }

    public Object visit(MJJReturn mjjReturn) {
        return null;
    }

    public Object visit(MJJSub mjjSub) {
        return null;
    }

    public Object visit(MJJSum mjjSum) {
        return null;
    }

    public Object visit(MJJTab mjjTab) {
        return null;
    }

    public Object visit(MJJVar mjjVar) {
        return null;
    }

    public Object visit(MJJWhile mjjWhile) {
        return null;
    }

    public Object visit(MJJOmega mjjOmega) {
        return null;
    }

    public Object visit(MJJPrint mjjPrint) {
        return null;
    }

    @Override
    public Object visit(MJJPrintS mjjPrintS) {
        return null;
    }
}
