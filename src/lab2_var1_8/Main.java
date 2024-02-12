package lab2_var1_8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(5) + 2;

        // INPUT RESULT
        System.out.printf("Input %d words\n", n);
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        // INPUT RESULT
        System.out.printf("Your entered words: %s\n", Arrays.toString(words));

        // TASK
        System.out.print("Result: " + findDigitPalindromeWord(words));

        // INFO
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        Date date = new Date();
        out.printf("\nStudent: %s\nAssignment datetime: %s\nCompletion datetime: %s",
                   "Luchkin", "2024.02.09 14:29", dateFormat.format(date));
    }

    private static String findDigitPalindromeWord(String[] words) {
        String result = "";
        int flag = 0;
        int i = 0;
        while (flag == 0 && i < words.length) {
            if (isDigitPalindrome(words[i])) {
                if (!result.isEmpty()) flag = 1;
                result = words[i];
            }
            i++;
        }
        if (!result.isEmpty()) {
            return result;
        } else {
            return "No Digit Palindrome Word";
        }
    }

    public static boolean isDigitPalindrome(String word) {
        if (!word.matches("\\d+")) {
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

