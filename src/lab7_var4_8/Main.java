package lab7_var4_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите слово для подсчета:");
        String wordToCount = scanner.next();

        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }

        System.out.println("Слово \"" + wordToCount + "\" встречается " + count + " раз(а) в тексте.");
    }
}
