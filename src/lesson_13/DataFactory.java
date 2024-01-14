package lesson_13;

import java.io.*;

public class DataFactory {

    static void readFile(String filePath) {
        System.out.println("[INFO] Reading file from ".concat(filePath));

        try (
                // Water source
                FileInputStream fileInputStream = new FileInputStream(filePath);

                // Water pipes
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

                // Water container
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            // No need to close here because Java 8 onward supports AutoClosable
//            bufferedReader.close();
//            inputStreamReader.close();
//            fileInputStream.close();

            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
