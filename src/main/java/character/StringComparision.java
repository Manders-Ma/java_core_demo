package character;

public class StringComparision {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "java";
    String s3 = "java";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));

    // 如果比較運算子兩邊的變數是引用類型, 那麼比較的是這兩個引用類型所指向的對象的位址
    // System.out.println(s1==s2);

    // 逐個字符比較, 並使用unicode的差來表達r的大小, ex: J-74, j-106
    int r = s1.compareTo(s2);
    System.out.println("r= " + r);
    int t = s2.compareTo(s3);
    System.out.println("t= " + t);


    System.out.println(s1.startsWith("ja"));
    System.out.println(s1.endsWith("va"));
    System.out.println(s1.startsWith("va", 2));


    System.out.println("s1 是否包含ava? " + s1.contains("ava"));
    
  }

}
