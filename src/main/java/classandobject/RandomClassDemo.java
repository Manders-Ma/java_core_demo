package classandobject;


import java.util.Random;

public class RandomClassDemo {

  public static void main(String[] args) {
    Random random1 = new Random(3);
    System.out.print("From random1 : ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random1.nextInt(1000) + " ");
    }
    System.out.println();


    Random random2 = new Random(6);
    System.out.print("From random2 : ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random2.nextBoolean() + " ");
    }
    System.out.println();
  }

}
