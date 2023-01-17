package array;

import java.util.Arrays;

public class ArrayClassDemo {

  public static void main(String[] args) {
    double[] numbers = {6.0, 4.4, 5.6, 8.9, 9.6};
    java.util.Arrays.sort(numbers);
    
    for (double e : numbers) {
      System.out.print(e + " ");
    }
    System.out.println();
    
    
    char[] chars = {'a', 'A', '4', 'D', 'P'};
    Arrays.sort(chars);
    for (char e : chars) {
      System.out.print(e + " ");
    }
    System.out.println();
    
    
    int[] list1 = {12, 31, 5, 8, 37, 16};
    int[] list2 = {12, 31, 5, 8, 37, 16};
    int index = Arrays.binarySearch(list1, -1);
    System.out.println("index = " + index);
    boolean flag = Arrays.equals(list1, list2);
    System.out.println("flag = " + flag);
    
    
    Arrays.fill(list1, 1, 4, 10);
    for (double e : list1) {
      System.out.print(e + " ");
    }
    System.out.println();
    
    System.out.println(Arrays.toString(list1));

  }

}