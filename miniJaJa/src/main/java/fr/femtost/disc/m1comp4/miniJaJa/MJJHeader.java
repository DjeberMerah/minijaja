package fr.femtost.disc.m1comp4.miniJaJa;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJHeader extends MJJNode {

    private EType type;
    private MJJIdent id;

    public MJJHeader(int line, int column, EType type, MJJIdent id) {
        super(line, column);
        this.type = type;
        this.id = id;

    }

    public EType getType() { return type; }
    public MJJIdent getId() { return id; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
