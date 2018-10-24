package lecture11.hometask01;

import java.util.*;

public class Dictionary {
    private String text;

    public Dictionary(String text) {
        this.text = text;
    }

    public void parse() {
        List<String> list = new ArrayList<>(Arrays.asList(text.split("[\\p{Punct}\\s]+")));
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                int value = map.get(list.get(i));
                map.put(list.get(i), value + 1);
            } else {
                map.put(list.get(i), 1);
            }
        }
        System.out.println(map.keySet());
        System.out.println("============");
        for (String name: map.keySet()){

            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " = " + value);


        }
    }
}
