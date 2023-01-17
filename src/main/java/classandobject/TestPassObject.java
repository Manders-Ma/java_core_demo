package classandobject;

public class TestPassObject {

  public static void main(String[] args) {
    // Declare circleArray and create circleArray.
    CircleWithPrivateDataFields[] circleArray;
    circleArray = createCircleArray();

    // Print circleArray's info.
    printCircleArray(circleArray);
  }

  /*
   * 先為circlrArray配置記憶體空間, 並儲存該數組的位址 因為我們還沒有為數組的每個元素去創建實例(只有配置空間, 尚未進行配值的動作) 因此透過for
   * loop為每個元素創建實例並儲存該實例的記憶體位址
   */
  public static CircleWithPrivateDataFields[] createCircleArray() {
    CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
    }
    return circleArray;
  }

  public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
    System.out.printf("%-30s%-15s\n", "Radius", "Area");
    for (int i = 0; i < circleArray.length; i++) {
      System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
    }
    System.out.println("----------------------------------------");

    System.out.printf("%-30s%-15f\n", "The total areas of circles is", sum(circleArray));
  }

  public static double sum(CircleWithPrivateDataFields[] circleArray) {
    double sum = 0;
    for (int i = 0; i < circleArray.length; i++) {
      sum += circleArray[i].getArea();
    }

    return sum;
  }



}
