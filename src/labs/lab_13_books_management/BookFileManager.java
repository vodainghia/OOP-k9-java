package labs.lab_13_books_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFileManager {
    private final String filePath;

    public BookFileManager(String filePath) {
        this.filePath = filePath;
    }

    protected List<Book> readBooksListFromFile() {
        System.out.println("[INFO] Reading file from ".concat(filePath));
        List<Book> bookList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                Book book = new Book(bookData[0], bookData[1], bookData[2], bookData[3]);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            System.out.println("[ERR] Error reading file: " + e.getMessage());
        }

        return bookList;
    }

    protected void saveBooksListToFile(List<Book> bookList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            System.out.println("[ERR] Error reading file: " + e.getMessage());
        }
    }
}
