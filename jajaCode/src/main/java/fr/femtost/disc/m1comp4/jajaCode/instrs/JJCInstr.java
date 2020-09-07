package fr.femtost.disc.m1comp4.jajaCode.instrs;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public abstract class JJCInstr {

    public abstract Object accept(IJJCVisitor visitor);

}
