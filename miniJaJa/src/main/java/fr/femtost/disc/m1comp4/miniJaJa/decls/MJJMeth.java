package fr.femtost.disc.m1comp4.miniJaJa.decls;

import fr.femtost.disc.m1comp4.memory.EType;
import fr.femtost.disc.m1comp4.miniJaJa.MJJHeader;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.MJJInstr;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

import java.util.ArrayList;

public class MJJMeth extends MJJDecl {

    private ArrayList<MJJHeader> headers;
    private ArrayList<MJJNotMethDecl> vars;
    private ArrayList<MJJInstr> instrs;

    public MJJMeth(EType type, MJJIdent id, ArrayList<MJJHeader> headers, ArrayList<MJJNotMethDecl> vars , ArrayList<MJJInstr> instrs, int line, int column) {

        super(type, id, line, column);
        this.headers = headers;
        this.vars = vars;
        this.instrs = instrs;

    }

    public ArrayList<MJJHeader> getHeaders() { return headers; }
    public ArrayList<MJJNotMethDecl> getVars() { return vars; }
    public ArrayList<MJJInstr> getInstrs() { return instrs; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
