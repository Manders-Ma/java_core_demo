package knowledge.reflection;

public class Test01 {

  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Class<?> c1 = Class.forName("knowledge.reflection.User");
    Class<?> c2 = User.class;
    Class<?> c3 = "test".getClass();
    Class<?> c4 = Integer.TYPE;
    Class<?> c5 = c1.getSuperclass();

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);


    System.out.println("==========================");
    System.out.println(c1.getName());


    User user = (User) c1.newInstance();
    boolean t = user instanceof User;
    System.out.println(t);
  }

}


