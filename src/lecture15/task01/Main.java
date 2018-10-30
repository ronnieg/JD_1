package lecture15.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/egorbukatkin/IdeaProjects/JD_1/src/lecture15/file.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.readLine() != null) {
                    System.out.println(reader.readLine());
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("File not found...");
        }
    }
}
