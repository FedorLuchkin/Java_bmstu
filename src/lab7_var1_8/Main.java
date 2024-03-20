package lab7_var1_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        StringBuilder newText = new StringBuilder();
        boolean lastCharWasLetter = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                newText.append(currentChar);
                lastCharWasLetter = true;
            } else if (currentChar == ' ' && lastCharWasLetter) {
                newText.append(' ');
                lastCharWasLetter = false;
            }
        }

        System.out.println("Текст после обработки:");
        System.out.println(newText.toString());
    }
}
