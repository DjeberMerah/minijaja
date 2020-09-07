package fr.femtost.disc.m1comp4.miniJaJa.ids;

import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJIdent extends MJJId {

    private String label;

    public MJJIdent(String label, int line, int column) {
        super(line, column);
        this.label = label;
    }

    public String getLabel() { return label; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
