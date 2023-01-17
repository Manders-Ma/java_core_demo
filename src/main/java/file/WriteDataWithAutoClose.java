package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("test.txt");
    if (file.exists()) {
      System.out.println("File already exists!");
      System.exit(0);
    }
    
    // 自動關閉output資源
    try(PrintWriter output = new PrintWriter(file)){
      output.print("Java Programming ");
      output.println(100);

      output.print("Python Programming ");
      output.println(100);
    }
  }

}
