package lecture10.task07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-3);
        list.add(0);
        list.add(5);
        list.add(-1);
        list.add(-1);
        System.out.println(list);
        System.out.println("=============");
        int a, b;
        for(int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                a = list.get(i);
                b = list.get(j);
                if (a > b) {
                    list.set(j, a);
                    list.set(i, b);
                }
            }
        }
        System.out.println(list);
    }
}
