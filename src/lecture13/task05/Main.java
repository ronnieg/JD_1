package lecture13.task05;

public class Main {

    public static void main(String[] args) {
        String string = "Download Java for your desktop computer now! ... " +
                "Java technology allows you to work and play in a secure computing environment. ... " +
                "Java software for your computer, or the Java Runtime Environment, " +
                "is also referred to as the Java Runtime, Runtime Environment, Runtime, JRE";
        String[] array = string.split("[\\p{Punct}\\s]+");
        System.out.println(array.length);
    }
}
