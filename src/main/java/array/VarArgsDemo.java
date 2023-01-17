package array;

public class VarArgsDemo {

  public static void main(String[] args) {
    printMax(1.5, 2.3, 10.0);
    printMax(new double[] {1.5, 2.3, 10.0});
  }

  // �i�ܪ��Ѽ� : �Y��J�h�ӭ�, �sĶ���|�N��J���x�s��array
  public static void printMax(double... numbers) {
    if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
    }

    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (i > result) {
        result = numbers[i];
      }
    }

    System.out.println("The max value is " + result);
  }
}
