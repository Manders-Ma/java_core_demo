package Inheritance;

public class PolymorphismDemo2 {

  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new People());
    m(new Object());
    
    Object o = new Student(); // �����ഫ, �V�W�ഫ
    m(o);
    
    Student b =  (Student) o; // ����ഫ, �V�U�ഫ
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


// Object �O�Ҧ����������]����extend Object�]��ͮ�
class People {
  @Override
  public String toString() {
    return "Person";
  }
}

