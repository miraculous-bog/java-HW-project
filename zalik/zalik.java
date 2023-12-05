package zalik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class zalik {
    public static void main(String[] args) {
        String inputFilePath = "./zalik/input.txt";
        String outputFilePath = "./zalik/output.txt";

        try {
            List<String> lines = readLinesFromFile(inputFilePath);

            writeLinesToFile(outputFilePath, reverseLines(lines));

            System.out.println("Операція завершена успішно.");
        } catch (IOException e) {
            System.err.println("Помилка в операції з файлами: " + e.getMessage());
        }
    }

    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static List<String> reverseLines(List<String> lines) {
        List<String> reversedLines = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            List<String> reversedWords = new ArrayList<>(Arrays.asList(words));
            Collections.reverse(reversedWords);
            String reversedLine = String.join(" ", reversedWords);
            reversedLines.add(reversedLine);
        }
        return reversedLines;
    }

    private static void writeLinesToFile(String filePath, List<String> lines) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : lines) {
                writer.write(line + System.lineSeparator());
            }
        }
    }
}