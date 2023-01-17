package knowledge.generic;

import java.util.Stack;

public class GenericStackClient {

  public static void main(String[] args) {
    GenericStack<String> stack = new GenericStack<>();

    stack.push("A");
    stack.push("B");
    System.out.println(stack.peek());
  }
}


class GenericStack<E> {
  private Stack<E> list = new Stack<>();

  int getSize() {
    return list.size();
  }

  E peek() {
    return list.get(getSize() - 1);
  }

  void push(E o) {
    list.add(o);
  }

  E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  boolean isEmpty() {
    return list.isEmpty();
  }

}
