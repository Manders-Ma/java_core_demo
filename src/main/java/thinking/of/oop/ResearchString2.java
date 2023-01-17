package thinking.of.oop;

import java.util.Arrays;

public class ResearchString2 {

  public static void main(String[] args) {
    String s = "Welcome to java";

    // 各種replace方法
    System.out.println(s.replace('e', 'E'));
    System.out.println(s.replaceFirst("e", "E"));
    System.out.println(s.replaceAll("e", "E"));



    String[] result = "Java is great!".split(" ");
    System.out.println(Arrays.toString(result));
  }

}
