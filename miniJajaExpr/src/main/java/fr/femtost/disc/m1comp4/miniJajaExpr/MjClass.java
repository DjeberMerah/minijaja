package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.ArrayList;
import java.util.List;

public class MjClass extends ExprMiniJaja{
    private Ident ident;
    private List<Decl> decls;
    private MethMain methMain;

    public MjClass(){
        decls = new ArrayList<>();
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
