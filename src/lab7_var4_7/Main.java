package lab7_var4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        System.out.println("Количество слов, начинающихся с прописной буквы: " + count);
    }
}
