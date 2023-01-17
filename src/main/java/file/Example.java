package file;

import java.io.File;
import java.util.Scanner;

public class Example {

  public static void main(String[] args) throws Exception{
    File file = new File("test.txt");
    
    try(Scanner scanner = new Scanner(file);){
      String name;
      int score, count=0;
      double sum = 0.0;
      while(scanner.hasNext()) {
        count++;
        name = scanner.next();
        score = scanner.nextInt();
        sum = sum+score;
        System.out.println("name:" + name + " score:" + score);
      }
      System.out.printf("sum of score:%f \nmean of score:%f",sum, sum/count);
    }
    
    
  }

}
