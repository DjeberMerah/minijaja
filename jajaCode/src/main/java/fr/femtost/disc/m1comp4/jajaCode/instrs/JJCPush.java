package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.terms.JJCVal;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCPush extends JJCInstr {

    private JJCVal value;

    public JJCPush(JJCVal value) { this.value = value; }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public JJCVal getValue() { return value; }

}
