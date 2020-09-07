package fr.femtost.disc.m1comp4.miniJaJa.exps;

import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJCallE extends MJJExPrime {

    private MJJIdent id;
    private MJJExp[] exps;

    public MJJCallE(MJJIdent id, int line, int column, MJJExp ... exps) {
        super(line, column);

        this.id = id;
        this.exps = exps;

    }

    public MJJIdent getId() { return id; }

    public MJJExp[] getExps() { return exps; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
