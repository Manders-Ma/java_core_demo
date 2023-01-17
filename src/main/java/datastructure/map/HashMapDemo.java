package datastructure.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

  public static void main(String[] args) {
    HashMap<String, Integer> incomeMap = new HashMap<>();
    incomeMap.put("Manders", 50000);
    incomeMap.put("Hua", 50000);
    System.out.println(incomeMap.get("Manders"));

    System.out.println("++++++++++++++++++++++++++++++++++++");
    for (Map.Entry<String, Integer> entry : incomeMap.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    System.out.println("++++++++++++++++lambda way+++++++++++++++++");
    incomeMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });

    System.out.println("++++++++++++++++Iterator+++++++++++++++++");
    Set set = incomeMap.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    System.out.println("++++++++++++++++Insert/remove++++++++++++++");
    incomeMap.put("Manders", 100000);
    System.out.println(incomeMap);

    incomeMap.remove("Hua");
    System.out.println(incomeMap);


  }

}
