package com.company;

public class FileWriterUtil {
    private String name;
    private StringBuilder content;

    public FileWriterUtil(String name) {
        this.name = name;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    // only functionality used by this class
    public void write(String info) {
        this.content.append(info);
    }

    // used by caretaker
    public Momento save(){
        return new Momento(this.name, this.content);
    }

    // used by caretaker....pass saved return obj to be undo-ed
    public void undoToLastSave(Object object) { // Object type cua cannot Momento can't be accessed externally to be passed
        Momento momento = (Momento) object; // Momento, only accessible in this class
        this.name = momento.name;
        this.content = momento.content;
    }

    // this create a deep copy of the states of the object....and the entire object saved by the caretaker
        // hidden from the caretaker...opaque object
    // same as the Originator, FileWriterUtil
    private class Momento {
        private String name;
        private StringBuilder content;

        public Momento(String name, StringBuilder content) {
            this.name = name;
            this.content = new StringBuilder(content);  // not this.content = content cus it doesn't build up, it sets
        }
    }
}
