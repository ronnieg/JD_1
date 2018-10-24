package lecture11.task01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        if (list.isEmpty() == false) {
            set.addAll(list);
            result = set.size();
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(15);
        list.add(15);

        System.out.println(countUnique(list));
    }
}
