package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Sub extends  ArithBin {
    public Sub(){

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
