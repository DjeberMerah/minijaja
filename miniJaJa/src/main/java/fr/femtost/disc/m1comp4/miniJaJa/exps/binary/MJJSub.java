package fr.femtost.disc.m1comp4.miniJaJa.exps.binary;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJSub extends MJJBinaryExp {

    public MJJSub(MJJExp left_exp, MJJExp right_exp, int line, int column) { super(left_exp, right_exp, line, column); }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
