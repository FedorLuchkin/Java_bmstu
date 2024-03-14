package lab5_var3_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/lab5_var3_8/input.txt"));
            String line;
            Map<Character, Integer> charFrequency = new HashMap<>();
            Map<String, Integer> wordFrequency = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" |\\,|\\.|\\:");
                for (String word : words) {
                    // Count word frequency
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

                    // Count character frequency
                    for (char c : word.toCharArray()) {
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }
            }

            System.out.println("Character Frequency:");
            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nWord Frequency:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

