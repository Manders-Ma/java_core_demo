package array;

public class OneDArrayCopy {

  public static void main(String[] args) {

    /*
     * Use list2=list1 just assign list1's reference for list2. 
     * Thus, we update list2[0]=10.0 that will change list1's value.
     */
    double[] list1 = {1.0, 2.7, 3.6, 4.8, 5.6};
    double[] list2 = list1;
    list2[0] = 10.0;
    System.out.println("list1[0]=" + list1[0]);
    
    
    // A way to copy array.
    int[] sourceArray = {2, 3, 1, 5, 10};
    int[] targetArray = new int[sourceArray.length];
    for (int i=0; i<sourceArray.length; i++) {
      targetArray[i] = sourceArray[i];
    }
    for (int e : targetArray) {
      System.out.print(e + " ");
    }
    System.out.println();
    
    
    
    // Best way to copy array.
    System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    for (int e : targetArray) {
      System.out.print(e + " ");
    }



  }

}
