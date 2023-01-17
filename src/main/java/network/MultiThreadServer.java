package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
  public static void main(String[] args) {
    start();
  }

  private static ServerSocket serverSocket;
  private static int clientNumber = 0;

  public static void start() {

    new Thread(() -> {
      try {
        // Create a server socket
        serverSocket = new ServerSocket(8000);

        while (true) {
          // Listen for a connection request
          Socket socket = serverSocket.accept();

          // Increment
          clientNumber++;
          System.out.println("Connected client number: " + clientNumber);

          // Find the client's host name, and IP address
          InetAddress inetAddress = socket.getInetAddress();
          System.out.println(inetAddress.getHostAddress());
          System.out.println(inetAddress.getHostName());

          // Create and start a new thread for the connection
          new Thread(new ClientHandler(socket)).start();
        }
      } catch (Exception e) {
        System.err.println(e);
      } finally {
        try {
          serverSocket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }
}


class ClientHandler implements Runnable {
  private Socket socket;

  public ClientHandler(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
      // Create data input and output streams
      DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
      DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

      // Continuously serve the client
      while (true) {
        // Receive radius from the client
        double radius = inputFromClient.readDouble();
        double area = radius * radius * Math.PI;
        outputToClient.writeDouble(area);

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

