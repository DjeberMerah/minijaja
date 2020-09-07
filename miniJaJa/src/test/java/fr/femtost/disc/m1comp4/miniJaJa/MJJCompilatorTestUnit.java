package fr.femtost.disc.m1comp4.miniJaJa;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.JJCPrinter;
import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJDecl;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJMeth;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJNotMethDecl;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJVar;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.MJJAdd;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.MJJInstr;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.MJJReturn;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.MJJCompilator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MJJCompilatorTestUnit {

    @Test
    public void test() {

        /*ArrayList<JJCInstr> result;

        ArrayList<MJJDecl> mjjClassDecls = new ArrayList<MJJDecl>();

        ArrayList<MJJNotMethDecl> mjjMainDecls = new ArrayList<>();
        mjjMainDecls.add(new MJJVar(EType.INTEGER, new MJJIdent("y"), new MJJNum(2))); // int y = 2

        ArrayList<MJJInstr> mjjMainInstrs = new ArrayList<MJJInstr>();
        mjjMainInstrs.add(new MJJAffect(new MJJIdent("x"), new MJJNum(3))); // x = 3
        mjjMainInstrs.add(new MJJSum(new MJJIdent("y"), new MJJCallE(new MJJIdent("f"), new MJJIdent("x")))); // y += f(x)

        ArrayList<MJJHeader> mjjMethHeaders = new ArrayList<MJJHeader>();
        mjjMethHeaders.add(new MJJHeader(EType.INTEGER, new MJJIdent("p"))); // int p

        ArrayList<MJJNotMethDecl> mjjMethDecls = new ArrayList<>();
        mjjMethDecls.add(new MJJVar(EType.INTEGER, new MJJIdent("c"), new MJJNum(6))); // int c = 6

        ArrayList<MJJInstr> mjjMethInstrs = new ArrayList<MJJInstr>();
        mjjMethInstrs.add(new MJJReturn(new MJJAdd(new MJJIdent("p"), new MJJIdent("c")))); // return p + c

        MJJMeth mjjMeth = new MJJMeth(EType.INTEGER, new MJJIdent("f"), mjjMethHeaders, mjjMethDecls, mjjMethInstrs); // int f(int p)

        mjjClassDecls.add(new MJJVar(EType.INTEGER, new MJJIdent("x"), new MJJNum(0))); // int x = 0
        mjjClassDecls.add(mjjMeth);

        MJJClass mjjClass = new MJJClass(new MJJIdent("C"), mjjClassDecls, new MJJMain(mjjMainDecls, mjjMainInstrs)); // Class c
        result = MJJCompilator.compile(mjjClass);

        System.out.println(JJCPrinter.toString(result));

        Assert.assertTrue(true);*/

    }
}
