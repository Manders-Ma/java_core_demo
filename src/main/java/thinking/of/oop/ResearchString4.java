package thinking.of.oop;

public class ResearchString4 {

  public static void main(String[] args) {
    String a = "Welcome to java";
    char[] charArray = a.toCharArray();

    for (char e : charArray) {
      System.out.print(e + ", ");
    }
    System.out.println();


    // char[] -> String
    // 1.
    String b = new String(charArray);
    System.out.println(b);

    // 2.
    String c = String.valueOf(charArray);
    System.out.println(c);

    // ------------------------------------------------------
    // char or int ---> String
    int num = 10;
    String d = String.valueOf(num);
    System.out.println(d);
    System.out.println("d is a instance of String? " + (b instanceof String));

    String e = num + "";
    System.out.println("e is a instance of String? " + (e instanceof String));

    // Format String
    String f = String.format("%7.2f%6d%-4s", 55.556, 14, "AB");
    System.out.println(f);
  }

}
