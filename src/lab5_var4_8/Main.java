package lab5_var4_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lab5_var4_8/input.txt");
            File outputDir = new File("output");
            outputDir.mkdir();
            File outputFile = new File(outputDir, "output2.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            boolean inComment = false;
            while ((line = reader.readLine()) != null) {
                if (!inComment) {
                    int index = line.indexOf("//");
                    if (index != -1) {
                        line = line.substring(0, index);
                    }

                    index = line.indexOf("/*");
                    if (index != -1) {
                        inComment = true;
                        line = line.substring(0, index);
                    }
                } else {
                    int index = line.indexOf("*/");
                    if (index != -1) {
                        inComment = false;
                        line = line.substring(index + 2);
                    } else {
                        continue;
                    }
                }

                if (!line.trim().isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Output written to: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
