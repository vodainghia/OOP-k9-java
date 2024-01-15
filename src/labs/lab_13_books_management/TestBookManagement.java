package labs.lab_13_books_management;

import java.util.Scanner;

public class TestBookManagement {

    public static void main(String[] args) {
        String relativePath = "/src/labs/lab_13_books_management/booksDB.txt";
        String absolutePath = System.getProperty("user.dir").concat(relativePath);

        BookFileManager bookFileManager = new BookFileManager(absolutePath);
        MenuHandler menuHandler = new MenuHandler();
        BookManagement bookManagement = new BookManagement(bookFileManager, menuHandler);

        Scanner scanner = new Scanner(System.in);
        bookManagement.userMenuController(scanner);

    }
}
