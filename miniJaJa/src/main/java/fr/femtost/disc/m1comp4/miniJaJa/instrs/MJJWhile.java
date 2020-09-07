package fr.femtost.disc.m1comp4.miniJaJa.instrs;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJWhile extends MJJInstr {

    private MJJExp exp;
    private ArrayList<MJJInstr> instructions;

    public MJJWhile(int line, int column,MJJExp exp, ArrayList<MJJInstr> instrs) {
        super(line, column);
        this.exp = exp;
        this.instructions = instrs;

    }

    public MJJExp getCondition() { return exp; }
    public ArrayList<MJJInstr> getInstrs() { return instructions; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
