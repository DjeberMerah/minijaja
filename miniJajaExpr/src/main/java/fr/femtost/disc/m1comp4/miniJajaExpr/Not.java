package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Not extends UnExpr {

    public Not(){

    }

    @Override
    void interpret() {

    }

    @Override
    void compile() {

    }

    @Override
    MjType typeCheck() {

    	MjType type = expression.typeCheck();
    	
    	if(type == MjType.BOOL) {
    		return MjType.BOOL;
    	}
    	
        return MjType.ERROR_TYPE;
    }
}
