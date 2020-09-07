package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCInvoke extends JJCInstr {

    private String id;

    public JJCInvoke(String id) { this.id = id; }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public String getId() { return id; }

}
