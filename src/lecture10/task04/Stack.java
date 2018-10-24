package lecture10.task04;

import java.util.ArrayList;
import java.util.ListIterator;

public class Stack {
    private ArrayList<Integer> list = new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public void push(int value) {
        if (list.size() < capacity) {
            list.add(value);
        } else {
            throw new NullPointerException();
        }
    }

    public void get() {
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
