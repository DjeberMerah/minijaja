package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCPrint extends JJCInstr {
    public Object accept(IJJCVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
