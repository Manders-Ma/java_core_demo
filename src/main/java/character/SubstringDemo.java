package character;

public class SubstringDemo {

  public static void main(String[] args) {
    String message = "Welcome to Java!";
    System.out.println(message.substring(11)); // 從J開始擷取
    System.out.println(message.substring(0, 11)); // 從頭開始到J以前
    System.out.println(message.substring(0));

    
    // Get special char's index.
    String name = "Andrew Programing";
    int k = name.indexOf(' ');
    String firstname = name.substring(0, k);
    String lastname = name.substring(k + 1);
    System.out.println("first name: " + firstname + " last name: " + lastname);



  }

}
