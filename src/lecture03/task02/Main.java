package lecture03.task02;

public class Main {

    public static int func(int i) {
        if (i % 13 == 0 || i % 17 == 0) {
            return i;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        int i = 0;

        while (sum != 99) {
            if (func(i) != 0) {
                sum++;
                arr[sum] = func(i);
            }
            i++;
        }

        System.out.println(arr.length);
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
