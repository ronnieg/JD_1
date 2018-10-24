package lecture12.task06;

import java.util.Random;

public class Main {

    public static void randomException() {
        Random random = new Random();
        int num = random.nextInt(3);

        switch (num) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        try {
            randomException();
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.fillInStackTrace());
        } catch (ArithmeticException e) {
            System.out.println(e.fillInStackTrace());
        }

    }

}
