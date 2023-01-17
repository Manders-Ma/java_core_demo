package array;

import java.util.Arrays;
import javax.xml.transform.Templates;

public class BubbleSort {

  public static void main(String[] args) {

    double[] list = {1.5, 6.3, 5.7, 6.5, 4.9};
    System.out.println(Arrays.toString(list));
    bubbleSort(list);
    System.out.println(Arrays.toString(list));
  }

  public static void bubbleSort(double[] list) {
    boolean swapped;
    double temp;
    for (int i = list.length - 2; i >= 0; i--) {
      swapped = false;
      for (int j = 0; j <= i; j++) {
        if (list[j] > list[j + 1]) {
          swapped = true;
          temp = list[j + 1];
          list[j + 1] = list[j];
          list[j] = temp;
        }
      }
      if (swapped == false)
        return;
    }
  }

}
