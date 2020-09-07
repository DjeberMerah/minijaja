package fr.femtost.disc.m1comp4.miniJaJa.ids;

import fr.femtost.disc.m1comp4.miniJaJa.exps.MJJExp;

public abstract class MJJId extends MJJExp {

    public MJJId(int line, int column){
        super(line, column);
    }

    public abstract String getLabel();

}
