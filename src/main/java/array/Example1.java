package array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Example1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of students : ");
    int num = scan.nextInt();

    System.out.printf("Enter %d scores : ", num);
    int[] scores = new int[num];
    for (int i = 0; i < scores.length; i++) {
      scores[i] = scan.nextInt();
    }
    for (int e : scores) {
      System.out.print(e + " ");
    }
    System.out.println();
    printInterval(scores, max(scores));
  }

  public static int max(int[] scores) {
    int max = scores[0];
    for (int i = 1; i < scores.length; i++) {
      if (scores[i] > max) {
        max = scores[i];
      }
    }

    return max;
  }

  public static void printInterval(int[] scores, int max) {
    char interval;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= (max - 10)) {
        interval = 'A';
      } else if (scores[i] >= (max - 20)) {
        interval = 'B';
      } else if (scores[i] >= (max - 30)) {
        interval = 'C';
      } else if (scores[i] >= (max - 40)) {
        interval = 'D';
      } else {
        interval = 'F';
      }
      System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], interval);
    }
  }

}
