package fr.femtost.disc.m1comp4.memory.symbolTable;

public class Entry {

        private String key;
        private Object value;

        public Entry(String key, Object value) {

            this.key = key;
            this.value = value;

        }

        public String getKey() { return key; }
        public Object getValue() { return value; }

        public void setValue(Object value) { this.value = value; }

}
