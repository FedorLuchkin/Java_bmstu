package lab7_var1_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 3; // заданный индекс символа
        char symbol = 'a'; // символ для удаления или вставки

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите признак (0 или 1):");
        int flag = scanner.nextInt();

        if (flag == 0) {
            // Удалить символ везде, где он встречается
            String newText = text.replaceAll(String.valueOf(symbol), "");
            System.out.println("Текст после удаления символа:");
            System.out.println(newText);
        } else if (flag == 1) {
            // Вставить символ после k-го символа
            StringBuilder newText = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                newText.append(text.charAt(i));
                if ((i + 1) == k) {
                    newText.append(symbol);
                }
            }
            System.out.println("Текст после вставки символа:");
            System.out.println(newText.toString());
        } else {
            System.out.println("Некорректный признак. Введите 0 или 1.");
        }
    }
}
