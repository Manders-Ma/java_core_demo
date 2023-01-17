package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    startClient();
  }

  public static void startClient() {
    Socket socket;
    try {
      socket = new Socket("127.0.0.1", 8000);
      DataInputStream fromServer = new DataInputStream(socket.getInputStream());
      DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());


      while (true) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();

        toServer.writeDouble(radius);
        toServer.flush();

        double area = fromServer.readDouble();
        System.out.println("Area is " + area);
        System.out.println(socket.getLocalPort());
      }

    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
