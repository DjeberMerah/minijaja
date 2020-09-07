package fr.femtost.disc.m1comp4.memory.symbolTable;

public class Bucket {
    private int nbrNode = 0;

    private Node list;

    public Bucket(Entry e) { this.add(e); }

    public boolean add(Entry e) {

        Node n = get(e.getKey());

        if (n != null) {

            n.setValue(e.getValue());
            return false;

        }

        nbrNode++;
        Node v = new Node(e, list);

        if (list != null) list.setPrev(v);

        list = v;

        return true;

    }

    public void remove(String key) throws HashTableException {

        Node n = get(key);

        if (n == null) throw new HashTableException("Key not found.");

        nbrNode--;

        if (n.getPrev() != null) n.getPrev().setNext(n.getNext());
        else list = n.getNext();

        if (n.getNext() != null) n.getNext().setPrev(n.getPrev());

    }


    public Node get(String key) {

        Node n = list;

        while (n != null && !key.equals(n.getKey())) n = n.getNext();

        return n;

    }

    public boolean contains(String key) { return (get(key) != null); }

    public int getNbrNode() { return nbrNode; }

}

