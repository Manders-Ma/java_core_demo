package array;

import java.util.Scanner;

public class OneDArrayBasicDemo {

  public static void main(String[] args) {
    
    // Declaring, creating, initializing in one step.
    // Warning : Don't split delclaring step and initialing step.
    
    // Warning example : 
    // double[] myList;
    // myList = {1.9, 2.9, 3.4, 3.9};
    double[] myList = {1.9, 2.9, 3.4, 3.9};
    double[] myList2 = createArray(5);
    for (int i = 0; i<myList2.length; i++) {
      System.out.println(myList2[i]);
    }
    
    // Another method to print all elements.
    for (double e: myList2) {
      System.out.println(e);
    }
    
    
    
    
    
    // char array can directly print all element.
    char[] city = {'D', 'A', 'C'};
    System.out.println(city);
    

  }


  public static double[] createArray(int length) {
    double[] myList = new double[length];

    System.out.printf("input %d numbers:", length);
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < myList.length; i++) {
      myList[i] = scan.nextDouble();
    }
    return myList;
  }
}
