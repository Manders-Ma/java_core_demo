package array;

public class SelectionSort {

  public static void main(String[] args) {
    
    double[] list = {6,5,4,3,2,1};
    selectionSort(list);
    
    for (double e : list) {
      System.out.print(e + " ");
    }
  }

  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length; i++) {
      int currentMinIndex = i;
      double currentMin = list[i];

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }

}
