package fr.femtost.disc.m1comp4.miniJaJa.exps;

import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJOmega extends MJJExPrime {

    public MJJOmega(int line, int column){
        super(line, column);
    }

    public Object accept(IMJJVisitor visitor) {
        return visitor.visit(this);
    }
}
