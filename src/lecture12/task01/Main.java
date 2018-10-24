package lecture12.task01;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
