package classandobject;

public class CircleWithPrivateDataFields {
  double radius;
  // Set static variable.
  // 1. 靜態變數屬於類別本身, 而不是實例
  // 2. 靜態變數是所有的實例共享 (內存空間共用)
  private static int numberOfObjects = 0;
  

  CircleWithPrivateDataFields() {
    radius = 1.0;
    numberOfObjects++;
  }

  CircleWithPrivateDataFields(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  
  public static int getNumberOfObjects() {
    return numberOfObjects;
    
  }
  
  public static void setNumberOfObjects(int newNumberOfObjects) {
    if (newNumberOfObjects>=0)
      CircleWithPrivateDataFields.numberOfObjects = newNumberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }
  
  public  double getRadius() {
    return radius;
    
  }
  
  public void setRadius(double newRadius) {
    if (newRadius>=0)
      radius = newRadius;
  }
}
