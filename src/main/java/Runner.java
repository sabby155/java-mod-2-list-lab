import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static <E> void main(String[] args) {
        // your code here
        // the loop logic to gather the book information from the user

        System.out.println("Running...");

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Which book title would you like to add to the library?");
            String bookTitle = getUserInput();

            List<String> answers = new ArrayList<String>();

            answers.add(bookTitle);

            System.out.println("By the way, what genre is " + bookTitle + "?");
            String bookGenre = getUserInput();

            answers.add(bookGenre);

            System.out.println("By the way, how many pages are in " + bookTitle + "?");
            String bookNumOfPages = getUserInput();

            answers.add(bookNumOfPages);

            // Create a new book and set it with given attributes
            Book newBook = new Book();
            newBook.title = answers.get(0);
            newBook.genre = answers.get(1);
            newBook.numOfpages = answers.get(2);

            System.out.print("did book work? " + newBook.title);

            Library myLibrary = new Library();
            myLibrary.addBookToLibrary(newBook);

            System.out.println("Would you like to add another book? Type 'Yes' or 'No'");
            String userContinue = getUserInput();
            System.out.println("You said " + userContinue);
            if (userContinue.equals("No")) {
                runProgram = false;
            } else {
                continue;
            }
        }

    }

    private static <E> E getUserInput() {
        try {
            Scanner newScanner = new Scanner(System.in);
            String userInput = newScanner.nextLine();
            return (E) userInput;
        } catch (InputMismatchException e) {
            return null;
        }
    }

}
