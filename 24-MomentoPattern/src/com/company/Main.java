package com.company;

// implementing the Momento design pattern to simulate a text editor
// story: as a user, I would like to save my info anytime so that I can undo it

public class Main {

    public static void main(String[] args) {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("agenda.txt");
        fileWriterUtil.write("first line\n");  // builder auto appends non-delimiterlessly thus need one, \n

        // check file content
        System.out.println(fileWriterUtil + "\n\n");

        // originator not responsible for saving itself
        //fileWriterUtil.save();

        // saving the entire file object
        fileWriterCaretaker.save(fileWriterUtil);

        // now continue writing
        fileWriterUtil.write("second line\n");
        // checking file content
        System.out.println(fileWriterUtil + "\n\n");
        // save again
        fileWriterCaretaker.save(fileWriterUtil);

        // write again without a save
        fileWriterUtil.write("third line\n");
        // checking file content
        System.out.println(fileWriterUtil + "\n\n");

        // lets undo to last save
        fileWriterCaretaker.undo(fileWriterUtil);

        // checking file content after undo
        System.out.println(fileWriterUtil + "\n");


        // ======= nb: does not support multiple undo to prev prev save, hence still print last saved result
//        fileWriterCaretaker.undo(fileWriterUtil);
//        System.out.println(fileWriterUtil + "\n");
//        fileWriterCaretaker.undo(fileWriterUtil);
//        System.out.println(fileWriterUtil + "\n");
    }
}
