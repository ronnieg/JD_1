package lecture14.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "0x5A3 sdfs 222 asd 0x7FFF fFF FFF aAAA 3x3####";
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
