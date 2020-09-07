package fr.femtost.disc.m1comp4.memory;

public enum EType {

    BOOLEAN("boolean"),
    INTEGER("integer"),
    VOID("void"),
    OMEGA("omega");

    private String label;

    EType(String label) { this.label = label; }

    @Override
    public String toString() { return label; }

    public static EType get(String name){
        switch(name){
            case "int":
                return EType.INTEGER;
            case "boolean":
                return EType.BOOLEAN;
            case "void":
                return EType.VOID;
            case "omega":
                return EType.OMEGA;
        }
        return null;
    }

}
