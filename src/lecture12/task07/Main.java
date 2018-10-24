package lecture12.task07;

import java.util.Random;

public class Main {

    public static void halfException() {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Success");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 1) {
            halfException();
        } else {
            System.out.println("pass");
        }
    }
}
