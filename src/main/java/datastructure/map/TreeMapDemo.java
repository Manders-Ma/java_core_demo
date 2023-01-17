package datastructure.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

  public static void main(String[] args) {
    // 對key做排序, 從小到大
    TreeMap<Integer, String> treeMap = new TreeMap(new DecreasingSorter());
    treeMap.put(40000, "A");
    treeMap.put(30000, "B");
    treeMap.put(50000, "C");
    treeMap.forEach((k, v) -> {
      System.out.println(k + " " + v);
    });

    System.out.println("++++++++++++++++++++++++++++++");

    Student s1 = new Student();
    s1.setScore(100);
    Student s2 = new Student();
    s2.setScore(90);
    Student s3 = new Student();
    s3.setScore(80);

    TreeMap<Student, String> studentTreeMap = new TreeMap<>(new StudentScoreDecreasingSorter());
    studentTreeMap.put(s1, "A");
    studentTreeMap.put(s2, "B");
    studentTreeMap.put(s3, "C");

    studentTreeMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });


  }

}


class DecreasingSorter implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1;
  }
}


class StudentScoreDecreasingSorter implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    return s2.getScore() - s1.getScore();
  }
}


class Student {
  private int id;
  private String name;
  private int score;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return String.format("Student{id=%d, name=%s, score=%d}", id, name, score);
  }


}


