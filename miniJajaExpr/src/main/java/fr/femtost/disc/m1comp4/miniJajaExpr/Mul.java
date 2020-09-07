package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Mul extends ArithBin {
    public Mul(){

    }

    @Override
    void interpret() {

    }

    @Override
    void compile() {

    }

    @Override
    MjType typeCheck() {
    	if (leftExpr.typeCheck()==rightExpr.typeCheck() && leftExpr.typeCheck()== MjType.INT) {
    		return leftExpr.typeCheck();
    	}
    	return MjType.ERROR_TYPE;
    }
}
