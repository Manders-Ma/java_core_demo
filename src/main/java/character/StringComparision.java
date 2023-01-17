package character;

public class StringComparision {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "java";
    String s3 = "java";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));

    // �p�G����B��l���䪺�ܼƬO�ޥ�����, ���������O�o��Ӥޥ������ҫ��V����H����}
    // System.out.println(s1==s2);

    // �v�Ӧr�Ť��, �èϥ�unicode���t�Ӫ�Fr���j�p, ex: J-74, j-106
    int r = s1.compareTo(s2);
    System.out.println("r= " + r);
    int t = s2.compareTo(s3);
    System.out.println("t= " + t);


    System.out.println(s1.startsWith("ja"));
    System.out.println(s1.endsWith("va"));
    System.out.println(s1.startsWith("va", 2));


    System.out.println("s1 �O�_�]�tava? " + s1.contains("ava"));
    
  }

}
