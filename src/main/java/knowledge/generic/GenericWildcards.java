package knowledge.generic;

public class GenericWildcards {

  public static void main(String[] args) {
    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    System.out.println(intStack);
    System.out.println("Max value is " + max(intStack) + " in intStack.");

    System.out.println("================================================");

    GenericStack<String> stack1 = new GenericStack<>();
    GenericStack<Object> stack2 = new GenericStack<>();
    stack1.push("java");
    stack1.push("python");
    stack2.push(3);

    add(stack1, stack2);
    while (!stack2.isEmpty()) {
      System.out.print(stack2.pop() + " ");
    }



  }

  // ���MInteger�ONumber���l��, ������ӻ� GenericStack<Integer> �ä��O GenericStack<Number>���l�� -->
  // �L�k�����h�A���з�
  // �z�L Wildcards ���w�x�����d��, �ԲӤ��о\Ūppt
  public static double max(GenericStack<? extends Number> stack) {
    double maxValue = stack.pop().doubleValue();

    while (!stack.isEmpty()) {
      double value = stack.pop().doubleValue();
      if (value > maxValue)
        maxValue = value;
    }

    return maxValue;
  }

  public static <E> void add(GenericStack<E> stack1, GenericStack<? super E> stack2) {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }

  }

}
