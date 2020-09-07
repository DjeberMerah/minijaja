package fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns;

import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJId;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJInc extends MJJAssign {

    public MJJInc(MJJId id, int line, int column) {
        super(id,line,column);
    }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }
}
