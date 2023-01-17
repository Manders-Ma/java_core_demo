package classandobject;

public class CircleWithStaticMembers {
  double radius;
  // Set static variable.
  // 1. 靜態變數屬於類別本身, 而不是實例
  // 2. 靜態變數是所有的實例共享 (內存空間共用)
  static int numberOfObjects = 0;

  CircleWithStaticMembers() {
    radius = 1.0;
    numberOfObjects++;
  }

  CircleWithStaticMembers(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  static int getNumberOfObjects() {
    return numberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }



}
