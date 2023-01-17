package method;

public class CreateMethod {
  public static void main(String[] args) {
    
    for (int num = 1; num<=100; num++) {
      System.out.print(getPentagonalNumber(num) + "\t");;
      if (num%10 == 0)
        System.out.print("\n");
    }
    
  }

  public static int getPentagonalNumber(int n) {
    return n * (3 * n - 1) / 2;
  }
}
