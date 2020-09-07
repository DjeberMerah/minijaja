package fr.femtost.disc.m1comp4.jajaCode.terms;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCBool extends JJCVal {

    private boolean value;

    public JJCBool(boolean value) { this.value = value; }

    public Object accept(IJJCVisitor v) { return v.visit(this); }

    public boolean getValue() { return value; }

    public String toString() { return Boolean.toString(value); }

}
