package fr.femtost.disc.m1comp4.miniJaJa.visitor;

import fr.femtost.disc.m1comp4.miniJaJa.*;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJConst;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJMeth;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJTab;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJVar;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJCallE;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJOmega;
import fr.femtost.disc.m1comp4.miniJaJa.exps.binary.*;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNeg;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdenTab;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.*;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJAffect;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJInc;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns.MJJSum;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJBool;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.exps.terms.MJJNum;

public interface IMJJVisitor {

    Object visit(MJJAdd mjjAdd);

    Object visit(MJJAffect mjjAffect);

    Object visit(MJJAnd mjjAnd);

    Object visit(MJJBool mjjBool);

    Object visit(MJJCallE mjjCallE);

    Object visit(MJJCallI mjjCallI);

    Object visit(MJJClass mjjClass);

    Object visit(MJJConst mjjConst);

    Object visit(MJJDiv mjjDiv);

    Object visit(MJJEqual mjjEqual);

    Object visit(MJJGreaterThan mjjGreaterThan);

    Object visit(MJJHeader mjjHeader);

    Object visit(MJJIf mjjIf);

    Object visit(MJJInc mjjInc);

    Object visit(MJJIdent mjjIdent);

    Object visit(MJJIdenTab mjjIdenTab);

    Object visit(MJJMain mjjMain);

    Object visit(MJJMeth mjjMeth);

    Object visit(MJJMult mjjMult);

    Object visit(MJJNum mjjNum);

    Object visit(MJJNeg mjjNeg);

    Object visit(MJJNot mjjNot);

    Object visit(MJJOr mjjOr);

    Object visit(MJJReturn mjjReturn);

    Object visit(MJJSub mjjSub);

    Object visit(MJJSum mjjSum);

    Object visit(MJJTab mjjTab);

    Object visit(MJJVar mjjVar);

    Object visit(MJJWhile mjjWhile);

    Object visit(MJJOmega mjjOmega);

    Object visit(MJJPrint mjjPrint);

    Object visit(MJJPrintS mjjPrintS);
}
