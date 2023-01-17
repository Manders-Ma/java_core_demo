package array;

public class LinearSearch {

  public static void main(String[] args) {
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int value = 10;
    int key = linearSearch(array, value);
    System.out.println(value + "'s index in array? " + key);
  }
  
  public static int linearSearch(int[] array, int key) {
    for (int i=0; i<array.length; i++) {
      if (key==array[i]) {
        return i;
      }
    }
    return -1;
  }

}
