package fr.femtost.disc.m1comp4.miniJaJa.exps.unary;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;

public abstract class MJJUnaryExp extends MJJExPrime {

    private MJJExp exp;

    public MJJUnaryExp(MJJExp exp, int line, int column) {
        super(line, column);
        this.exp = exp; }

    public MJJExp getExp() { return exp; }

}
