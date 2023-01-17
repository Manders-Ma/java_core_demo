package knowledge.generic;

public class GenericStaticMethod {

  public static void main(String[] args) {
    Integer[] integers = {1, 2, 3, 4, 5};
    String[] strings = {"A", "B", "C"};

    GenericStaticMethod.<Integer>print(integers);
    GenericStaticMethod.<String>print(strings);
  }


  // <E>, default:<E extends Object>
  public static <E> void print(E[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

}
