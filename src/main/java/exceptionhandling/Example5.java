package exceptionhandling;

public class Example5 {
  public static void main(String[] args) throws Exception {
    int dummyArraySize = 15;
    // Runtime.getRuntime().maxMemory() ��^ jvm ���̤j�i�ΰO����Ŷ�, �q�`�����z�O����Ŷ���1/4
    System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
    System.out.println("Long size : " + Long.SIZE);
    long memoryConsumed = 0;
    try {
      long[] memoryAllocated = null;
      for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
        memoryAllocated = new long[dummyArraySize];
        memoryAllocated[0] = 0;
        memoryConsumed += dummyArraySize * Long.SIZE;
        System.out.println("Memory Consumed till now: " + memoryConsumed);
        dummyArraySize *= dummyArraySize * 2;
        Thread.sleep(500);
      }
    } catch (OutOfMemoryError outofMemory) {
      System.out.println("Catching out of memory error");
      // Log the information, so that we can generate the statistics
      outofMemory.printStackTrace();
    }
  }
}
