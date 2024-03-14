package lab5_var4_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lab5_var4_7/input.txt");
            File outputDir = new File("output");
            outputDir.mkdir();
            File outputFile = new File(outputDir, "output.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.replaceAll("\\s+", " "); // Remove extra spaces and tabs
                writer.write(trimmedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Output written to: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

