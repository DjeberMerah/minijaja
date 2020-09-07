package fr.femtost.disc.m1comp4.miniJaJa;

import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public abstract class MJJNode {

    private int lineNumber;
    private int columnNumber;

    public MJJNode(int line, int column){
        lineNumber = line;
        columnNumber = column;
    }

    public int getLineNumber(){
        return lineNumber;
    }

    public int getColumnNumber(){
        return columnNumber;
    }

    public abstract Object accept(IMJJVisitor visitor);



}
