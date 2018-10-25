package lecture09.task05;

public class Solution {

    @Transaction
    public void method() {
        System.out.println("Transaction is started");
        System.out.println("Transaction is ended");
    }
}
