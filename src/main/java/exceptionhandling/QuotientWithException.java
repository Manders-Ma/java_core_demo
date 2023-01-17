package exceptionhandling;

import java.util.Scanner;

/*
 * Error / RuntimeException及其子類 屬於unchecked error.
 * 
 * other error is belong to checked error.因此要用try-catch包裝或是定義class的時候聲明異常.
 * 異常的聲明可以有多個
 */
public class QuotientWithException {
  public static int quotient(int num1, int num2) {
    if (num2 == 0) {
      throw new ArithmeticException("Divisor can't be zero");
    }
    return num1 / num2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two integers : ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    try {
      int result = quotient(num1, num2);
      System.out.println(num1 + "/" + num2 + " is " + result);
    } catch (ArithmeticException ex) {
      // ex.printStackTrace();
      System.out.println(ex);
    }

    System.out.println("Execution continues....");
  }
}
