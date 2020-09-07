package fr.femtost.disc.m1comp4.jajaCode.visitor;

import fr.femtost.disc.m1comp4.jajaCode.instrs.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCInit;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCStop;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCAInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCALoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCLoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCANew;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCNew;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.binary.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.unary.JJCNeg;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.unary.JJCNot;
import fr.femtost.disc.m1comp4.jajaCode.instrs.redirections.JJCGoto;
import fr.femtost.disc.m1comp4.jajaCode.instrs.redirections.JJCIf;
import fr.femtost.disc.m1comp4.jajaCode.instrs.stores.JJCAStore;
import fr.femtost.disc.m1comp4.jajaCode.instrs.stores.JJCStore;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCBool;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCNum;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCOmega;

import java.util.ArrayList;

public class JJCPrinter implements IJJCVisitor {

    private JJCPrinter() {}

    private static JJCPrinter INSTANCE = new JJCPrinter();

    private static StringBuffer stringBuffer;

    public static String toString(ArrayList<JJCInstr> instrs) {
        int line = 1;
        stringBuffer = new StringBuffer("");
        for (JJCInstr instr : instrs) {
            stringBuffer.append(line+" ");
            instr.accept(INSTANCE);
            stringBuffer.append("\n");
            line++;

        }

        return stringBuffer.toString();
    }

    public Object visit(JJCAdd jjcAdd) {

        stringBuffer.append("add");
        return null;
    }

    public Object visit(JJCAnd jjcAnd) {

        stringBuffer.append("and");
        return null;
    }

    public Object visit(JJCANew jjcaNew) {

        stringBuffer.append("newarray(");
        stringBuffer.append(jjcaNew.getId());
        stringBuffer.append(", ");
        stringBuffer.append(jjcaNew.getType());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCAInc jjcaInc) {

        stringBuffer.append("ainc(");
        stringBuffer.append(jjcaInc.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCALoad jjcaLoad) {

        stringBuffer.append("aload(");
        stringBuffer.append(jjcaLoad.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCAStore jjcaStore) {

        stringBuffer.append("astore(");
        stringBuffer.append(jjcaStore.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCBool jjcBool) {
        return jjcBool.getValue();
    }

    public Object visit(JJCCmp jjcCmp) {

        stringBuffer.append("cmp");
        return null;
    }

    public Object visit(JJCDiv jjcDiv) {

        stringBuffer.append("div");
        return null;
    }

    public Object visit(JJCGoto jjcGoto) {

        stringBuffer.append("goto(");
        stringBuffer.append(jjcGoto.getAddress());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCIf jjcIf) {

        stringBuffer.append("if(");
        stringBuffer.append(jjcIf.getAddress());
        stringBuffer.append(")");
        return null;
    }
    public Object visit(JJCInc jjcInc) {

        stringBuffer.append("inc(");
        stringBuffer.append(jjcInc.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCInit jccInit) {

        stringBuffer.append("init");
        return null;
    }

    public Object visit(JJCInvoke jjcInvoke) {

        stringBuffer.append("invoke(");
        stringBuffer.append(jjcInvoke.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCLoad jjcLoad) {

        stringBuffer.append("load(");
        stringBuffer.append(jjcLoad.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCMult jjcMult) {

        stringBuffer.append("mul");
        return null;
    }

    public Object visit(JJCNeg jjcNeg) {

        stringBuffer.append("neg");
        return null;
    }

    public Object visit(JJCNew jjcNew) {

        stringBuffer.append("new(");
        stringBuffer.append(jjcNew.getId());
        stringBuffer.append(", ");
        stringBuffer.append(jjcNew.getType());
        stringBuffer.append(", ");
        stringBuffer.append(jjcNew.getSorte());
        stringBuffer.append(", ");
        stringBuffer.append(jjcNew.getOffset());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCNop jjcNop) {

        stringBuffer.append("nop");
        return null;
    }

    public Object visit(JJCNot jjcNot) {

        stringBuffer.append("not");
        return null;
    }

    public Object visit(JJCNum jjcNum) {
        return jjcNum.getValue();
    }

    public Object visit(JJCOr jjcOr) {

        stringBuffer.append("or");
        return null;
    }

    public Object visit(JJCPop jccPop) {

        stringBuffer.append("pop");
        return null;
    }

    public Object visit(JJCPush jjcPush) {

        stringBuffer.append("push(");
        stringBuffer.append(jjcPush.getValue());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCReturn jjcReturn) {

        stringBuffer.append("return");
        return null;
    }

    public Object visit(JJCStop jjcStop) {

        stringBuffer.append("stop");
        return null;
    }

    public Object visit(JJCStore jjcStore) {

        stringBuffer.append("store(");
        stringBuffer.append(jjcStore.getId());
        stringBuffer.append(")");
        return null;
    }

    public Object visit(JJCSub jjcSub) {

        stringBuffer.append("sub");
        return null;
    }

    public Object visit(JJCSup jjcSup) {

        stringBuffer.append("sup");
        return null;
    }

    public Object visit(JJCSwap jjcSwap) {

        stringBuffer.append("swap");
        return null;
    }

    public Object visit(JJCPrint jjcPrint) {
        stringBuffer.append("print");
        return null;
    }

    public Object visit(JJCOmega jjcOmega) {
        stringBuffer.append("w");
        return null;
    }

    public Object visit(JJCPrintS jjcPrintS) {
        stringBuffer.append("prints(\"").append(jjcPrintS.getStr()).append("\")");
        return null;
    }
}
