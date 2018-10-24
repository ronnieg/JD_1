package lecture12.task05;

public class Main {
    public static void myMethod() throws MyException {
        String s = null;
        System.out.println(s.toLowerCase());
    }

    public static void testMethod() throws MyException {
        try {
            myMethod();
        } catch (NullPointerException e) {
            throw new MyException("Обшибка по причине " + e.fillInStackTrace());
        }
    }

    public static void main(String[] args) throws MyException {
        testMethod();
    }
}
