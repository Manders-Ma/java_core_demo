package array;

public class BinarySearch {

  public static void main(String[] args) {
    int key = 5;
    int[] list = {1, 2, 3, 4, 6};
    int index = binarySearch(list, key);
    System.out.printf("The index of %d is %d in the list.", key, index);

  }

  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key > list[mid]) {
        low = mid + 1;
      } else if (key < list[mid]) {
        high = mid - 1;
      } else {
        return mid;
      }
    }

    return -low - 1;

  }

}
