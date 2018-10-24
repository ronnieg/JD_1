package lecture10.task05;

import java.util.Set;
import java.util.TreeSet;

public class Sets<T extends Number> {

    public Set intersection(Set<T> set1, Set<T> set2) {
        Set<T> set = new TreeSet<>();
        set.addAll(set1);
        set.retainAll(set2);
        return set;
    }

    public Set union(Set<T> set1, Set<T> set2) {
        Set<T> set = new TreeSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }
}
