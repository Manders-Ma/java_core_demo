package latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSyncUsingLock {
  
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
      account.deposit(1);
    }
  }
  
  private static class Account {
    // create a lock
    // ReentrantLock()
    // @Param fair - When the fair is true, the longest-waiting thread will get the lock. 
    private static Lock lock = new ReentrantLock();
    private int balance = 0;
    
    
    public int getBalance() {
      return balance;
    }
    
    public void deposit(int amount) {
      lock.lock(); // Acquire the lock
      int newBalance = balance + amount;
      
      
      // this delay is deliberately added to magnify the data-corruption problem and make it eazy to see.
      try {
        Thread.sleep(5);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        lock.unlock();
      }
      
      balance = newBalance;
    }
  }
  
}
