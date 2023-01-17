package math;

public class BasicDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // triangular function
    System.out.println(Math.sin(0));
    System.out.println(Math.cos(0));
    System.out.println(Math.sin(Math.PI/2));
    
    // exponential function
    System.out.println(Math.exp(1));
    System.out.println(Math.log(Math.E));
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.sqrt(4));
    
    // get integer
    System.out.println(Math.ceil(2.1));
    System.out.println(Math.floor(2.1));
    System.out.println(Math.rint(2.5));
    System.out.println(Math.rint(2.6));
    System.out.println(Math.round(2.1));
    
    // other
    System.out.println(Math.max(10, 100));
    System.out.println(Math.min(10, 100));
    System.out.println(Math.abs(-10));
    System.out.println(Math.random());
    System.out.println(Math.toDegrees(Math.PI/3));
    
  }

}
