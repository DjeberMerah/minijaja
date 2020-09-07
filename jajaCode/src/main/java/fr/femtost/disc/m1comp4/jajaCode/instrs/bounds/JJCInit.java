package fr.femtost.disc.m1comp4.jajaCode.instrs.bounds;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCInit extends JJCInstr {

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

}
