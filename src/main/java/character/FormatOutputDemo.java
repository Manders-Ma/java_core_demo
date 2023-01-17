package character;

public class FormatOutputDemo {

  public static void main(String[] args) {
    double amount = 12618.98;
    double interestRate = 0.0013;
    double interest = amount * interestRate;

    // Set number's output format with printf instruction.
    System.out.println("Interest is $" + (int) (interest * 100) / 100.0);
    System.out.printf("Interest is $%4.2f\n", interest);

    // Example 1
    int count = 5;
    amount = 45.56;
    System.out.printf("count is %d and amount is %f\n", count, amount); // %f default 6 bit precision.
    
    // Example 2
    System.out.printf("%6d%2s%4.2f\n", 1234, "Java", 51.6653);
    
    // Example 3
    System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63); // ¥k¹ï»ô
    System.out.printf("%-8d%-8s%-8.1f", 1234, "Java", 5.63); // ¥ª¹ï»ô
  }

}
