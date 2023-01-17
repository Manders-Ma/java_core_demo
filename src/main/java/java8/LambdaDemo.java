package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo {

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(3, 3);

    // for each
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.printf("Key = %d , Value = %d\n", entry.getKey(), entry.getValue());
    }
    System.out.println("------------------------------");

    // Lambda expression
    map.forEach((k, v) -> {
      System.out.printf("Key = %d , Value = %d\n", k, v);
    });
    System.out.println("------------------------------");

    // list demo
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.forEach(k -> System.out.println(k));

    // thread demo
    new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Hello world!");
      }
    });

    new Thread(() -> System.out.println("Hello world!"));
  }

}
