package thinking.of.oop;


import java.util.Scanner;;
public class Example {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("string = ");
    String problem = scanner.nextLine();
    
    System.out.println("The problem is palindrome? " + isPalindrome(problem));
    
  }
  public static boolean isPalindrome(String problem) {
    problem = problem.replaceAll("[^a-zA-Z0-9]", "");
    String rProblem = reverse(problem);
    return problem.equals(rProblem);
    
  }
  
  public static String reverse(String s) {
    StringBuffer sb = new StringBuffer(s);
      sb.reverse();
    return sb.toString();
  }

}
