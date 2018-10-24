package lecture14.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean ipAnalyzer(String ip) {
        boolean result = false;
        Pattern pattern = Pattern.compile("^((![0].)|(0\\.)|[1][0-9].|[2][0-5][0-5]|[1][0-1]|[1]|[0])\\.((([01][0-9][0-9])|[1]|[0]|[2][0-5][0-5]|[1][0-9])\\.){2}(([01][0-9][0-9])|[1]|[0]|[2][0-5][0-5]|[1][0-9])$");
        Matcher matcher = pattern.matcher(ip);

        if (matcher.find() == true) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String ip1 = "0.0.0.0";
        String ip2 = "001.12.21.255";
        String ip3 = "1.1.1.1";
        String ip4 = "10.255.255.255";
        String ip5 = "100.12.0.255";
        String ip6 = "192.0.0.255";
        String ip7 = "203.0.113.0";
        String ip8 = "192.0.0.256";
        String ip0 = "192.0.0.255.2";

        List<String> list = new ArrayList<>();
        list.add(ip1);
        list.add(ip2);
        list.add(ip3);
        list.add(ip4);
        list.add(ip5);
        list.add(ip6);
        list.add(ip7);
        list.add(ip8);
        list.add(ip0);

        for (String s : list) {
            System.out.println(s + " = " + ipAnalyzer(s));
        }

    }
}
