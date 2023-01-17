package array;

import java.util.Scanner;
import java.util.Arrays;

public class Example8 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String s = scan.nextLine();
    String sortString = sort(s);
    System.out.println(sortString);
  }

  public static String sort(String s) {
    s = s.trim();
    char[] sort = new char[s.length()];
    for (int i = 0; i < sort.length; i++) {
      sort[i] = s.charAt(i);
    }
    Arrays.sort(sort);
    s = Arrays.toString(sort);
    return s;
  }

}
