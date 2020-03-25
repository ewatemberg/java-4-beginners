package main.java.com.java4beginners.poo;

/**
 * Write a description of class BookRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookRunner {

    public static void main(String[] args) {
        // Create a new class called Book
        // Create three instances
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(50);
        Book cleanCode = new Book(40);

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);
    }

}
