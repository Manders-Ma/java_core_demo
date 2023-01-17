package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lambdaDemoComparator {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.forEach((e) -> System.out.print(e + " "));
    System.out.println();

    Collections.sort(list, (e1, e2) -> (e2.compareTo(e1)));
    list.forEach((e) -> System.out.print(e + " "));
  }

}
