package character;

public class BasicDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // Unicode -- char accept 16bits.
    char letter1 = 'A';
    char letter2 = '\u0041';
    System.out.println(letter1);
    System.out.println(letter2);
    System.out.println(++letter2);
    
    // number-char transform (自動型態轉換)
    char ch1 = 0x0041;
    System.out.println(ch1);
    char ch2 = 65;
    System.out.println(ch2);
    int i = (int) 'A';
    System.out.println("i = "+i);
    int j = '2'+'3';
    System.out.println("j = "+j);
    
    // Use method to extend more than 16bits. 
    char[] c1 = Character.toChars(0x10200);
    System.out.println(c1);
    
    
    // Print  -  He said "Java" is fun.
    System.out.println("He said Java is fun.");
    System.out.println("He said \"Java\" is fun.");
    System.out.println("Line 1\nLine2");
    
    System.out.println("===============================");
    
    // char's compare and test
    boolean state = 'a'<'b';
    System.out.println("a < b is "+state);
    // Character is a class which belongs to java.lang.
    System.out.println(Character.isDigit('8'));
    System.out.println(Character.isUpperCase('8'));
    System.out.println(Character.isLowerCase('8'));
  }

}