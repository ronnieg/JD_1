package lecture11.task02;

import java.util.*;

public class Main {

    public static boolean isUnique(Map<String, String> map) {
        boolean bool = true;
        Set<String> set = new HashSet<>(map.values());
        if (set.size() != map.values().size()) {
            bool = false;
        }
        return bool;
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>();
        Map<String, String> map2 = new TreeMap<>();

        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");

        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(isUnique(map1));
        System.out.println(isUnique(map2));
    }

}
