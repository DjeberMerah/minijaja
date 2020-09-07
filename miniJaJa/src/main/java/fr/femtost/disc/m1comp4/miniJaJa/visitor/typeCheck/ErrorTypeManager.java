package fr.femtost.disc.m1comp4.miniJaJa.visitor.typeCheck;

import fr.femtost.disc.m1comp4.memory.EType;

public class ErrorTypeManager {

    private ErrorTypeManager() {}

    public static EType assertEquals(EType expected, EType actual, int line, int column){
        return assertEquals(expected,actual,line,column,false);
    }

    public static EType assertEquals(EType expected, EType actual, int line, int column, boolean decl) {

        if (expected == null || actual == null) return null;

        if (expected.equals(actual)) return expected;
        else if (decl && actual == EType.OMEGA) return expected;
        else
            {

            StringBuffer stringBuffer = new StringBuffer("");
            stringBuffer.append("Incompatible types.");
            stringBuffer.append("\n\tRequired :\t");
            stringBuffer.append(expected.toString());
            stringBuffer.append("\n\tFound :\t\t");
            stringBuffer.append(actual.toString());
            stringBuffer.append("\nAt ").append(line).append(":").append(column);
            System.err.println(stringBuffer.toString());
            return null;
        }
    }

    public static EType assertEqualsBinaryOperator(EType leftType, EType rightType, String operator, EType ... apply_to) {

        // if (apply_to.length == 0) return null;
        //Exception needed maybe ?

        if (leftType == null || rightType == null) return null;

        for (EType type : apply_to)
            if (leftType.equals(type) && rightType.equals(type)) return type;

        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("Operator '");
        stringBuffer.append(operator);
        stringBuffer.append("' cannot be applied to '");
        stringBuffer.append(leftType.toString());
        stringBuffer.append("', '");
        stringBuffer.append(rightType.toString());
        stringBuffer.append("'");
        System.err.println(stringBuffer.toString());

        return null;
    }

    public static EType assertEqualsUnaryOperator(EType expType, String operator, EType ... apply_to) {

        // if (apply_to.length == 0) return null;
        //Exception needed maybe ?

        if (expType == null) return null;

        for (EType type : apply_to)
            if (expType.equals(type)) return type;

        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("Operator '");
        stringBuffer.append(operator);
        stringBuffer.append("' cannot be applied to '");
        stringBuffer.append(expType.toString());
        stringBuffer.append("'\n");
        System.err.println(stringBuffer.toString());
        return null;
    }

    public static void identNotFound(String id, int line, int column) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("Identificator '");
        stringBuffer.append(id);
        stringBuffer.append("' is not defined at line ");
        stringBuffer.append(line);
        stringBuffer.append(":");
        stringBuffer.append(column);
        System.err.println(stringBuffer.toString());
    }
}
