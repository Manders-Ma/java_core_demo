package java8;



public class LambdaDemoFunctionalInterface {
  public static void main(String[] args) {
    // No parameter
    Sayable s = () -> {
      return "I have nothing to say.";
    };
    System.out.println(s.say());

    // Single parameter
    SayableWithParameter sp = (name) -> {
      return "Hello, " + name + ".";
    };
    System.out.println(sp.say("Manders"));

    // Multiple parameters (with or without return, 如果只有一行則可以省略return, 否則需要return關鍵字)
    Addable ad1 = (a, b) -> (a + b);
    System.out.println(ad1.add(10, 20));
    Addable ad2 = (int a, int b) -> (a + b);
    System.out.println(ad2.add(10, 20));
  }
}


interface Sayable {
  public String say();
}


interface SayableWithParameter {
  public String say(String name);
}


interface Addable {
  int add(int a, int b);
}
