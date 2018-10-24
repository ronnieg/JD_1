package lecture09.task02;

import lecture09.task01.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        System.out.println(pair);
        System.out.println(PairUtil.swap(pair));
    }
}
