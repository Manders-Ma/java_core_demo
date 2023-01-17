package thinking.of.oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structure");
    Course course2 = new Course("Database System");

    course1.addStudent("Hua");
    course1.addStudent("Manders");
    course1.addStudent("Ken");

    course2.addStudent("Manders");
    course2.addStudent("Hua");

    System.out.println("The number of students in course1 : " + course1.getNumberOfStudents());
    String[] studentsInCourse1 = course1.getStudents();
    System.out.println(Arrays.toString(studentsInCourse1));
  }
}
