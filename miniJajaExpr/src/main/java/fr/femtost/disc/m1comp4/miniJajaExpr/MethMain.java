package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.ArrayList;
import java.util.List;

public class MethMain extends ExprMiniJaja{
    private List<Vars> vars;
    private List<Instr> instrs;

    public MethMain(){
        vars = new ArrayList<>();
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
