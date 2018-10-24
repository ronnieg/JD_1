package lecture11.task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackBox {
    private List<Integer> list = new ArrayList<>();

    public BlackBox() {}

    public void add(int i) {
        list.add(i);
    }

    public int getMin(int i) {
        if (!(list.isEmpty())) {
            Collections.sort(list);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public int getMax(int i) {
        if (!(list.isEmpty())) {
            Collections.sort(list);
            Collections.reverse(list);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }
}
