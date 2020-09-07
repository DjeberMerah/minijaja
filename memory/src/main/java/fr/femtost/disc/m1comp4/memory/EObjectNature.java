package fr.femtost.disc.m1comp4.memory;

public enum EObjectNature {

    CST("cst"),
    METH("meth"),
    TAB("tab"),
    VAR("var"),
    VCST("vcst") ;

    private String label;

    EObjectNature(String label) { this.label = label; }

    @Override
    public String toString() { return label; }

}
