package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExPrime;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJTab extends MJJNotMethDecl {

    private MJJExPrime exp;

    public MJJTab(EType type, MJJIdent id, MJJExPrime exp, int line, int column) {

        super(type, id, line, column);
        this.exp = exp;

    }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

    public MJJExPrime getExp() { return exp; }

}
