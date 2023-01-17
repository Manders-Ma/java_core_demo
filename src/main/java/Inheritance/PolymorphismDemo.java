package Inheritance;

public class PolymorphismDemo {

  public static void main(String[] args) {
    // Polymorphism  �h�A, �ڭ̥i�H����άO�@�ӴX��ϧ� (�w�q�W�ӻ�,�N�Y�l���O�������@��, ���ڭ̤��|�������O�l�����@��)
    // �]�����k���ѼƩw�q������, �ڭ̥i�H�ǤJ�l��, �ϹL�ӫh����.
    displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
  }

  public static void displayObject(SimpleGeometricObject object) {
    System.out.println("Created on" + object.getDateCreated() + ". Color is " + object.getColor());
  }

}
