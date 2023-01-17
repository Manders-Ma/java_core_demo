package exceptionhandling;

public class FinallyDemo {

  public static void main(String[] args) {
    
    // The finally block is always executed.
    try {
      System.out.println(1/0);
    } catch (RuntimeException e) {
      int a = 1/0;
      System.out.println(e);
    }finally {
      System.out.println("Finally block executed!");
    }

  }

}
