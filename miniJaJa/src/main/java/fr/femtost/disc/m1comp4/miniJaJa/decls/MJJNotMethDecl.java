package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;

public abstract class MJJNotMethDecl extends MJJDecl{

    public MJJNotMethDecl(EType type, MJJIdent id, int line, int column) {
        super(type, id, line, column);
    }
}
