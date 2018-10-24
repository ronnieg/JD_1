package lecture12.task02;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
