package fr.femtost.disc.m1comp4.miniJajaExpr;

public abstract class BoolBin extends BinExpr {
	
	@Override
    MjType typeCheck() {
    	
    	MjType leftType = leftExpr.typeCheck();
    	MjType rightType = rightExpr.typeCheck();
    	
    	if(leftType == MjType.BOOL && rightType == MjType.BOOL) {
    		return MjType.BOOL;
    	}
    	
        return MjType.ERROR_TYPE;
    }
}
