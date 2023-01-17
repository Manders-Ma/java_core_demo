package exceptionhandling;

public class TestCircle {

  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-10);
      CircleWithException c3 = new CircleWithException(0);
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    
    System.out.println("Number of objects created : " + CircleWithException.getNumberOfObjects());
  }

}
