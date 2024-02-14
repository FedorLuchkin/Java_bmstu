package lab2_var1_7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int n = random.nextInt(5) + 2;

        // INPUT RESULT
        out.printf("Input %d words\n", n);
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        // INPUT RESULT
        out.printf("Your entered words: %s\n", Arrays.toString(words));

        // TASK
        out.print("Result: " + findUniqueSymbolsWord(words));

        // INFO
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        Date date = new Date();
        out.printf("\nStudent: %s\nAssignment datetime: %s\nCompletion datetime: %s",
                   "Luchkin", "2024.02.09 14:29", dateFormat.format(date));
    }

    private static String findUniqueSymbolsWord(String[] words) {
        for (String word : words) {
            if (hasOnlyUniqueCharacters(word)) {
                return word;
            }
        }
        return "No word with unique Symbols";
    }

    public static boolean hasOnlyUniqueCharacters(String word) {
        boolean[] characters = new boolean[128];
        for (char c : word.toCharArray()) {
            if (characters[c]) {
                return false;
            }
            characters[c] = true;
        }
        return true;
    }
}
