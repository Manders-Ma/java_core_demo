package Inheritance;

public class PolymorphismDemo2 {

  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new People());
    m(new Object());
    
    Object o = new Student(); // 隱式轉換, 向上轉換
    m(o);
    
    Student b =  (Student) o; // 顯示轉換, 向下轉換
    m(b);
  }

  public static void m(Object x) {
    System.out.println(x.toString());
  }
}


class GraduateStudent extends Student {

}


class Student extends People {
  @Override
  public String toString() {
    return "Student";
  }
}


// Object 是所有類的祖先因此不extend Object也能生效
class People {
  @Override
  public String toString() {
    return "Person";
  }
}

