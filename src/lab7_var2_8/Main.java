package lab7_var2_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст телеграммы:");
        String telegramText = scanner.nextLine();

        System.out.println("Введите стоимость одного слова:");
        double wordCost = scanner.nextDouble();

        String[] words = telegramText.split("\\s+");
        int wordCount = words.length;
        double totalCost = wordCount * wordCost;

        System.out.println("Квитанция об оплате телеграммы:");
        System.out.println("Текст телеграммы: " + telegramText);
        System.out.println("Количество слов: " + wordCount);
        System.out.println("Стоимость одного слова: " + wordCost);
        System.out.println("Общая стоимость: " + totalCost);
    }
}
