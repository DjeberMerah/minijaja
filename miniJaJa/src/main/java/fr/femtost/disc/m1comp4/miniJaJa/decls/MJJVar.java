package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJVar extends  MJJVarDecl {

    public MJJVar(EType type, MJJIdent id, MJJExp exp, int line, int column) { super(type, id, exp, line, column); }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
