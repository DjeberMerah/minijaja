package fr.femtost.disc.m1comp4.miniJaJa.instrs;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJIf extends MJJInstr {

    private MJJExp exp;
    private ArrayList<MJJInstr> if_then;
    private ArrayList<MJJInstr> if_else;

    public MJJIf(int line, int column, MJJExp exp, ArrayList<MJJInstr> ifInstrs, ArrayList<MJJInstr> elseInstr) {
        super(line, column);
        this.exp = exp;
        this.if_then = ifInstrs;
        this.if_else = elseInstr;

    }

    public MJJExp getCondition() { return exp; }
    public ArrayList<MJJInstr> getThenInstrs() { return if_then; }
    public ArrayList<MJJInstr> getElseInstrs() { return if_else; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
