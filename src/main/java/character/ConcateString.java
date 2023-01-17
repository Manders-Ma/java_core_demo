package character;

public class ConcateString {

  public static void main(String[] args) {
    
    String s1 = "Hello ";
    String s2 = "Java!";
    
    String s3;
    s3 = s1 + s2;
    System.out.println(s3);
    
    // follow type priority.
    s3 = s1 + 123;
    System.out.println(s3);
    
    int i = 3; int j = 4;
    System.out.println("i + j is "+i+j); // false output
    System.out.println("i + j is "+(i+j)); // true output
  }

}
