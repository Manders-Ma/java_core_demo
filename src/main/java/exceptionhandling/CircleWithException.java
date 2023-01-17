package exceptionhandling;

public class CircleWithException {
  double radius;
  private static int numberOfObjects = 0;
  

  CircleWithException() {
    radius = 1.0;
    numberOfObjects++;
  }

  CircleWithException(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
  }

  
  public static int getNumberOfObjects() {
    return numberOfObjects;
    
  }
  
  public static void setNumberOfObjects(int newNumberOfObjects) {
    if (newNumberOfObjects>=0)
      numberOfObjects = newNumberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }
  
  public  double getRadius() {
    return radius;
    
  }
  // IllegalArgumentException �ݩ� RuntimeException, �Y�����n��IllegalArgumentException, �]�O�S�����~��
  public void setRadius(double newRadius) throws IllegalArgumentException{
    if (newRadius>=0)
      radius = newRadius;
    else throw new IllegalArgumentException("Radius can not be negative");
  }
}
