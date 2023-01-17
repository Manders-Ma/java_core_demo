package classandobject;

public class CircleWithStaticMembers {
  double radius;
  // Set static variable.
  // 1. �R�A�ܼ��ݩ����O����, �Ӥ��O���
  // 2. �R�A�ܼƬO�Ҧ�����Ҧ@�� (���s�Ŷ��@��)
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
