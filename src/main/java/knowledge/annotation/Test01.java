package knowledge.annotation;

public class Test01 {

  public static void main(String[] args) {
    testDecrecated();
  }


  // ���ص���, ��F�H�U��k����ĳ�ϥ�, ����n����k�i�H���N.
  @Deprecated
  public static void testDecrecated() {

  }

  // ���ص���, �����@��ĵ�i(ex: �ŧi�ܼƦ��S���ϥ�)
  @SuppressWarnings("unused")
  public static void unusedMethod() {

  }

}
