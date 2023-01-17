package thinking.of.oop;

public class IntegerDemo {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println(new Integer(10).compareTo(3));
    System.out.println(new Integer(10).compareTo(10));
    System.out.println(new Integer(10).compareTo(11));

    Integer o1 = Integer.valueOf("12");
    // 編譯器對o1進行自動拆箱動作, 將包裝類型轉成基本數據類型
    System.out.println(o1 == 12);

    System.out.println(Integer.parseInt("11", 2));
    System.out.println(Integer.parseInt("11", 8));
  }

}
