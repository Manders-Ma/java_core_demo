package datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("A");
    collection.add("B");
    collection.add("C");

    Iterator<String> iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toLowerCase());
    }
  }
}