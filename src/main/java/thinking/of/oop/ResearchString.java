package thinking.of.oop;

public class ResearchString {

  public static void main(String[] args) {
    // JVM ���F�`�ٰO����Ŷ�, �]���N���ۦP�Ȫ���Ӧr�Ŧ��ܶq�ᤩ�ۦP��reference
    String s1 = "Welcome to java";
    String s2 = "Welcome to java";

    // �ϥ�new�Ыت��r�Ŧ�, �M�W��ᤩ�Ȫ��覡���P, �M�W���x�s���O���P���O����Ŷ�
    String s3 = new String("Welcome to java");


    // �]���L�̳��O�ݩ�String���O, �]��������O����ܼƪ��ޥ�, �Ӥ��O��ڭ�
    System.out.println("s1 == s2 is " + (s1 == s2));
    System.out.println("s1 == s3 is " + (s1 == s3));

  }

}
