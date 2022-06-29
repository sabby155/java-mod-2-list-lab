import java.util.ArrayList;
import java.util.List;

public class Library {

    public void addBookToLibrary(Book newBook) {
        List mainLibrary = new ArrayList();
        mainLibrary.add(newBook);
        System.out.println("I added " + newBook.title + " to this library!");
        System.out.println("from library - the library contains  " + mainLibrary.get(0));
    }
}
