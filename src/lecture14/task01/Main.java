package lecture14.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email1 = "yahorbukatkin@gmail.com";
        String email2 = "yahor_bukatkin@gmail.com";
        String email3 = "yahor-bukatkin@gmail.com";
        String email4 = "yahor123_bukatkin@life.com.by";
        String email5 = "123yahor-bukatkin@gmail.com";

        List<String> list = new ArrayList<>();
        list.add(email1);
        list.add(email2);
        list.add(email3);
        list.add(email4);
        list.add(email5);

        Pattern pattern = Pattern.compile("^([a-zA-Z])+(?!-).\\w+@(\\w+.\\w+){2}");
        Matcher matcher;

        for (String s : list) {
            matcher = pattern.matcher(s);
            System.out.println(s + " = " + matcher.find());
        }

    }
}
