package fr.femtost.disc.m1comp4.miniJaJa.exps.binary;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;

public abstract class MJJBinaryExp extends MJJExPrime {

    private MJJExp leftExp;
    private MJJExp rightExp;

    public MJJBinaryExp(MJJExp left_exp, MJJExp right_exp, int line, int column) {
        super(line, column);

        this.leftExp = left_exp;
        this.rightExp = right_exp;

    }

    public MJJExp getLeftExp() { return leftExp; }
    public MJJExp getRightExp() { return rightExp; }

}
