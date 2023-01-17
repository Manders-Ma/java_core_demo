package file;

import java.io.File;

public class TestFileClass {

  public static void main(String[] args) {
    /*
     * file class�L�k�ާ@��󪺤��e, �u��q������@��file����T, �ɶq�ϥά۹���|���N������|���g�k.
     */
    File file = new File("test.txt");
    
    System.out.println("Does it exists? " + file.exists());
    System.out.println("Is it a directory? " + file.isDirectory());
    System.out.println("Is it a file? " + file.isFile());
    System.out.println("The file has " + file.length() + " bytes");
    System.out.println("Can it be read? " + file.canRead());
    System.out.println("Can it be write? " + file.canWrite());
    System.out.println("Is it a absolute path? " + file.isAbsolute());
    System.out.println("Is it a hidden?" + file.isHidden());
    System.out.println("Absolute path is ? " + file.getAbsolutePath());
    System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
  }

}
