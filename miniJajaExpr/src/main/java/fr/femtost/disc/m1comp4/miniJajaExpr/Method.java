package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.ArrayList;
import java.util.List;

public class Method extends ExprMiniJaja{
    private List<Decl> entetes;
    private List<Vars> varz;
    private List<Instr> instrs;

    public Method(){
        entetes = new ArrayList<>();
        varz = new ArrayList<>();
        instrs = new ArrayList<>();
    }

    @Override
    void interpret() {

    }

    @Override
    void compile() {

    }

    @Override
    MjType typeCheck() {

        return null;
    }
}
