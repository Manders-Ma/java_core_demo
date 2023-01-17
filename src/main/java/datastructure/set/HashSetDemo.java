package datastructure.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

  public static void main(String[] args) {
    // CRD demo
    HashSet<String> hashSet = new HashSet<>();
    
    // C
    hashSet.add("one");
    hashSet.add("two");
    hashSet.add("three");
    hashSet.add("one");
    System.out.println(hashSet);
    
    // D
    hashSet.remove("one");
    System.out.println(hashSet);
    
    // R
    System.out.println(hashSet.contains("two"));
    
    System.out.println("-----------Operation----------");
    Set<String> hashSet2 = new HashSet<>();
    hashSet2.add("three");
    hashSet2.add("four");
    hashSet2.add("five");
    
    
    // 差集
    hashSet.removeAll(hashSet2);
    System.out.println(hashSet);
    
    
    // 聯集
    hashSet.addAll(hashSet2);
    System.out.println(hashSet);
    
    
    // 交集
    hashSet.retainAll(hashSet2);
    System.out.println(hashSet);
    
  }

}
