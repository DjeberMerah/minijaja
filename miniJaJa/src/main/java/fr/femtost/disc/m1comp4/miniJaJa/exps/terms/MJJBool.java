package fr.femtost.disc.m1comp4.miniJaJa.exps.terms;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJBool extends MJJExPrime {

    private boolean value;

    public MJJBool(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() { return value ; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
