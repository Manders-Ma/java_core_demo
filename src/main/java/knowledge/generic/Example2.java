package knowledge.generic;

public class Example2 {

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Integer key = 3;

    int index = Example2.<Integer>linearSearch(intArray, key);
    System.out.println(index);
  }

  public static <E> int linearSearch(E[] list, E key) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == key) {
        return i;
      }
    }

    return -1;
  }

}
