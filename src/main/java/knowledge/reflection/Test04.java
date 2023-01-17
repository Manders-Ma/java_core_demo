package knowledge.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
      IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
      InvocationTargetException {

    // �Ϯg�����䤤�@�ӭ��n����, �ʺA�Ыع�H
    Class c1 = Class.forName("knowledge.reflection.User");
    User user = (User) c1.newInstance();
    System.out.println(user);


    // �ϥΦ��Ѽƪ��c�y���
    Constructor constructor = c1.getConstructor(int.class, String.class, int.class);
    User user2 = (User) constructor.newInstance(1, "Manders", 23);
    System.out.println(user2);
  }
}
