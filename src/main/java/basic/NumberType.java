package basic;

import java.util.Scanner;

public class NumberType {
  public static void main(String[] args) {

    byte a;
    a = 3;
    short b;
    b = 3;
    int c = 128;
    long l = java.lang.Long.MAX_VALUE;
    // show overflow problem.
    // byte and short can be automatic type conversion.
    // int have to do long(int).
    System.out.println("Maximum value of long = " + l);
    System.out.println("Maximum value of long + 1 = " + (l+1));
    
    // 長整數尾巴要加L
    l = 32967359818L;



    float f = 1.0f;
    System.out.println(f);
    double d = 1.0d;
    System.out.println(d);


    // It's different. 下面強迫轉成float type
    System.out.println(5 / 2);
    System.out.println(5.0 / 2);

    // Scan from keyboard
    Scanner input = new Scanner(System.in);

    System.out.println("U need type a integer: ");
    int val = input.nextInt();
    System.out.println("You type:" + val);



  }
}
