package fr.femtost.disc.m1comp4.miniJajaExpr;

public abstract class ArithBin extends BinExpr {
	
	 	@Override
	    MjType typeCheck() {
	 		MjType leftType = leftExpr.typeCheck();
	    	MjType rightType = rightExpr.typeCheck();
	    	
	    	if(leftType == MjType.INT && rightType == MjType.INT) {
	    		return MjType.INT;
	    	}
	    	
	        return MjType.ERROR_TYPE;
	    }
}
