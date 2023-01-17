package classandobject;

public class TestCircleWithStaticMembers {

  public static void main(String[] args) {

    System.out.println("Before creating objects : ");
    System.out.println("The number of circle object is " + CircleWithStaticMembers.numberOfObjects);
    
    // Create c1
    System.out.println();
    CircleWithStaticMembers c1 = new CircleWithStaticMembers();
    System.out.println("After creating c1 : ");
    System.out.println("The radius of c1 is " + c1.radius);
    System.out.println("The number of circle object is " + CircleWithStaticMembers.numberOfObjects);
    
    
    // Test CircleWithPrivateDataFields
    CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields();
    System.out.println(CircleWithPrivateDataFields.getNumberOfObjects());
    System.out.println(c2.getArea());
    // c2.numberOfObjects
  }

}
