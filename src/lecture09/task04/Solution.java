package lecture09.task04;

public class Solution<T1, T2> {

    private T1 var1;
    private T2 var2;

    public Solution(T1 var1, T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public Double sum() {
        double d1 = Double.valueOf(String.valueOf((T1) var1));
        double d2 = Double.valueOf(String.valueOf((T1) var2));
        return d1 + d2;
    }

    public Double razn() {
        double d1 = Double.valueOf(String.valueOf((T1) var1));
        double d2 = Double.valueOf(String.valueOf((T1) var2));
        return d1 - d2;
    }

}
