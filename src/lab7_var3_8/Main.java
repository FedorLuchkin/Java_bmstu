package lab7_var3_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите зашифрованный текст для расшифровки:");
        String encryptedText = scanner.nextLine();

        int textLength = encryptedText.length();
        int groupSize = textLength / 3;
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < groupSize; i++) {
            decryptedText.append(encryptedText.charAt(i));
            decryptedText.append(encryptedText.charAt(i + groupSize));
            decryptedText.append(encryptedText.charAt(i + 2 * groupSize));
        }

        System.out.println("Расшифрованный текст:");
        System.out.println(decryptedText.toString());
    }
}
