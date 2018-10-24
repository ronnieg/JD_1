package lecture02.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = "";
        String word2 = "";
        System.out.println("enter word number 1");
        if (sc.hasNextLine()) {
            word1 = sc.nextLine();
            System.out.println("Please enter word number 2");
            word2 = sc.nextLine();
            System.out.println("word 1 = " + word1 + "\nword 2 = " + word2);
        } else {
            System.out.println("Please try again later....");
        }
        if (word1.equals(word2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (word1.length() == word2.length()) {
            System.out.println("Ну, хотябы они одной длины");
        } else {
            System.out.println("Слова разные");
        }
    }
}
