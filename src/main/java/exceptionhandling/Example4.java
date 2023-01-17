package exceptionhandling;

import java.util.Random;
import java.util.Scanner;
public class Example4 {

  public static void main(String[] args) {
    int[] array = new int[100];
    Random random = new Random();
    for (int i = 0; i<array.length; i++) {
      array[i] = random.nextInt(100);
    }
    
    System.out.print("Enter a index for array : ");
    Scanner scanner = new Scanner(System.in);
    int index = scanner.nextInt();
    
    try {
      System.out.printf("array[%d] is %d \n", index, array[index]);
    } catch (IndexOutOfBoundsException  e) {
      System.out.println("Out of bound.");
    }
  }
}
