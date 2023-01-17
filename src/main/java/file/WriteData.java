package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("test.txt");
    if (file.exists()) {
      System.out.println("File already exists!");
      System.exit(0);
    }

    // PrintWriter 會發生異常, 並且異常類別是必檢異常, 因此需要使用try/catch 或是方法定義後面加上throws <exception type>
    PrintWriter output = new PrintWriter(file);
    output.print("Java Programming ");
    output.println(60);

    output.print("Python Programming ");
    output.println(90);

    output.close();
  }

}
