package fr.femtost.disc.m1comp4.jajaCode.instrs.news;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;
import fr.femtost.disc.m1comp4.memory.EObjectNature;
import fr.femtost.disc.m1comp4.memory.EType;

public class JJCNew extends JJCInstr {

    private String id;
    private EType type;
    private EObjectNature sorte;
    private int offset;

    public JJCNew(String id, EType type, EObjectNature sorte, int offset) {

        this.id = id;
        this.type = type;
        this.sorte = sorte;
        this.offset = offset;

    }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public String getId() { return id; }

    public EType getType() { return type; }

    public EObjectNature getSorte() { return sorte; }

    public int getOffset() { return offset; }
}
