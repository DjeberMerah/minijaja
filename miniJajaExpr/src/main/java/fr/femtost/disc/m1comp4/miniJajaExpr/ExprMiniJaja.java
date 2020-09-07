package fr.femtost.disc.m1comp4.miniJajaExpr;

public abstract class ExprMiniJaja {
    abstract void interpret();
    abstract void compile();
    abstract MjType typeCheck();
}
