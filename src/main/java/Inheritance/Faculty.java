package Inheritance;

public class Faculty extends Employee{

  public static void main(String[] args) {
    new Faculty();
  }
  
  public Faculty() {
    System.out.println("4");
  }

}


class Employee extends Person {
  public Employee() {
    this("2");
    System.out.println("3");
  } 
  
  public Employee(String s) {
    System.out.println(s);
  }
}


class Person {
  public Person() {
    System.out.println("1");
  }
}
