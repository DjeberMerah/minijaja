package fr.femtost.disc.m1comp4.miniJaJa;

import fr.femtost.disc.m1comp4.miniJaJa.decls.MJJDecl;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;
import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJIdent;

import java.util.ArrayList;
import java.util.List;

public class MJJClass extends MJJNode {

    private MJJIdent id;
    private List<MJJDecl> decls;
    private MJJMain main;

    public MJJClass(int line, int column, MJJIdent id, List<MJJDecl> decls, MJJMain main) {
        super(line, column);
        this.id = id;
        this.decls = decls;
        this.main = main;

    }

    public MJJIdent getId() { return id; }
    public List<MJJDecl> getDecls() { return decls; }
    public MJJMain getMain() { return main; }

    public Object accept(IMJJVisitor visitor) { return visitor.visit(this); }

}
