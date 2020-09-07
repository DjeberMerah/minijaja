package fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns;

import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJId;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJSum extends MJJAssign {

    private MJJExp exp;

    public MJJSum(int line, int column, MJJId id, MJJExp exp) {
        super(id, line, column);
        this.exp = exp;

    }

    public MJJExp getExp() { return exp; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
