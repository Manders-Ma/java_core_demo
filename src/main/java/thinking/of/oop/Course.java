package thinking.of.oop;

public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents = 0;

  Course(String courseName) {
    this.courseName = courseName;
  }

  String getCourseName() {
    return courseName;
  }

  String[] getStudents() {
    return students;
  }

  int getNumberOfStudents() {
    return numberOfStudents;
  }


  boolean addStudent(String student) {
    if (numberOfStudents < 100) {
      students[numberOfStudents] = student;
      numberOfStudents++;
      return true;
    }
    return false;
  }

  void dropStudent(String student) {
    // left as an exercise in Exercise 10.9
  }

}
