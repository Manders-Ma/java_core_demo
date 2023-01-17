package file;

import java.io.File;
import java.util.Scanner;

public class Example2 {

  public static void main(String[] args) throws Exception {
    File file = new File("test.txt");

    try (Scanner scanner = new Scanner(file);) {
      int lineCount = 0, wordCount = 0, charCount = 0;
      while (scanner.hasNext()) {
        lineCount++;
        String lineString = scanner.nextLine();
        String[] words = lineString.split(" ");
        wordCount = wordCount + words.length;
        for (String word : words) {
          charCount = charCount + word.length();
        }
      }
      System.out.printf("The file has\n- %d lines\n- %d words\n- %d chars", lineCount, wordCount,
          charCount);
    }
  }

}
