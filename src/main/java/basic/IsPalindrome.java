package basic;

import java.util.Scanner;

public class IsPalindrome {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a three-digit integer: ");
    int number = scan.nextInt();

    int digit1 = number / 100;
    int digit3 = number % 100 % 10;

    if (digit1 == digit3) {
      System.out.println(number + " is a palindrome");
    } else {
      System.out.println(number + " is not a palindrome");
    }
  }

}
