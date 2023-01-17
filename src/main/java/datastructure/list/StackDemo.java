package datastructure.list;

import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    // push
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    System.out.println(stack);

    // pop
    System.out.println("pop element : " + stack.pop());
    System.out.println("After pop : " + stack);

    // top
    System.out.println("The top element in stack : " + stack.peek());
    
    // state
    System.out.println(stack.isEmpty());
  }

}
