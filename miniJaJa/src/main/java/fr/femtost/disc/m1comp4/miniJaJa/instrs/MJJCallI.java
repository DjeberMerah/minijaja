package fr.femtost.disc.m1comp4.miniJaJa.instrs;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJCallI extends MJJInstr {

    private MJJIdent id;
    private ArrayList<MJJExp> exps;

    public MJJCallI(int line, int column, MJJIdent id, ArrayList<MJJExp> exps) {
        super(line, column);

        this.id = id;
        this.exps = exps;

    }

    public MJJIdent getId() { return id; }
    public ArrayList<MJJExp> getExps() { return exps; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
