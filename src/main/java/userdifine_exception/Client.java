package userdifine_exception;

public class Client {

  public static void main(String[] args) {
    CheckAccount checkAccount = new CheckAccount(100.0);
    try {
      checkAccount.withdraw(150.0);
    } catch (InsufficientFoundsException e) {
      System.out.println("Sorry, you lack " + e.getAmount());
      e.printStackTrace();
    }
    
    System.out.println("continue..."); 
  }

}
