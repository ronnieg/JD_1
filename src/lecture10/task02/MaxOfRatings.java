package lecture10.task02;

import java.util.ArrayList;
import java.util.ListIterator;

/*
* Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
* Найти самую высокую оценку с использованием итератора.
* */
public class MaxOfRatings {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        listIterator.add(2);
        listIterator.add(10);
        listIterator.add(4);
        listIterator.add(3);
        listIterator.add(5);

        int max = list.get(0);

        while (listIterator.hasPrevious()) {
            if (listIterator.previous() > max) {
                max = listIterator.previous();
            }
        }
        System.out.println(max);


    }

}
