package fr.femtost.disc.m1comp4.jajaCode.terms;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCNum extends JJCVal {

    private int value;

    public JJCNum(int value) { this.value = value; }

    public Object accept(IJJCVisitor v) { return v.visit(this); }

    public int getValue() { return value; }

    public String toString() { return Integer.toString(value); }

}
