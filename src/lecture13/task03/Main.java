package lecture13.task03;

public class Main {

    public static boolean stringAndWord(String string, String word) {
        boolean result = false;
        String[] array = string.split("[\\p{Punct}\\s]+");
        if (array[0].toLowerCase().equals(word.toLowerCase()) && array[array.length - 1].toLowerCase().equals(word.toLowerCase())) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "Java ava ava java";
        String word = "java";
        System.out.println(stringAndWord(string, word));
    }
}
