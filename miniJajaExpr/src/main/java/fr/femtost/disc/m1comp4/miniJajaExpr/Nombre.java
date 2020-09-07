package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Nombre extends Term {
    private Integer value;

    public Nombre(){
        
    }

    @Override
    void interpret() {

    }

    @Override
    void compile() {

    }

    @Override
    MjType typeCheck() {

        return MjType.INT;
    }
}
