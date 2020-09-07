package fr.femtost.disc.m1comp4.miniJaJa.instrs;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJReturn extends MJJInstr {

    private MJJExp exp;

    public MJJReturn(int line, int column, MJJExp exp) {
        super(line, column);
        this.exp = exp;
    }

    public MJJExp getExp() { return exp; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
