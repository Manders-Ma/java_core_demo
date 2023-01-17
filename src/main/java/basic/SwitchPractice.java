package basic;

import java.util.Scanner;

public class SwitchPractice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Set initial value from keyboard.
    Scanner scan = new Scanner(System.in);
    System.out.println("input a number: ");
    int a = scan.nextInt();
    System.out.println("input a number: ");
    int b = scan.nextInt();
    System.out.println("input a operater: ");
    String operater = scan.next();

    int output = 0;
    switch (operater) {
      case "+":
        output = a + b;
        break;
      case "-":
        output = a - b;
        break;
      case "*":
        output = a * b;
        break;
      case "/":
        output = a / b;
        break;

      default:
        System.out.println("false operater");
    }

    System.out.println("The output is " + output);
  }

}
