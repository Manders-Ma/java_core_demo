package Inheritance;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
  private double radius;

  // 等價於 {SimpleGeometricObject();}
  public CircleFromSimpleGeometricObject() {}


  /*
   * 等價於{ SimpleGeometricObject(); some statements; }
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

  // 一般情況下要調用父類的函數可以直接使用函數名字做調用, 若有method overriding(方法覆寫)且需要調用到原函數的話,即可使用supper關鍵字
  // 方法覆寫條件 :
  // 1.該父類方法必須是可以調用的(not private)
  // 2.靜態方法可以被繼承,但不能覆寫, 若特殊情況需要覆寫, 可以使用類名來調用原先的靜態方法
  // 3.super.super.toString() 語法錯誤

  @Override
  public String toString() {
    return super.toString();
  }

}
