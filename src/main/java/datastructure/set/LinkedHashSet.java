package datastructure.set;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {

  public static void main(String[] args) {
    // hash set�O�L�Ǫ�, �Y�Ϧ����Ǵ��J�����]�@��
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("one");
    hashSet.add("two");
    hashSet.add("three");
    hashSet.add("four");
    hashSet.add("five");
    hashSet.add("six");
    System.out.println(hashSet);

    System.out.println("+++++++++++++++++++++++");

    java.util.LinkedHashSet<String> linkedSet = new java.util.LinkedHashSet<>();
    linkedSet.add("one");
    linkedSet.add("two");
    linkedSet.add("three");
    linkedSet.add("four");
    linkedSet.add("five");
    linkedSet.add("six");
    System.out.println(linkedSet);
  }

}
