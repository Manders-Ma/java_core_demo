package classandobject;


// public class's name must have same name with file name.
public class TestSimpleCircle {

  public static void main(String[] args) {
    SimpleCircle circle1 = new SimpleCircle();
    System.out
        .println("The area of circle of radius " + circle1.radius + " is " + circle1.getArea());

    SimpleCircle circle2 = new SimpleCircle(10);
    System.out
        .println("The area of circle of radius " + circle2.radius + " is " + circle2.getArea());

    circle2.radius = 100;
    System.out
        .println("The area of circle of radius " + circle2.radius + " is " + circle2.getArea());

  }
}


// Define the circle class with two constructors.
class SimpleCircle {
  double radius;

  // Construct a circle with radius 1.
  SimpleCircle() {
    radius = 1;
  }

  // Construct a circle with a specified radius.
  SimpleCircle(double newRadius) {
    radius = newRadius;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }
}
