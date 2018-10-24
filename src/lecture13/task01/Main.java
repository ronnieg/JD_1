package lecture13.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "I";
        String s2 = " ";
        String s3 = "Like";
        String s4 = " ";
        String s5 = "Java";
        String s6 = "Java";
        String s7 = "Java";
        String s8 = "Java";
        String s9 = "Java";
        String s10 = "Java";

        String resultConcat = "";

        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);

        long startTimeConcat = System.nanoTime();

        for (String s : list) {
            resultConcat += s;
        }
        long stopTimeConcat = System.nanoTime();
        long elapsedTimeConcat = stopTimeConcat - startTimeConcat;
        System.out.println("Cocatination:\nExecude time = " + elapsedTimeConcat);
        System.out.println(resultConcat);

        System.out.println("===================");

        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (String s : list) {
            stringBuilder.append(s);
        }
        long stopTimeBuilder = System.nanoTime();
        long elapsedTimeBuilder = stopTimeBuilder - startTimeBuilder;
        System.out.println("StringaBuilder:\nExecude time = " + elapsedTimeBuilder);
        System.out.println(stringBuilder);

    }

}
