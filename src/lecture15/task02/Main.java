package lecture15.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/egorbukatkin/IdeaProjects/JD_1/src/lecture15/file.txt");
        List<String> list;
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("^[aeiuoAEIOU]{1}");
        Matcher matcher;
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.readLine() != null) {
                    stringBuilder.append(reader.readLine());
                }
                String string = String.valueOf(stringBuilder);
                list = new ArrayList<>(Arrays.asList(string.replaceAll("[\\p{Punct}&&[^()]]", " ").split(" ")));
                for (String s : list) {
                    matcher = pattern.matcher(s);
                    if (matcher.find()) {
                        System.out.println(s);
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("File not found...");
        }
    }
}
