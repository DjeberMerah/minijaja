package fr.femtost.disc.m1comp4.memory.symbolTable;

public class HashTable implements ISymbolTable {

    private static final int SIZE = 256;

    private Bucket[] bucketArray;
    private int nbrObject = 0;

    public HashTable() { bucketArray = new Bucket[SIZE]; }

    public void put(String key, Object value) {

        int index = hash(key);

        Entry e = new Entry(key, value);

        if (bucketArray[index] == null) {

            nbrObject++;
            bucketArray[index] = new Bucket(e);

        } else if (bucketArray[index].add(e)) nbrObject++;

    }

    public Object get(String key) throws HashTableException {

        if (nbrObject == 0) throw new HashTableException("Empty table.");

        int index = hash(key);

        if (bucketArray[index] == null || bucketArray[index].getNbrNode() == 0)
            throw new HashTableException("Key not found.");

        Node n = bucketArray[index].get(key);

        if (n != null) return n.getValue();
        else throw new HashTableException("Key not found.");

    }

    public void remove(String key) throws HashTableException {

        if (nbrObject == 0) throw new HashTableException("Empty table.");

        int index = hash(key);

        if(bucketArray[index] == null) throw new HashTableException("Key not found.");

        bucketArray[index].remove(key);
        nbrObject--;

    }

    public boolean contains(String key) {

        if (nbrObject != 0) {

            Bucket b = bucketArray[hash(key)];
            return (b != null && b.contains(key));

        } else return false;
    }

    public int size() { return nbrObject; }

    /*
     * DJB hash algorithm
     */
    public int hash(String s) {

        int h = 5381, p = 1117;

        for (int i = 0; i < s.length(); ++i)
            h = ((h << 5) + h) + s.charAt(i);

        return (Math.abs(h) % p) % SIZE;

    }
}
