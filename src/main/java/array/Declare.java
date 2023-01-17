package array;

public class Declare {

  public static void main(String[] args) {

    // Declare a array variable, but not assign initial value.
    double[] myList;

    // Create array for array variable.
    /* 
     * ¹w³]­È:
     * 0 for the numeric primitive data types, 
     * '\u0000' for char types, 
     * and false for boolean types.
     * 
     */
    myList = new double[10];

    // Assign value.
    myList[0] = 1.0;
    System.out.println(myList[0]);
  }

}
