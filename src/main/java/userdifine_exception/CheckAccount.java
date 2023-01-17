package userdifine_exception;

public class CheckAccount {
  private double amount;
  
  public CheckAccount(double amount) {
    this.amount = amount;
  }
  
  public double withdraw(double number) throws InsufficientFoundsException{
    if (number > amount) {
      throw new InsufficientFoundsException(number - amount);
    }else {
      return amount - number;
    }
  }

}
