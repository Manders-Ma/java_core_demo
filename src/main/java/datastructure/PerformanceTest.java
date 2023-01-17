package datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceTest {
  static final int N = 50000;


  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      arrayList.add(i);
    }
    Collections.shuffle(arrayList);

    System.out.println("************************Hashset************************");
    Set<Integer> hashSet = new HashSet<>(arrayList);
    System.out.println("Member test time for hashset is " + getTestTime(hashSet) + " milliseconds");
    System.out.println("Remove test time for hashset is " + getRemoveTime(hashSet) + " milliseconds");

    
    System.out.println("************************Linked Hashset************************");
    Set<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
    System.out.println("Member test time for linkedHashSet is " + getTestTime(linkedHashSet) + " milliseconds");
    System.out.println("Remove test time for linkedHashSet is " + getRemoveTime(linkedHashSet) + " milliseconds");
    
    
    System.out.println("************************TreeSet************************");
    Set<Integer> treeSet = new TreeSet<>(arrayList);
    System.out.println("Member test time for treeSet is " + getTestTime(treeSet) + " milliseconds");
    System.out.println("Remove test time for treeSet is " + getRemoveTime(treeSet) + " milliseconds");
    
    
    System.out.println("************************ArrayList************************");
    List<Integer> list = new ArrayList<>(arrayList);
    System.out.println("Member test time for ArrayList is " + getTestTime(list) + " milliseconds");
    System.out.println("Remove test time for ArrayList is " + getRemoveTime(list) + " milliseconds");
    
    System.out.println("************************linkedList************************");
    List<Integer> linkedList = new LinkedList<>(arrayList);
    System.out.println("Member test time for linkedList is " + getTestTime(linkedList) + " milliseconds");
    System.out.println("Remove test time for linkedList is " + getRemoveTime(linkedList) + " milliseconds");


  }


  public static long getTestTime(Collection<Integer> c) {
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < N; i++) {
      c.contains((int) Math.random() * 2 * N);
    }
    return System.currentTimeMillis() - startTime;
  }

  public static long getRemoveTime(Collection<Integer> c) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < N; i++) {
      c.remove(i);
    }
    return System.currentTimeMillis() - startTime;
  }
}
