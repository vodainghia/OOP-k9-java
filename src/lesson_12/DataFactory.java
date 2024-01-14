package lesson_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataFactory {

    public static void readFile(String filePath) {
        System.out.println("Reading file from ".concat(filePath));

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath); // throws FileNotFoundException => need handle Checked exception
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("the file path ".concat(filePath).concat(" is not found!"));
        }
    }

    public static void main(String[] args) {
        DataFactory.readFile("src/lesson_12/DataFactory.java");
    }
}
