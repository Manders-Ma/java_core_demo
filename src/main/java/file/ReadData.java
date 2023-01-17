package file;

import java.io.File;
import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;

public class ReadData {

  public static void main(String[] args) throws Exception {
    File file = new File("test.txt");

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNext()) {
        String name = scanner.next();
        int score = scanner.nextInt();
        System.out.println("name: " + name + " score: " + score);
      }
    }

  }

}
