package character;

public class ConvertStringToNumber {

  public static void main(String[] args) {
    String s1 = "123";
    System.out.println(Integer.parseInt(s1));
    System.out.println(Double.parseDouble(s1));
    
    String s2 = 123 + "";
    System.out.println(s2);

  }

}
