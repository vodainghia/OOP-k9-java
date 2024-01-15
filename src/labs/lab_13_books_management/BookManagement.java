package labs.lab_13_books_management;

import java.util.List;
import java.util.Scanner;

public class BookManagement {
    private final BookFileManager bookFileManager;
    private final MenuHandler menuHandler;

    public BookManagement(BookFileManager bookFileManager, MenuHandler menuHandler) {
        this.bookFileManager = bookFileManager;
        this.menuHandler = menuHandler;
    }

    public void userMenuController(Scanner scanner) {
        boolean isContinue = true;

        while (isContinue) {
            menuHandler.printUserMenu();
            int userSelection = menuHandler.getUserSelection(scanner);

            switch (userSelection) {
                case 1 -> addBook(scanner);
                case 2 -> printFoundBook(scanner);
                case 3 -> updateBook(scanner);
                case 4 -> deleteBook(scanner);
                case 5 -> printBooksList();
                case 0 -> {
                    System.out.println("Thank for using. See you again.");
                    isContinue = false;
                }
            }
        }

        scanner.close();
    }

    private Book inputBookInfo(Scanner scanner, String action) {
        scanner.nextLine(); //consume newline
        System.out.print("Please input ISBN: ");
        String bookISBN = scanner.nextLine();
        while (action.equals("add") && findBook(bookISBN) != null) {
            System.out.println("The ISBN " + bookISBN + " is existing. Please use the new one!");
            System.out.print("Please input ISBN: ");
            bookISBN = scanner.nextLine();
        }

        System.out.print("Please input title: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Please input author: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Please input year: ");
        String bookYear = scanner.nextLine();

        return new Book(bookISBN, bookTitle, bookAuthor, bookYear);
    }

    private void addBook(Scanner scanner) {
        Book newBook = inputBookInfo(scanner, "add");
        List<Book> currentBooksList = bookFileManager.readBooksListFromFile();
        currentBooksList.add(newBook);
        bookFileManager.saveBooksListToFile(currentBooksList);
        System.out.println("The book is saved into DB with info: " + newBook);
    }

    private void printFoundBook(Scanner scanner) {
        scanner.nextLine(); //consume newline
        System.out.print("Please input ISBN: ");
        String findingBookISBN = scanner.nextLine();
        Book book = findBook(findingBookISBN);

        if (book == null) {
            System.out.println("The book with ISBN " + findingBookISBN + " is not found");
        } else {
            System.out.println(book);
        }
    }

    private Book findBook(String findingBookISBN) {
        List<Book> currentBooksList = bookFileManager.readBooksListFromFile();

        for (Book book : currentBooksList) {
            if (book.getISBN().equals(findingBookISBN)) {
                return book;
            }
        }

        return null;
    }

    private void updateBook(Scanner scanner) {
        List<Book> currentBooksList = bookFileManager.readBooksListFromFile();
        scanner.nextLine(); //consume newline
        System.out.print("Please input target ISBN: ");
        String targetBookISBN = scanner.nextLine();

        if (findBook(targetBookISBN) == null) {
            System.out.println("The book with ISBN " + targetBookISBN + " is not found");
        } else {
            Book updatingBook = inputBookInfo(scanner, "update");

            currentBooksList.replaceAll(book -> book.getISBN().equals(targetBookISBN) ? updatingBook : book);

            bookFileManager.saveBooksListToFile(currentBooksList);
            System.out.println("The book is updated with info: " + updatingBook);
        }
    }

    private void deleteBook(Scanner scanner) {
        List<Book> currentBooksList = bookFileManager.readBooksListFromFile();
        scanner.nextLine(); //consume newline
        System.out.print("Please input ISBN: ");
        String targetBookISBN = scanner.nextLine();

        boolean isBookFound = currentBooksList.removeIf(book -> book.getISBN().equals(targetBookISBN));

        if (isBookFound) {
            bookFileManager.saveBooksListToFile(currentBooksList);
            System.out.println("The book with ISBN '" + targetBookISBN + "' is deleted from DB.");
        } else {
            System.out.println("The book with ISBN " + targetBookISBN + " is not found");
        }
    }

    private void printBooksList() {
        List<Book> bookList = bookFileManager.readBooksListFromFile();
        StringBuilder bookTemplate = new StringBuilder();

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            bookTemplate.append(String.format("""
                    Book %d: %s
                        ISBN: %s
                        Author: %s
                        Year: %s
                    """, (i + 1), book.getTitle(), book.getISBN(), book.getAuthor(), book.getYear()));
        }

        System.out.println(bookTemplate);
    }
}
