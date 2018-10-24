package lecture10.task03;

import java.util.ArrayList;
import java.util.ListIterator;

public class Students {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Vasya");
        list.add("Kolya");
        list.add("Igor");
        list.add("Roma");
        list.add("Vlad");

        for (String s : list) {
            System.out.println(s);
        }

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println("\nFirst: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("\nSecond: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
