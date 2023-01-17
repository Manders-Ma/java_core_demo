package basic;

import java.util.Scanner;

public class Example3 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.print("Please type 3 numbers :");
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    int number3 = scan.nextInt();
    
    int temp;
    if (number1>number2 || number1>number3)
    {
      if (number1 > number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
      }
      
      if (number1 > number3) {
        temp = number1;
        number1 = number3;
        number3 = temp;
      }
      
    }
    
    if (number2 > number3) {
      temp = number3;
      number3 = number2;
      number2 = temp;
    }
    
    System.out.println(number1 + " " + number2 + " " + number3);
    
    
  }
}
