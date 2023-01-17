package Inheritance;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
  private double radius;

  // ������ {SimpleGeometricObject();}
  public CircleFromSimpleGeometricObject() {}


  /*
   * ������{ SimpleGeometricObject(); some statements; }
   */
  public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // �@�뱡�p�U�n�եΤ�������ƥi�H�����ϥΨ�ƦW�r���ե�, �Y��method overriding(��k�мg)�B�ݭn�եΨ���ƪ���,�Y�i�ϥ�supper����r
  // ��k�мg���� :
  // 1.�Ӥ�����k�����O�i�H�եΪ�(not private)
  // 2.�R�A��k�i�H�Q�~��,�������мg, �Y�S���p�ݭn�мg, �i�H�ϥ����W�ӽեέ�����R�A��k
  // 3.super.super.toString() �y�k���~

  @Override
  public String toString() {
    return super.toString();
  }

}
