package thinking.of.oop;

public class IntegerDemo {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println(new Integer(10).compareTo(3));
    System.out.println(new Integer(10).compareTo(10));
    System.out.println(new Integer(10).compareTo(11));

    Integer o1 = Integer.valueOf("12");
    // �sĶ����o1�i��۰ʩ�c�ʧ@, �N�]�������ন�򥻼ƾ�����
    System.out.println(o1 == 12);

    System.out.println(Integer.parseInt("11", 2));
    System.out.println(Integer.parseInt("11", 8));
  }

}
