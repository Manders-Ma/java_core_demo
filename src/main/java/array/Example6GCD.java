package array;

import javax.print.attribute.IntegerSyntax;

public class Example6GCD {
  public static void main(String[] args) {
    int gcdNumber;
    gcdNumber = gcd(2, 4, 6, 10);
    System.out.println("gcd is " + gcdNumber);
  }

  public static int gcd(int... numbers) {
    // Solve special case.
    if (numbers.length == 0) {
      System.out.println("No argument passed");
      return -1;
    }

    // Find gcd's maximum.
    int maxValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue)
        maxValue = numbers[i];
    }
    // We start find gcd from maximum value to 1.
    // If all the value in numbers satisfy element % gcd==0.
    for (int gcd = maxValue; gcd >= 1; gcd--) {
      int count = numbers.length;
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % gcd != 0)
          break;
        count--;
      }

      if (count == 0)
        return gcd;
    }


    return 0;
  }
}
