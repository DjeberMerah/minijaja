package fr.femtost.disc.m1comp4.jajaCode.visitor;

import fr.femtost.disc.m1comp4.jajaCode.instrs.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCInit;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCStop;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCAInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCALoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCLoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCNew;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCANew;
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
import fr.femtost.disc.m1comp4.memory.EObjectNature;
import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.memory.Pile;
import fr.femtost.disc.m1comp4.memory.Quadruple;
import fr.femtost.disc.m1comp4.memory.symbolTable.ScopeSymbolTable;

import java.util.ArrayList;

public class JJCInterpetor implements IJJCVisitor {

    //TODO Implémenter un step by step, pour permettre de voir la ile à tout moment, plus gérer tous les noeuds

    private JJCInterpetor() {}

    private static JJCInterpetor INSTANCE = new JJCInterpetor();

    private static int currentInstr;
    private static boolean stop;
    private static Pile stack;
    private static ScopeSymbolTable<Quadruple> ssTable;
    private static ArrayList<JJCInstr> list;

    public static void interpret(ArrayList<JJCInstr> instrs, boolean debug) {

        JJCInterpetor.currentInstr = 0;
        ssTable = new ScopeSymbolTable();
        stop = false;

        while (!stop) {

            if (debug) {

                System.out.print("Instruction ");
                System.out.println(JJCInterpetor.currentInstr + 1);
            }

            instrs.get(JJCInterpetor.currentInstr).accept(INSTANCE);
            if (debug) System.out.println(stack.toString());

        }
    }

    public static String currentMem(){
        return stack.toString();
    }

    public static void initInter(ArrayList<JJCInstr> instrs){
        JJCInterpetor.currentInstr = 0;
        ssTable = new ScopeSymbolTable();
        list = instrs;
    }

    public static boolean interpretStepByStep(){
        System.out.println("JJCInterpetor.currentInstr : "+(JJCInterpetor.currentInstr+1));
        list.get(JJCInterpetor.currentInstr).accept(INSTANCE);
        return stop;

    }

    public Object visit(JJCAdd jjcAdd) {

        int v2 = (Integer)stack.pop().val;
        int v1 = (Integer)stack.pop().val;

        stack.declCst(null,  v1 + v2, EType.INTEGER);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCAnd jjcAnd) {

        boolean v2 = (Boolean)stack.pop().val;
        boolean v1 = (Boolean)stack.pop().val;

        stack.declCst(null, v1 && v2, EType.BOOLEAN);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCANew jjcaNew) { //TODO NewArray
        return null;
    } //TODO R2

    public Object visit(JJCAInc jjcaInc) {
        return null;
    } //TODO R2

    public Object visit(JJCALoad jjcaLoad) {
        return null;
    } //TODO R2

    public Object visit(JJCAStore jjcaStore) {
        return null;
    } //TODO R2

    public Object visit(JJCBool jjcBool) { return jjcBool.getValue(); }

    public Object visit(JJCCmp jjcCmp) {

        Object v2 = stack.pop().val;
        Object v1 = stack.pop().val;

        stack.declCst(null, v1.equals(v2), EType.BOOLEAN);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCDiv jjcDiv) {

        int v2 = (Integer)stack.pop().val;
        int v1 = (Integer)stack.pop().val;

        stack.declCst(null, v1 / v2, EType.INTEGER);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCGoto jjcGoto) {

        JJCInterpetor.currentInstr = jjcGoto.getAddress() - 1;
        return null;
    }

    public Object visit(JJCIf jjcIf) {

        if ((Boolean)stack.pop().val) JJCInterpetor.currentInstr = jjcIf.getAddress()-1;
        else JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCInc jjcInc) {

        Quadruple q = ssTable.getSymbol(jjcInc.getId(), false);
        q.val = (Integer)q.val + (Integer)stack.pop().val;

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCInit jccInit) {

        stack = new Pile();
        ssTable.beginScope();

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCInvoke jjcInvoke) {

        String id = jjcInvoke.getId();

        stack.declCst(null, JJCInterpetor.currentInstr + 1, null);
        Object val = ssTable.getSymbol(id, false).val;
        JJCInterpetor.currentInstr = (Integer)val - 1;
        ssTable.beginScope();

        return null;
    }

    public Object visit(JJCLoad jjcLoad) {

        Object val = ssTable.getSymbol(jjcLoad.getId(), false).val;
        stack.declCst(null, val, null);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCMult jjcMult) {

        int v2 = (Integer)stack.pop().val;
        int v1 = (Integer)stack.pop().val;

        stack.declCst(null, v1 * v2, EType.INTEGER);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCNeg jjcNeg) {

        int v = (Integer)stack.pop().val;
        stack.declCst(null, -v, EType.INTEGER);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCNew jjcNew) {

        String id = jjcNew.getId();
        EObjectNature obj = jjcNew.getSorte();
        EType sorte = jjcNew.getType();

        Pile tmp = new Pile();
        int i;
        for (i = 0; i < jjcNew.getOffset() ; i++)
            tmp.push(stack.pop());

        Object val = (jjcNew.getOffset() >= 0) ? stack.pop().val : null;
        stack.decl(id, val, obj, sorte);
        ssTable.putSymbol(id, stack.get(0));

        for (Quadruple q : tmp)
            stack.push(q);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCNop jjcNop) {

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCNot jjcNot) {

        boolean v = (Boolean)stack.pop().val;

        stack.declCst(null, !v, EType.BOOLEAN);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCNum jjcNum) { return jjcNum.getValue(); }

    public Object visit(JJCOr jjcOr) {

        boolean v2 = (Boolean)stack.pop().val;
        boolean v1 = (Boolean)stack.pop().val;

        stack.declCst(null, v1 || v2, EType.BOOLEAN);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCPop jccPop) {

        stack.pop();

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCPush jjcPush) {

        Object val = jjcPush.getValue();
        if (val instanceof JJCBool)
            stack.declCst(null, ((JJCBool) val).getValue(), EType.OMEGA);
        else
            if (val instanceof JJCNum)
                stack.declCst(null, ((JJCNum) val).getValue(), EType.OMEGA);
            else
                stack.declCst(null, null, EType.OMEGA);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCReturn jjcReturn) {

        ssTable.endScope();

        JJCInterpetor.currentInstr = (Integer)stack.pop().val;
        return null;
    }

    public Object visit(JJCStop jjcStop) {

        stop = true;
        ssTable.endScope();

        return null;
    }

    public Object visit(JJCStore jjcStore) {

        ssTable.getSymbol(jjcStore.getId(), false).val = stack.pop().val;

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCSub jjcSub) {

        int v2 = (Integer)stack.pop().val;
        int v1 = (Integer)stack.pop().val;

        stack.declCst(null, v1 - v2, EType.INTEGER);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCSup jjcSup) {

        int v2 = (Integer)stack.pop().val;
        int v1 = (Integer)stack.pop().val;

        stack.declCst(null, v1 > v2, EType.BOOLEAN);

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCSwap jjcSwap) {

        stack.swap();

        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCPrint jjcPrint) {
        System.out.println(stack.pop().val);
        JJCInterpetor.currentInstr++;
        return null;
    }

    public Object visit(JJCOmega jjcOmega) {
        return null;
    }

    public Object visit(JJCPrintS jjcPrintS) {
        System.out.print(jjcPrintS.getStr());
        JJCInterpetor.currentInstr++;
        return null;

    }
}
