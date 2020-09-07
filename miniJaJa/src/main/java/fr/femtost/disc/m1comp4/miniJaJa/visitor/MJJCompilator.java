package fr.femtost.disc.m1comp4.miniJaJa.visitor;

import fr.femtost.disc.m1comp4.jajaCode.instrs.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCInit;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCStop;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCLoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCNew;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.binary.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.unary.JJCNeg;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.unary.JJCNot;
import fr.femtost.disc.m1comp4.jajaCode.instrs.redirections.JJCGoto;
import fr.femtost.disc.m1comp4.jajaCode.instrs.redirections.JJCIf;
import fr.femtost.disc.m1comp4.jajaCode.instrs.stores.JJCStore;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCBool;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCNum;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCOmega;
import fr.femtost.disc.m1comp4.memory.EObjectNature;
import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.*;
import fr.femtost.disc.m1comp4.miniJaJa.decls.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
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

import java.util.ArrayList;

public class MJJCompilator implements IMJJVisitor {

    //TODO Gérer tous les noeuds

    private static ArrayList<JJCInstr> instrs;

    private MJJCompilator() {}

    private static MJJCompilator INSTANCE = new MJJCompilator();

    private static int line;

    public static ArrayList<JJCInstr> compile(MJJNode mjjNode) {

        line = 0;
        instrs = new ArrayList<>();
        instrs.add(new JJCInit());
        mjjNode.accept(INSTANCE);
        instrs.add(new JJCStop());

        return instrs;
    }

    public Object visit(MJJAdd mjjAdd) {

        mjjAdd.getLeftExp().accept(this);
        mjjAdd.getRightExp().accept(this);
        instrs.add(new JJCAdd());

        return null;
    }

    public Object visit(MJJAffect mjjAffect) {

        mjjAffect.getExp().accept(this);
        instrs.add(new JJCStore(mjjAffect.getId().getLabel()));

        return null;
    }

    public Object visit(MJJAnd mjjAnd) {

        mjjAnd.getLeftExp().accept(this);
        mjjAnd.getRightExp().accept(this);
        instrs.add(new JJCAnd());

        return null;
    }

    public Object visit(MJJBool mjjBool) {

        instrs.add(new JJCPush(new JJCBool(mjjBool.getValue())));

        return null;
    }
//TODO Refactor calls
    public Object visit(MJJCallE mjjCallE) {

        for (MJJExp exp : mjjCallE.getExps())
            exp.accept(this);

        instrs.add(new JJCInvoke(mjjCallE.getId().getLabel()));

        for (MJJExp exp : mjjCallE.getExps()) {

            instrs.add(new JJCSwap());
            instrs.add(new JJCPop());

        }

        return null;
    }

    public Object visit(MJJCallI mjjCallI) {

        for (MJJExp exp : mjjCallI.getExps())
            exp.accept(this);

        instrs.add(new JJCInvoke(mjjCallI.getId().getLabel()));

        for (MJJExp exp : mjjCallI.getExps()) {

            instrs.add(new JJCSwap());
            instrs.add(new JJCPop());

        }

        return null;
    }

    public Object visit(MJJClass mjjClass) {

        //Declarations compilation
        for (MJJDecl d : mjjClass.getDecls())
            d.accept(this);

        //Main compilation
        mjjClass.getMain().accept(this);

        //Declarations withdrawal
        for (int i = 0 ; i < mjjClass.getDecls().size() ; i++) {

            instrs.add(new JJCSwap());
            instrs.add(new JJCPop());

        }

        instrs.add(new JJCPop()); //Main withdrawal

        return null;
    }

    public Object visit(MJJConst mjjConst) {

        String id = mjjConst.getId().getLabel();

        EObjectNature obj;
        int offset;

        if (mjjConst.getExp() == null) {

            obj = EObjectNature.VCST;
            offset = -1;

        } else {

            obj = EObjectNature.CST;
            offset = 0;

        }

        instrs.add(new JJCNew(id, mjjConst.getType(), obj, offset));
        return null;
    }

    public Object visit(MJJDiv mjjDiv) {

        mjjDiv.getLeftExp().accept(this);
        mjjDiv.getRightExp().accept(this);
        instrs.add(new JJCDiv());

        return null;
    }

    public Object visit(MJJEqual mjjEqual) {

        mjjEqual.getLeftExp().accept(this);
        mjjEqual.getRightExp().accept(this);
        instrs.add(new JJCCmp());

        return null;
    }

    public Object visit(MJJGreaterThan mjjGreaterThan) {

        mjjGreaterThan.getLeftExp().accept(this);
        mjjGreaterThan.getRightExp().accept(this);
        instrs.add(new JJCSup());

        return null;
    }

    public Object visit(MJJHeader mjjHeader) {
        return null;
    }

    public Object visit(MJJIf mjjIf) {
        mjjIf.getCondition().accept(this);
        JJCIf toAdd = new JJCIf(0);
        instrs.add(toAdd);
        for (MJJInstr ins : mjjIf.getElseInstrs()){
            ins.accept(this);
        }
        toAdd.setAddress(instrs.size()+2);
        JJCGoto toAddAfter = new JJCGoto(0);
        instrs.add(toAddAfter);
        for (MJJInstr ins : mjjIf.getThenInstrs()){
            ins.accept(this);
        }
        toAddAfter.setAddress(instrs.size()+1);
        return null;
    }

