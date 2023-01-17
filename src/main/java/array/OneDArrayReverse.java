package array;

public class OneDArrayReverse {

  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 5};
    int[] reverseList = reverse(list);

    for (int e : reverseList) {
      System.out.print(e + " ");
    }
  }

  public static int[] reverse(int[] list) {
    int[] result = new int[list.length];

    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
    }
    return result;
  }

}
