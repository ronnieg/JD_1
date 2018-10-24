package lecture12.task04;

public class Main {

    public static void myMethod() throws MyException {
        String s = null;
        System.out.println(s.toLowerCase());
    }

    public static void testMethod() throws MyException {
        try {
            myMethod();
        } catch (NullPointerException e) {
            throw new MyException("Обшибка задание 4");
        }
    }

    public static void main(String[] args) throws MyException {
        testMethod();
    }

}
