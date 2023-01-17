package file;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example3 {

  public static void main(String[] args) throws Exception {
    File file = new File("Exercise12_15.txt");
    if (!file.exists()) {
      file.createNewFile();
    } else {
      System.out.println("The file already exists");
    }

    try (PrintWriter output = new PrintWriter(file);) {
      for (int i = 0; i<100; i++) {
        output.print(((int)(Math.random() * 500) + 1));
        output.print(" ");
      }
    }
    
    try (Scanner scanner = new Scanner(file);){
      int[] intArray = new int[100];
      while (scanner.hasNext()) {
        for (int i = 0; i<100; i++) {
          intArray[i] = scanner.nextInt();
        }
      }
      Arrays.sort(intArray);
      for (int e:intArray) {
        System.out.print(e + " ");
      }
    }
  }

}