    public Object visit(MJJInc mjjInc) {
        instrs.add(new JJCPush(new JJCNum(1)));
        instrs.add(new JJCInc(mjjInc.getId().getLabel()));
        return null;
    }

    public Object visit(MJJIdent mjjIdent) {

        instrs.add(new JJCLoad(mjjIdent.getLabel()));
        return null;

    }

    public Object visit(MJJIdenTab mjjIdenTab) { return null; } //TODO R2

    public Object visit(MJJMain mjjMain) {

        for (MJJNotMethDecl decl : mjjMain.getVars())
            decl.accept(this);

        for (MJJInstr instr : mjjMain.getInstrs())
            instr.accept(this);

        instrs.add(new JJCPush(new JJCNum(0))); //Useful ?

        for (int i = 0 ; i < mjjMain.getVars().size() ; i++) {

            instrs.add(new JJCSwap());
            instrs.add(new JJCPop());

        }

        return null;
    }

    public Object visit(MJJMeth mjjMeth) {

        instrs.add(new JJCPush(new JJCNum(instrs.size() + 4))); // Method address
        String id = mjjMeth.getId().getLabel();
        instrs.add(new JJCNew(id, mjjMeth.getType(), EObjectNature.METH, 0)); // Method declaration

        //Reservation of an emplacement for the goto instruction (waiting to know method end address)
        int instrGoto = instrs.size(), i;
        instrs.add(null);

        //Headers declarations
        ArrayList<MJJHeader> headers = mjjMeth.getHeaders();
        for (i = 0 ; i < headers.size() ; i++)
            instrs.add(new JJCNew(headers.get(i).getId().getLabel(), headers.get(i).getType(), EObjectNature.VAR, i + 1));

        //Local variables declarations
        for (MJJNotMethDecl decl : mjjMeth.getVars())
            decl.accept(this);

        //Instructions compilation
        for (MJJInstr instr : mjjMeth.getInstrs())
            instr.accept(this);

        //Adding a false return in case of void method
        if (mjjMeth.getType().equals(EType.VOID))
            instrs.add(new JJCPush(new JJCNum(0)));

        //Declarations withdrawal
        for (i = 0 ; i < mjjMeth.getVars().size() ; i++) {

            instrs.add(new JJCSwap());
            instrs.add(new JJCPop());

        }

        instrs.add(new JJCSwap()); //Swapping between the return value and the address of return
        instrs.add(new JJCReturn());

        instrs.set(instrGoto, new JJCGoto(instrs.size() + 1)); //Set up of the goto instruction

        return null;
    }

    public Object visit(MJJMult mjjMult) {

        mjjMult.getLeftExp().accept(this);
        mjjMult.getRightExp().accept(this);
        instrs.add(new JJCMult());

        return null;
    }

    public Object visit(MJJNum mjjNum) {

        instrs.add(new JJCPush(new JJCNum(mjjNum.getValue())));

        return null;
    }

    public Object visit(MJJNeg mjjNeg) {

        mjjNeg.getExp().accept(this);
        instrs.add(new JJCNeg());

        return null;
    }

    public Object visit(MJJNot mjjNot) {

        mjjNot.getExp().accept(this);
        instrs.add(new JJCNot());

        return null;
    }

    public Object visit(MJJOr mjjOr) {

        mjjOr.getLeftExp().accept(this);
        mjjOr.getRightExp().accept(this);
        instrs.add(new JJCOr());

        return null;
    }

    public Object visit(MJJReturn mjjReturn) {

        mjjReturn.getExp().accept(this);
        return null;
    }

    public Object visit(MJJSub mjjSub) {

        mjjSub.getLeftExp().accept(this);
        mjjSub.getRightExp().accept(this);
        instrs.add(new JJCSub());

        return null;
    }

    public Object visit(MJJSum mjjSum) {

        mjjSum.getExp().accept(this);
        instrs.add(new JJCInc(mjjSum.getId().getLabel()));
        return null;
    }

    public Object visit(MJJTab mjjTab) {

        String id = mjjTab.getId().getLabel();

        instrs.add(new JJCNew(id, mjjTab.getType(), EObjectNature.TAB, 0));

        return null;
    }

    public Object visit(MJJVar mjjVar) {

        String id = mjjVar.getId().getLabel();

        if (mjjVar.getExp() != null)
            mjjVar.getExp().accept(this);

        instrs.add(new JJCNew(id, mjjVar.getType(), EObjectNature.VAR, 0));

        return null;
    }

    public Object visit(MJJWhile mjjWhile) {
        int start = instrs.size();
        mjjWhile.getCondition().accept(this);
        instrs.add(new JJCNot());
        JJCIf toAdd = new JJCIf(0);
        instrs.add(toAdd);
        for (MJJInstr ins : mjjWhile.getInstrs()){
            ins.accept(this);
        }
        instrs.add(new JJCGoto(start));
        toAdd.setAddress(instrs.size()+1);

        return null;
    }

    public Object visit(MJJOmega mjjOmega) {
        instrs.add(new JJCPush(new JJCOmega()));
        return null;
    }

    public Object visit(MJJPrint mjjPrint) {
        mjjPrint.getExpression().accept(this);
        instrs.add(new JJCPrint());
        return null;
    }

    @Override
    public Object visit(MJJPrintS mjjPrintS) {
        instrs.add(new JJCPrintS(mjjPrintS.getString()));
        return null;
    }

}
