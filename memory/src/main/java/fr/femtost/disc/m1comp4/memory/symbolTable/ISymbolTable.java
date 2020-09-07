package fr.femtost.disc.m1comp4.memory.symbolTable;

public interface ISymbolTable {

        void put(String key, Object value) throws HashTableException;
        Object get(String key) throws HashTableException;
        void remove(String key) throws HashTableException;
        boolean contains(String key);
        int size();

}
