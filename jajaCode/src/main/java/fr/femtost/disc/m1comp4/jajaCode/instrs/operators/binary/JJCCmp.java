package fr.femtost.disc.m1comp4.jajaCode.instrs.operators.binary;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCCmp extends JJCInstr {

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

}
