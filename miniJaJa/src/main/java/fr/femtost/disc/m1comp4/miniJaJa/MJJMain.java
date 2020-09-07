package fr.femtost.disc.m1comp4.miniJaJa;

import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJDecl;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJNotMethDecl;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJVar;
import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJVarDecl;
import fr.femtost.disc.m1comp4.miniJaJa.exps.unary.MJJNot;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.MJJInstr;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJMain extends MJJNode {

    private ArrayList<MJJNotMethDecl> vars;
    private ArrayList<MJJInstr> instrs;

    public MJJMain(int line, int column, ArrayList<MJJNotMethDecl> decls, ArrayList<MJJInstr> instrs) {
        super(line, column);
        this.vars = decls;
        this.instrs = instrs;

    }

    public ArrayList<MJJNotMethDecl> getVars() { return vars; }
    public ArrayList<MJJInstr> getInstrs() { return instrs; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
