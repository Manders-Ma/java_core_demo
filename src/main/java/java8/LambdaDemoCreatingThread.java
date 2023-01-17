package java8;


public class LambdaDemoCreatingThread {

  public static void main(String[] args) {

    // no lambda expression
    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        System.out.println("Hello world!");
      }
    };
    Thread t1 = new Thread(r1);
    t1.start();

    // lambda expression
    Runnable r2 = () -> System.out.println("Hello world!");
    Thread t2 = new Thread(r2);
    t2.start();
    
  }

}
