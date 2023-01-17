package classandobject;

import java.sql.Date;

public class TestStudentDemo {
  public static void main(String[] args) {
    StudentDemo studentDemo = new StudentDemo(10, "Manders");
    System.out.println(studentDemo.getId());
    /*
     * Date dateCreated = studentDemo.getDateCreated(); dateCreated.setTime(2000);
     */
  }
}

/*
 * Immutable class and object 不可變動的類和物件 三個條件 : 1. 所有數據域都是私有的 2. 沒有一個方法(函數)是可以更動數據域 3.
 * 沒有一個可以回傳數據域的可變動資料的函數
 */


class StudentDemo {
  private int id;
  private String name;
  private Date dateCreated;

  public StudentDemo(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  // 因為Date類型的變數, 相當於Date類的一個物件, 可以透過物件的方法去改動他的值, 所以是可以變動的數據 --> 不滿足第三點
  // public Date getDateCreated() {
  // return dateCreated;
  // }

}
