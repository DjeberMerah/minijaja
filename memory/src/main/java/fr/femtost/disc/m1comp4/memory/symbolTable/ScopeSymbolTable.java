package fr.femtost.disc.m1comp4.memory.symbolTable;

import java.util.Stack;

public class ScopeSymbolTable<Object> {

    private Stack<HashTable> scopes = new Stack<>();

    public void beginScope() { scopes.push(new HashTable()); }

    public void endScope() { scopes.pop(); }

    public void putSymbol(String id, Object obj) {
        HashTable scope = scopes.get(scopes.size() - 1);
        if (!scope.contains(id)) scope.put(id, obj);
        //else System.err.append("Variable '" + id + "' is already defined in the scope\n");

    }

    public Object getSymbol(String id, boolean declaration) {

        Object res = null;
        int scope = scopes.size() - 1;
        HashTable symbols;

        while (res == null && scope >= (declaration ? scopes.size() - 1 : 0)) {
            symbols = scopes.get(scope);

            if (symbols.contains(id)) {

                try { res = (Object)symbols.get(id);
                } catch (HashTableException e) { e.printStackTrace(); }

            }
            scope--;
        }

        //if (res == null) System.err.println("Cannot resolve symbol '" + id + "'\n");

        return res;
    }
}
