package latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

  public static void main(String[] args) {
    // create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(3);
    
//    ExecutorService executor = Executors.newCachedThreadPool();
    
    // submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 100));
    executor.execute(new PrintChar('b', 100));
    executor.execute(new PrintNum(100));
    
    // 1. shutdown()    => shuts down the executor, but allows the task in executor to finish.
    // 2. shutdownNow() => shuts down the executor immediately even though there are unfinished thread in the pool.
    executor.shutdown();
    
    System.out.println("is shutdown:" + executor.isShutdown());
    System.out.println("is terminated:" + executor.isTerminated());
    
    while (!executor.isTerminated()) {
      
    }
    System.out.println("is terminated:" + executor.isTerminated());
  }

}
