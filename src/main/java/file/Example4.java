package file;

import java.io.File;
import java.util.Scanner;

public class Example4 {

  public static void main(String[] args) throws Exception {
    File file = new File("SortedStrings.txt");

    try (Scanner scanner = new Scanner(file);) {
      String preString = "";
      String nowString;
      int result;
      while (scanner.hasNext()) {
        nowString = scanner.next();
        result = nowString.compareTo(preString);
        if (result < 0) {
          System.out.println("Not a increasing order!");
          System.exit(1);
        }
        preString = new String(nowString);
      }
    }
    System.out.println("It's a increasing order!");
  }

}
