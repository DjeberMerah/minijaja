package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Add extends ArithBin {
    public Add(){

    }

    @Override
    void interpret() {
        leftExpr.interpret();
        rightExpr.interpret();
        //
    }

    @Override
    void compile() {

    }

}
