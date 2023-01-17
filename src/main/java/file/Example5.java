package file;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example5 {

  public static void main(String[] args) throws Exception{
    File file = new File("score.txt");
    int[] count = new int[26];

    try (Scanner scanner = new Scanner(file);) {
      String s;
      while (scanner.hasNext()) {
        s = scanner.next().toUpperCase();
        for (int i = 0; i<s.length(); i++) {
          char c = s.charAt(i);
          int diff = c - 'A';
          if (diff < 26 && diff>=0) {
            count[diff]++;
          }
        }
      }
      System.out.println(Arrays.toString(count));
    }
  }

}
