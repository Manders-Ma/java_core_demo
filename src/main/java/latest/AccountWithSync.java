package latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AccountWithSync {
  
  private static Account account = new Account();

  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();
    
    // create and launch 100 threads
    for (int i = 0; i < 100; i++) {
      executor.execute(new AddAPennyTask());
    }
    
    executor.shutdown();
    
    while (!executor.isTerminated()) {}
    
    System.out.println("what is balance? " + account.getBalance());
  }
  
  private static class AddAPennyTask implements Runnable {
    @Override
    public void run() {
      try {
        account.deposit(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
  private static class Account {
    private int balance = 0;
    
    
    public int getBalance() {
      return balance;
    }
    
    public synchronized void deposit(int amount) throws InterruptedException {
      int newBalance = balance + amount;
      
      
      // this delay is deliberately added to magnify the data-corruption problem and make it eazy to see.
      Thread.sleep(5);
      
      balance = newBalance;
    }
  }
  
}
