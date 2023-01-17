package file;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {

  public static void main(String[] args) {
    System.out.print("Enter a URL: ");

    try (Scanner scanner = new Scanner(System.in);) {
      String urlString = scanner.next();
      URL url = new URL(urlString);
      
      int count = 0;
      Scanner input = new Scanner(url.openStream());
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
      }
      
      System.out.println("The file size is " + count + " characters");
    }
    catch (MalformedURLException e) {
      System.out.println("Invalid URL");
    }
    catch(IOException e) {
      System.out.println("I/O Errors");
    }
  }

}
