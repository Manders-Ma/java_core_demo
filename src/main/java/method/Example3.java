package method;

import java.util.Scanner;

public class Example3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Initial number is ");
    int num = scan.nextInt(); scan.close();
    System.out.println("what is number with reversed? " + reverse(num));
    

    System.out.println("Is the number palindrome? " + isPalindrome(num));
  }

  public static int reverse(int number) {
    int output = 0;
    while (number != 0) {
      output = output * 10 + number % 10;
      number = number / 10;
    }

    return output;
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

}
