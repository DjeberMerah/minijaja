package fr.femtost.disc.m1comp4.jajaCode.instrs.news;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;
import fr.femtost.disc.m1comp4.memory.EType;

public class JJCANew extends JJCInstr {

    private String id;
    private EType type;

    public JJCANew(String id, EType type) {

        this.id = id;
        this.type = type;

    }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public String getId() { return id; }

    public EType getType() { return type; }

}
