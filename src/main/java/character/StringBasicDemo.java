package character;


public class StringBasicDemo {

  public static void main(String[] args) {
    /*
     * Basic type is int, double, char.
     * 
     * String is not a basic type. String is belong to package java.lang.
     */

    String message = "Welcome to Java!";
    System.out.println(message.length());
    System.out.println("Welcome to Java".length());
    System.out.println("==============================");
    // Basic method about String.
    System.out.println(message.length());
    System.out.println(message.charAt(0) == ' ');
    System.out.println(message.concat("Andrew"));
    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());
    System.out.println("     Welcome ".trim()); // Delete space char like as " ".
 
    
  }

}
