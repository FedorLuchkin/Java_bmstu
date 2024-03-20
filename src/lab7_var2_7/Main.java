package lab7_var2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");
        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;

        for (String word : words) {
            int length = word.length();
            if (length < minLength) {
                minLength = length;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println("Слова минимальной длины:");
        for (String word : words) {
            if (word.length() == minLength) {
                System.out.println(word);
            }
        }

        System.out.println("Слова максимальной длины:");
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }
    }
}
