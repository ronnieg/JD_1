package lecture13.task06;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String string = "aaabbcdeef"; // abcdef
        List<String> list = new ArrayList<>();
        String[] array = string.split("");
        for (String s : array) {
            list.add(s);
        }
        Set<String> set = new LinkedHashSet<>();
        set.addAll(list);
        String newString = String.join("", set);
        System.out.println(string);
        System.out.println(newString);
    }

}
