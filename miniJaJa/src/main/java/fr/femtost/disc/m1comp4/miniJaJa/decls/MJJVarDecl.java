package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;

public abstract class MJJVarDecl extends MJJNotMethDecl {

    private MJJExp exp;

    public MJJVarDecl(EType type, MJJIdent id, MJJExp exp, int line, int column) {

        super(type, id, line, column);
        this.exp = exp;

    }

    public MJJExp getExp() { return exp; }

}
