package Inheritance;

public class PolymorphismDemo {

  public static void main(String[] args) {
    // Polymorphism  多態, 我們可以說圓形是一個幾何圖形 (定義上來說,意即子類是父類的一種, 但我們不會說父類是子類的一種)
    // 因此當方法的參數定義為父類, 我們可以傳入子類, 反過來則不行.
    displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
  }

  public static void displayObject(SimpleGeometricObject object) {
    System.out.println("Created on" + object.getDateCreated() + ". Color is " + object.getColor());
  }

}
