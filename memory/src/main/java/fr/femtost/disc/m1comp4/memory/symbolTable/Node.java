package fr.femtost.disc.m1comp4.memory.symbolTable;

public class Node {

    private Entry entry;
    private Node next, prev;

    public Node(Entry entry) { this(entry, null); }

    public Node(Entry entry, Node next) {

        this.entry = entry;
        this.next = next;
        this.prev = null;

    }

    public String getKey() { return entry.getKey(); }
    public Object getValue() { return entry.getValue(); }
    public Node getNext() { return next; }
    public Node getPrev() { return prev; }

    public void setValue(Object value) { entry.setValue(value); }
    public void setNext(Node next) { this.next = next; }
    public void setPrev(Node prev) { this.prev = prev; }

}

