package fr.femtost.disc.m1comp4.miniJaJa.instrs;

import fr.femtost.disc.m1comp4.miniJaJa.visitor.IMJJVisitor;

public class MJJPrintS extends MJJInstr {
    private String str;

    public MJJPrintS(int line, int column, String str){
        super(line, column);
        this.str = str.substring(1,str.length()-1).replace("\\n","\n");
    }

    public String getString(){
        return str;
    }

    public Object accept(IMJJVisitor visitor) {
        return visitor.visit(this);
    }
}
