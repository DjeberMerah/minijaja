package fr.femtost.disc.m1comp4.jajaCode;

import fr.femtost.disc.m1comp4.jajaCode.instrs.*;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCInit;
import fr.femtost.disc.m1comp4.jajaCode.instrs.bounds.JJCStop;
import fr.femtost.disc.m1comp4.jajaCode.instrs.incs.JJCInc;
import fr.femtost.disc.m1comp4.jajaCode.instrs.loads.JJCLoad;
import fr.femtost.disc.m1comp4.jajaCode.instrs.news.JJCNew;
import fr.femtost.disc.m1comp4.jajaCode.instrs.operators.binary.JJCAdd;
import fr.femtost.disc.m1comp4.jajaCode.instrs.redirections.JJCGoto;
import fr.femtost.disc.m1comp4.jajaCode.instrs.stores.JJCStore;
import fr.femtost.disc.m1comp4.jajaCode.terms.JJCNum;
import fr.femtost.disc.m1comp4.jajaCode.visitor.JJCInterpetor;

import fr.femtost.disc.m1comp4.memory.EObjectNature;
import fr.femtost.disc.m1comp4.memory.EType;
import org.junit.Test;

import java.util.ArrayList;

public class JJCInterpretorTestUnit {

    @Test
    public void test() {

        ArrayList<JJCInstr> instrs = new ArrayList<JJCInstr>();

        instrs.add(new JJCInit());
        instrs.add(new JJCPush(new JJCNum(0)));
        instrs.add(new JJCNew("x", EType.INTEGER, EObjectNature.VAR, 0));
        instrs.add(new JJCPush(new JJCNum(7)));
        instrs.add(new JJCNew("f", EType.INTEGER, EObjectNature.METH, 0));
        instrs.add(new JJCGoto(17));
        instrs.add(new JJCNew("p", EType.INTEGER, EObjectNature.VAR, 1));
        instrs.add(new JJCPush(new JJCNum(6)));
        instrs.add(new JJCNew("c", EType.INTEGER, EObjectNature.VAR, 0));
        instrs.add(new JJCLoad("p"));
        instrs.add(new JJCLoad("c"));
        instrs.add(new JJCAdd());
        instrs.add(new JJCSwap());
        instrs.add(new JJCPop());
        instrs.add(new JJCSwap());
        instrs.add(new JJCReturn());
        instrs.add(new JJCPush(new JJCNum(2)));
        instrs.add(new JJCNew("y", EType.INTEGER, EObjectNature.VAR, 0));
        instrs.add(new JJCPush(new JJCNum(3)));
        instrs.add(new JJCStore("x"));
        instrs.add(new JJCLoad("x"));
        instrs.add(new JJCInvoke("f"));
        instrs.add(new JJCSwap());
        instrs.add(new JJCPop());
        instrs.add(new JJCInc("y"));
        instrs.add(new JJCPush(new JJCNum(0)));
        instrs.add(new JJCSwap());
        instrs.add(new JJCPop());
        instrs.add(new JJCSwap());
        instrs.add(new JJCPop());
        instrs.add(new JJCSwap());
        instrs.add(new JJCPop());
        instrs.add(new JJCPop());
        instrs.add(new JJCStop());

        JJCInterpetor.interpret(instrs, true);

    }

}
