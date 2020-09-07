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

public interface IJJCVisitor {

    Object visit(JJCAdd jjcAdd);

    Object visit(JJCAnd jjcAnd);

    Object visit(JJCANew jjcaNew);

    Object visit(JJCAInc jjcaInc);

    Object visit(JJCALoad jjcaLoad);

    Object visit(JJCAStore jjcaStore);

    Object visit(JJCBool jjcBool);

    Object visit(JJCCmp jjcCmp);

    Object visit(JJCDiv jjcDiv);

    Object visit(JJCGoto jjcGoto);

    Object visit(JJCIf jjcIf);

    Object visit(JJCInc jjcInc);

    Object visit(JJCInit jccInit);

    Object visit(JJCInvoke jjcInvoke);

    Object visit(JJCLoad jjcLoad);

    Object visit(JJCMult jjcMult);

    Object visit(JJCNeg jjcNeg);

    Object visit(JJCNew jjcNew);

    Object visit(JJCNop jjcNop);

    Object visit(JJCNot jjcNot);

    Object visit(JJCNum jjcNum);

    Object visit(JJCOr jjcOr);

    Object visit(JJCPop jccPop);

    Object visit(JJCPush jjcPush);

    Object visit(JJCReturn jjcReturn);

    Object visit(JJCStop jjcStop);

    Object visit(JJCStore jjcStore);

    Object visit(JJCSub jjcSub);

    Object visit(JJCSup jjcSup);

    Object visit(JJCSwap jjcSwap);

    Object visit(JJCPrint jjcPrint);

    Object visit(JJCOmega jjcOmega);

    Object visit(JJCPrintS jjcPrintS);
}
