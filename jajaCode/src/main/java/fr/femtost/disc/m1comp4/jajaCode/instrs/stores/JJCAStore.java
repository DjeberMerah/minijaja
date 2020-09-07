package fr.femtost.disc.m1comp4.jajaCode.instrs.stores;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCAStore extends JJCInstr {

    private String id;

    public JJCAStore(String id) { this.id = id; }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public String getId() { return id; }

}
