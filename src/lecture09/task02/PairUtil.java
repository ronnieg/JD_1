package lecture09.task02;

import lecture09.task01.Pair;

public final class PairUtil {
    public static<K, V> Pair<K, V> swap(Pair obj) {
        return new Pair(obj.getVar2(), obj.getVar1());
    }
}
