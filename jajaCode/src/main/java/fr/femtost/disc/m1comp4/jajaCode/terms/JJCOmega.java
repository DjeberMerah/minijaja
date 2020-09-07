package fr.femtost.disc.m1comp4.jajaCode.terms;

import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCOmega extends JJCVal {
    public String toString() {
        return "w";
    }

    public Object accept(IJJCVisitor visitor){
        return visitor.visit(this);
    }
}
