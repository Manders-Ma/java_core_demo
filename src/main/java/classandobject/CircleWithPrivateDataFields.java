package classandobject;

public class CircleWithPrivateDataFields {
  double radius;
  // Set static variable.
  // 1. �R�A�ܼ��ݩ����O����, �Ӥ��O���
  // 2. �R�A�ܼƬO�Ҧ�����Ҧ@�� (���s�Ŷ��@��)
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
