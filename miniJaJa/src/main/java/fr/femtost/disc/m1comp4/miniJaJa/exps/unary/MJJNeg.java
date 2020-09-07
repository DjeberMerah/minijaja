package fr.femtost.disc.m1comp4.miniJaJa.exps.unary;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJNeg extends MJJUnaryExp {

    public MJJNeg(MJJExp exp, int line, int column) { super(exp, line, column); }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
