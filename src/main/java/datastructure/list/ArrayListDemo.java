package datastructure.list;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    // Insert
    arrayList.add("a");
    arrayList.add("b");
    arrayList.add("c");
    arrayList.add(0, "a1");


    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }

    // Delete
    arrayList.remove(0);
    System.out.println(arrayList);

    arrayList.remove("c");
    System.out.println(arrayList);

    // Delete All
    arrayList.clear();
    System.out.println(arrayList);


    showGreaterThan100();
  }

  private static void showGreaterThan100() {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(101);
    integerList.add(50);
    integerList.add(2000);
    integerList.add(1);
    integerList.add(300);
    // for (int i = 0; i < integerList.size(); i++) {
    // if (integerList.get(i) < 100)
    // integerList.remove(i);
    // }

    // JDK1.8 start Lambda
    integerList.stream().filter(item -> item > 100).collect(Collectors.toList());
    System.out.println(integerList);
  }

}
