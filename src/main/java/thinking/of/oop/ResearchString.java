package thinking.of.oop;

public class ResearchString {

  public static void main(String[] args) {
    // JVM 為了節省記憶體空間, 因此將有相同值的兩個字符串變量賦予相同的reference
    String s1 = "Welcome to java";
    String s2 = "Welcome to java";

    // 使用new創建的字符串, 和上方賦予值的方式不同, 和上方儲存的是不同的記憶體空間
    String s3 = new String("Welcome to java");


    // 因為他們都是屬於String類別, 因此比較的是兩個變數的引用, 而不是實際值
    System.out.println("s1 == s2 is " + (s1 == s2));
    System.out.println("s1 == s3 is " + (s1 == s3));

  }

}
