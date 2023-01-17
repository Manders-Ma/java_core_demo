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

    // PrintWriter �|�o�Ͳ��`, �åB���`���O�O���˲��`, �]���ݭn�ϥ�try/catch �άO��k�w�q�᭱�[�Wthrows <exception type>
    PrintWriter output = new PrintWriter(file);
    output.print("Java Programming ");
    output.println(60);

    output.print("Python Programming ");
    output.println(90);

    output.close();
  }

}
