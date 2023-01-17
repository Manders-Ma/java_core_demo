package datastructure.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<Integer> integerLinkedList = new LinkedList<>();
    // Insert
    integerLinkedList.add(5);
    integerLinkedList.add(4);
    integerLinkedList.add(3);
    integerLinkedList.add(2);
    integerLinkedList.add(1);
    System.out.println(integerLinkedList);

    integerLinkedList.add(2, 9);
    System.out.println(integerLinkedList);

    // Remove
    integerLinkedList.remove(2);
    System.out.println(integerLinkedList);
  }

}
