package datastructure.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(3);
    set.add(1);
    set.add(10);

    
    TreeSet<Integer> s1 = (TreeSet<Integer>) set.descendingSet();
    System.out.println(set);
    System.out.println(s1);
  }

}