package classandobject;

public class TestTV {

  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.setChannel(30);
    tv.setVolume(3);
    
    System.out.printf("The tv's channel is %d.", tv.channel);
    System.out.printf("The tv's volume is %d.", tv.volumeLevel);

  }
}