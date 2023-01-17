package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1);
    queue.offer(2);
    queue.add(3); // ��queue���F����A�ϥ�add, �|�ߥX���`, ��offer��k�h���|(poll remove/peek element �M�o���[������)
    System.out.println(queue);


    System.out.println("Poll a element : " + queue.poll());
    System.out.println("After poll a element : " + queue);

    System.out.println("peek : " + queue.peek());

  }

}
