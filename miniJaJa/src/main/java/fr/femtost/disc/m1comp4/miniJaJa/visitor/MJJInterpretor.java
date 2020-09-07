package fr.femtost.disc.m1comp4.miniJaJa.visitor;

import fr.femtost.disc.m1comp4.memory.EObjectNature;
import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.memory.Pile;
import fr.femtost.disc.m1comp4.memory.Quadruple;
import fr.femtost.disc.m1comp4.miniJaJa.*;
import fr.femtost.disc.m1comp4.miniJaJa.decls.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJOmega;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJBool;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJId;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNeg;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdenTab;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.*;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAssign;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJInc;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;
import fr.femtost.disc.m1comp4.memory.symbolTable.ScopeSymbolTable;

public class MJJInterpretor implements IMJJVisitor {

    /*TODO Arrêter d'utiliser la TDS de manière statique et passer à la pile, comme on peut le voir en cours.
      TODO Mettre en place également un mode step-by-step.
     */


    private MJJInterpretor() {}

    private static MJJInterpretor INSTANCE = new MJJInterpretor();

    private static ScopeSymbolTable<Quadruple> ssTable;

    private static Pile stackMJJ;



    public static void interpret(MJJClass mjjClass) {

        ssTable = new ScopeSymbolTable();
        stackMJJ = new Pile();


        mjjClass.accept(INSTANCE);


    }

    public Object visit(MJJAdd mjjAdd) {

        int leftExpValue = (Integer)mjjAdd.getLeftExp().accept(this);
        int rightExpValue = (Integer)mjjAdd.getRightExp().accept(this);

        return leftExpValue + rightExpValue;
    }

    public Object visit(MJJAffect mjjAffect) {

        String id = mjjAffect.getId().getLabel();
        Object val = mjjAffect.getExp().accept(this);
        ssTable.getSymbol(id, false).val=val;
        stackMJJ.affectVal(id, val);

        return null;
    }

    public Object visit(MJJAnd mjjAnd) {

        boolean leftExpValue = (Boolean)mjjAnd.getLeftExp().accept(this);
        boolean rightExpValue = (Boolean)mjjAnd.getRightExp().accept(this);

        return leftExpValue && rightExpValue;

    }

    public Object visit(MJJBool mjjBool) { return mjjBool.getValue(); }

    public Object visit(MJJCallE mjjCallE) {
        return null;
    } //TODO R2

    public Object visit(MJJCallI mjjCallI) {
        return null;
    } //TODO R2

    public Object visit(MJJClass mjjClass) {

        String id = mjjClass.getId().getLabel();
        Object omega = new MJJOmega(mjjClass.getLineNumber(),mjjClass.getColumnNumber());

        ssTable.beginScope();

        stackMJJ.declMeth(id, omega,EType.VOID);

        for (MJJDecl d : mjjClass.getDecls()) d.accept(this);

        mjjClass.getMain().accept(this);

        return null;
    }

    public Object visit(MJJConst mjjConst) {

        String id = mjjConst.getId().getLabel();
        Object val = mjjConst.getExp().accept(this);
        EType type = mjjConst.getType();
        stackMJJ.declCst(id, val, type);

        return null;
    }

    public Object visit(MJJDiv mjjDiv) {
        int leftExpValue = (Integer) mjjDiv.getLeftExp().accept(this);
        int rightExpValue = (Integer) mjjDiv.getRightExp().accept(this);

        if(rightExpValue == 0){

            return null;
        }

        return leftExpValue / rightExpValue;

    }

    public Object visit(MJJEqual mjjEqual) {

        Object leftExpValue = mjjEqual.getLeftExp().accept(this);
        Object rightExpValue = mjjEqual.getRightExp().accept(this);

        return leftExpValue == rightExpValue;
    }

    public Object visit(MJJGreaterThan mjjGreaterThan) {

        int leftExpValue = (Integer) mjjGreaterThan.getLeftExp().accept(this);
        int rightExpValue = (Integer) mjjGreaterThan.getRightExp().accept(this);

        return leftExpValue > rightExpValue;
    }

    public Object visit(MJJHeader mjjHeader) {
        return null;
    }

