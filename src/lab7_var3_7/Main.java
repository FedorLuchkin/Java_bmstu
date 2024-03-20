package lab7_var3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i += 3) {
            encryptedText.append(text.charAt(i));
        }
        for (int i = 1; i < text.length(); i += 3) {
            encryptedText.append(text.charAt(i));
        }
        for (int i = 2; i < text.length(); i += 3) {
            encryptedText.append(text.charAt(i));
        }

        System.out.println("Зашифрованный текст:");
        System.out.println(encryptedText.toString());
    }
}