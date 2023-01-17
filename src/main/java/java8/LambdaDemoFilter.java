package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemoFilter {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.forEach((e) -> System.out.print(e + " "));
    System.out.println();

    Stream<Integer> filltered_data = list.stream().filter(e -> e % 2 == 0);
    filltered_data.forEach(e -> System.out.print(e + " "));
  }

}
