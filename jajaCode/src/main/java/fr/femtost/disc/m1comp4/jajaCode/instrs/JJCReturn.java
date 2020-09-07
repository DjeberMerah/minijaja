package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCReturn extends JJCInstr {

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

}
