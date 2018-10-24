package lecture14.task04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "+375259092589 " +
                "+375(25)9092589 " +
                "+375-25-909-25-89 " +
                "+375259092589";
        System.out.println(string);
        System.out.println("------------------");
        // \\+375[0-9]{9}
        Pattern pattern = Pattern.compile("\\+375[0-9]{9}");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group().replaceAll("\\+375?", "+375(")
                    .replaceAll("(?<=\\+375\\((25|29|44|33))", ")")
                    .replaceAll("(?<=\\)[0-9]{3})", "-")
                    .replaceAll("(?<=\\-[0-9]{2})", "-"));
        }
        // \\+375\((25|29|44|33)\)[0-9]{3}(-([0-9]{2})){2}
    }
}
