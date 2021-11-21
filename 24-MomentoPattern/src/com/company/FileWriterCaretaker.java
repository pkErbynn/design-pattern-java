package com.company;

// responsible for saving the entire object and undoing

public class FileWriterCaretaker {
    // private Momento object; // not posible since Momento type is an internal private class
    private Object object;

    // no need of constructor cus it's set by the originator class
//    public Caretaker(Object object) {
//        this.object = object;
//    }

    // saving of entire file object is encapsulated
    public void save(FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }

    // undoing entire file object

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(this.object);
    }
}
