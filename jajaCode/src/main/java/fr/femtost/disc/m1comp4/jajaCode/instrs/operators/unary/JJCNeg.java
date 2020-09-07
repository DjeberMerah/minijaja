package fr.femtost.disc.m1comp4.jajaCode.instrs.operators.unary;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCNeg extends JJCInstr {

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

}
