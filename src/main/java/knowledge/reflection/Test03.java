package knowledge.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test03 {
  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, SecurityException {
    Class c1 = Class.forName("knowledge.reflection.User");

    System.out.println(c1.getName());
    System.err.println(c1.getSimpleName());


    System.out.println("======================");
    Field[] fields = c1.getDeclaredFields(); // c1.getDeclaredFields能夠獲取所有屬性(包含private屬性    )
    for (Field field : fields) {
      System.out.println(field);
    }

    System.out.println("======獲取指定的屬性=========");
    Field name = c1.getDeclaredField("name");
    System.out.println(name);

    
    
    System.out.println("======獲取類中的方法=========");
    Method[] methods = c1.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
  }
}
