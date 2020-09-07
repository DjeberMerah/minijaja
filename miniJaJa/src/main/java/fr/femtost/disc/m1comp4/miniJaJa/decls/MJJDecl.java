package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.MJJNode;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;

public abstract class MJJDecl extends MJJNode {

    private EType type;
    private MJJIdent id;

    public MJJDecl(EType type, MJJIdent id, int line, int column) {
        super(line, column);
        this.id = id;
        this.type = type;

    }

    public MJJIdent getId() { return id; }

    public EType getType() { return type; }

}
