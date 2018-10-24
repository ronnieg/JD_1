package lecture10.task01;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Задать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
* */
public class ListOfRatings {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        listIterator.add(1);
        listIterator.add(5);
        listIterator.add(3);
        listIterator.add(4);
        listIterator.add(2);

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("----------------");

        while (listIterator.hasNext()) {
            if (listIterator.next() < 4) {
                listIterator.remove();
            }
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

}
