package lesson_13;

public class TestDataFactory {

    public static void main(String[] args) {
        String relativeFilePath = "/src/lesson_13/Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        DataFactory.readFile(absoluteFilePath);
    }
}
