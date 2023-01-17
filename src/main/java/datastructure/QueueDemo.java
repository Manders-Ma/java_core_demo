package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1);
    queue.offer(2);
    queue.add(3); // 當queue滿了之後再使用add, 會拋出異常, 而offer方法則不會(poll remove/peek element 和這個觀念等價)
    System.out.println(queue);


    System.out.println("Poll a element : " + queue.poll());
    System.out.println("After poll a element : " + queue);

    System.out.println("peek : " + queue.peek());

  }

}
