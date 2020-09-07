package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.ArrayList;
import java.util.List;

public class MjIf extends Instr {

    private Expr expression;
    private List<Instr> instrsIf;
    private List<Instr> instrsElse;

    @Override
    void interpret() {
        instrsIf = new ArrayList<>();
        instrsElse = new ArrayList<>();
    }

    @Override
    void compile() {

    }

    @Override
    MjType typeCheck() {

        return null;
    }
}
