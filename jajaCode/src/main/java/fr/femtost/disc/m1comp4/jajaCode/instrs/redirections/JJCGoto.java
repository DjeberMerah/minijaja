package fr.femtost.disc.m1comp4.jajaCode.instrs.redirections;

import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.IJJCVisitor;

public class JJCGoto extends JJCInstr {

    private int address;

    public JJCGoto(int address) { this.address = address; }

    public Object accept(IJJCVisitor visitor) { return visitor.visit(this); }

    public int getAddress() { return address; }

    public void setAddress(int add) {
        address = add;
    }

}