    public Object visit(MJJIf mjjIf) {

        boolean cond = (Boolean) mjjIf.getCondition().accept(this);

        if (cond) {

            for (MJJInstr instr : mjjIf.getThenInstrs()) instr.accept(this);

        }else{

            for (MJJInstr instrElse : mjjIf.getElseInstrs()) instrElse.accept(this);

        }
        return null;
    }

    public Object visit(MJJInc mjjInc) {


        String id = mjjInc.getId().getLabel();
        Object val = (Integer) ssTable.getSymbol(id , false).val + 1;
        stackMJJ.affectVal(id, val);
        ssTable.getSymbol(id, false).val=val;
        return null;

    }

    public Object visit(MJJIdent mjjIdent) {
        return ssTable.getSymbol(mjjIdent.getLabel(), false).val;

    }

    public Object visit(MJJIdenTab mjjIdenTab) {
        return null;
    } //TODO R2

    public Object visit(MJJMain mjjMain) {

        for (MJJNotMethDecl d : mjjMain.getVars()) d.accept(this);

        for (MJJInstr i : mjjMain.getInstrs()) i.accept(this);

        return null;
    }

    public Object visit(MJJMeth mjjMeth) {

        for (MJJNotMethDecl d : mjjMeth.getVars()) d.accept(this);

        for (MJJInstr i : mjjMeth.getInstrs()) i.accept(this);

        return null;
    }

    public Object visit(MJJMult mjjMult) {

        int leftExpValue = (Integer) mjjMult.getLeftExp().accept(this);
        int rightExpValue = (Integer) mjjMult.getRightExp().accept(this);

        return leftExpValue * rightExpValue;
    }

    public Object visit(MJJNum mjjNum) { return mjjNum.getValue(); }

    public Object visit(MJJNeg mjjNeg) {
        return null;
    }

    public Object visit(MJJNot mjjNot) {
        boolean expValue= (Boolean) mjjNot.getExp().accept(this);
        return !expValue;
    }

    public Object visit(MJJOr mjjOr) {

        boolean leftExpValue = (Boolean)mjjOr.getLeftExp().accept(this);
        boolean rightExpValue = (Boolean)mjjOr.getRightExp().accept(this);

        return leftExpValue || rightExpValue;
    }

    public Object visit(MJJReturn mjjReturn) {

        Object val = mjjReturn.getExp().accept(this);
        String idClass = stackMJJ.getLast().getId();
        stackMJJ.affectVal(idClass, val);

        return null;
    }

    public Object visit(MJJSub mjjSub) {

        int leftExpValue = (Integer) mjjSub.getLeftExp().accept(this);
        int rightExpValue = (Integer) mjjSub.getRightExp().accept(this);

        return leftExpValue - rightExpValue;

    }

    public Object visit(MJJSum mjjSum) {

        String id = mjjSum.getId().getLabel();
        int expValue = (Integer) mjjSum.getExp().accept(this);
        Object val = (Integer) ssTable.getSymbol(id , false).val + expValue;
        stackMJJ.affectVal(id, val);
        ssTable.getSymbol(id, false).val= val;
        return null;
    }

    public Object visit(MJJTab mjjTab) {
        return null;
    } //TODO R2

    public Object visit(MJJVar mjjVar) {

        String id = mjjVar.getId().getLabel();
        Object val = mjjVar.getExp().accept(this);
        EType type = mjjVar.getType();
        stackMJJ.declVar(id, val, type);
        ssTable.putSymbol(id , new Quadruple(id, val, EObjectNature.VAR, type));

        return null;
    }

    public Object visit(MJJWhile mjjWhile) {

        Boolean cond = (Boolean) mjjWhile.getCondition().accept(this);
        if (cond){
            for(MJJInstr i : mjjWhile.getInstrs()){i.accept(this);}
            mjjWhile.accept(this);
        }

        return null;
    }

    public Object visit(MJJOmega mjjOmega) {
        return null;
    }

    public Object visit(MJJPrint mjjPrint) {
        //TODO Réflechir à comment créer un print de débug;
        Object value = mjjPrint.getExpression().accept(this);
        System.out.println(value);
        return null;
    }

    @Override
    public Object visit(MJJPrintS mjjPrintS) {
        System.out.print(mjjPrintS.getString());
        return null;
    }

}
