package knowledge.reflection;


public class User {
  private int id;
  private String name;
  private int age;

  public User() {
    id = 1;
    name = "ho";
    age = 123;
  }

  public User(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
  }


}
