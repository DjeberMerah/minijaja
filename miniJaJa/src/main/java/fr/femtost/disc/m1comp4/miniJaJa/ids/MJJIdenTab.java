package fr.femtost.disc.m1comp4.miniJaJa.ids;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJIdenTab extends MJJId {

    private MJJIdent id;
    private MJJExPrime exp;

    public MJJIdenTab(MJJIdent id, MJJExPrime exp, int line, int column) {
        super(line, column);
        this.id = id;
        this.exp = exp;

    }

    public MJJIdent getId() { return id; }
    public MJJExPrime getExp() { return exp; }

    public String getLabel() { return id.getLabel(); }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
