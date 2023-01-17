package multidimensionalarray;

import java.util.Scanner;

public class ArrayDemo {

  public static void printArray(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void shuffleArray(double [][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        int i1 = (int) Math.random() * matrix.length;
        int j1 = (int) Math.random() * matrix[0].length;
        
        double temp = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    double[][] matrix = new double[2][2];
    java.util.Scanner scan = new Scanner(System.in);
    System.out.print("Enter " + matrix.length + "rows and " + matrix[0].length + "columns: ");

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = scan.nextInt();
      }
    }
    printArray(matrix);
    scan.close();

    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        sum += matrix[i][j];
      }
    }
    System.out.println("Sum = " + sum);


    for (int i = 0; i < matrix.length; i++) {
      sum = 0;
      for (int j = 0; j < matrix[0].length; j++) {
        sum += matrix[i][j];
      }
      System.out.println("Sum for Row" + i + " is " + sum);
    }

    int maxRow = 0;
    int indexOfMaxRow = 0;

    for (int column = 0; column < matrix[0].length; column++) {
      maxRow += matrix[0][column];
    }

    for (int row = 1; row < matrix.length; row++) {
      int totalOfThisRow = 0;
      for (int column = 0; column < matrix[0].length; column++) {
        totalOfThisRow += matrix[row][column];
      }

      if (totalOfThisRow > maxRow) {
        maxRow = totalOfThisRow;
        indexOfMaxRow = row;
      }
    }
    System.out.println("Row" + indexOfMaxRow + " have max row sum :" + maxRow);
    
    
    shuffleArray(matrix);
    printArray(matrix);
  }

}
