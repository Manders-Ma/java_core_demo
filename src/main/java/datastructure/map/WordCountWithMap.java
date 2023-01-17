package datastructure.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WordCountWithMap {

  public static void main(String[] args) {
    String text = "I love java programming because java programming is  intersting!";
    String[] words = text.split(" ");

    TreeMap<String, Integer> map = new TreeMap<>();

    for (int i = 0; i < words.length; i++) {
      String key = words[i].toLowerCase();

      if (key.length() > 0) {
        if (!map.containsKey(key))
          map.put(key, 1);
        else {
          int value = map.get(key);
          value++;
          map.put(key, value);
        }
      }
    }
    System.out.println(map);

    System.out.println("++++++++++++++++++++++++++++++++++++++++");
    TreeMap<String, Integer> sortedMap = new TreeMap<>(new ValueSorter(map));
    sortedMap.putAll(map);
    System.out.println(sortedMap);

  }
}


class ValueSorter implements Comparator<String> {

  Map<String, Integer> map;

  public ValueSorter(Map<String, Integer> map) {
    this.map = map;
  }

  @Override
  public int compare(String s1, String s2) {
    Integer v1 = map.get(s1);
    Integer v2 = map.get(s2);
    
    int compare = v2.compareTo(v1);
    if (compare == 0) return 1;
    else return compare;
  }
}


