package fr.femtost.disc.m1comp4.miniJaJa.instrs.assigns;

import fr.femtost.disc.m1comp4.miniJaJa.ids.MJJId;
import fr.femtost.disc.m1comp4.miniJaJa.instrs.MJJInstr;

public abstract class MJJAssign extends MJJInstr {

    protected MJJId id;

    public MJJAssign(MJJId id, int line, int column) {
        super(line, column);
        this.id = id;
    }

    public MJJId getId() { return id; }

}
