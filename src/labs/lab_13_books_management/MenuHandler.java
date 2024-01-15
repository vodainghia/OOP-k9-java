package labs.lab_13_books_management;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuHandler {
    public int getUserSelection(Scanner scanner) {
        System.out.print("Please input your selection: ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid selection. Please enter a valid integer!");
            scanner.nextLine(); // Consume the invalid input
            return getUserSelection(scanner);
        }
    }

    protected void printUserMenu() {
        String userMenu = """
                                
                ============ Book Management Program (CRUD) ============
                1. New book
                2. Find a book(ISBN)
                3. Update a book
                4. Delete a book
                5. Print the book list
                0. Exit
                """;
        System.out.println(userMenu);
    }
}
