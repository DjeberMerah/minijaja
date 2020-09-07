package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCPrintS extends JJCInstr {

    private String str;

    public JJCPrintS(String str){
        this.str = str;
    }

    public Object accept(IJJCVisitor visitor) {
        visitor.visit(this);
        return null;
    }

    public String getStr() {
        return str;
    }
}
