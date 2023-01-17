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
 * Immutable class and object ���i�ܰʪ����M���� �T�ӱ��� : 1. �Ҧ��ƾڰ쳣�O�p���� 2. �S���@�Ӥ�k(���)�O�i�H��ʼƾڰ� 3.
 * �S���@�ӥi�H�^�Ǽƾڰ쪺�i�ܰʸ�ƪ����
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

  // �]��Date�������ܼ�, �۷��Date�����@�Ӫ���, �i�H�z�L���󪺤�k�h��ʥL����, �ҥH�O�i�H�ܰʪ��ƾ� --> �������ĤT�I
  // public Date getDateCreated() {
  // return dateCreated;
  // }

}
