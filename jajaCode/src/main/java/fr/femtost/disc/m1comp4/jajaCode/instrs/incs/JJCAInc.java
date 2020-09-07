package fr.femtost.disc.m1comp4.jajaCode.instrs.incs;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCAInc extends JJCInstr {

    private String id;

    public JJCAInc(String id) { this.id = id; }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public String getId() { return id; }

}
