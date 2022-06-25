/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboldirectorios;

/**
 * Class for testing purposes.
 * 
 * @author Dpt. of Telematic Engineering, University Carlos III of Madrid
 * 
 */
public class FileSystemTest {

  /**
   * Testing main.
   */
  public static void main(String[] args) {
    /*
     * First, we check the proper working of Folder class
     */
    // Create several folder objects representing
    // different folders
    Folder folderC = new Folder("C");

    // Check the getName method
    System.out.println(folderC.getName());

    // Check the setName method
    folderC.setName("C:");
    System.out.println(folderC.getName());

    // Check the printSubdirectories when there are
    // no subdirectories added
    folderC.printSubdirectories();

    // Add one subdirectory
    folderC.addSubdirectory("Program Files");

    // Check the printSubdirectories when there is
    // only one subdirectory added
    folderC.printSubdirectories();

    // Add some more subdirectories
    folderC.addSubdirectory("My Documents");
    folderC.addSubdirectory("Windows");

    // Check the printSubdirectories when there are
    // several subdirectories added
    folderC.printSubdirectories();

    /*
     * Once we have checked the proper working of the Folder class, we test the
     * FileSystem class.
     */
    // Create the file system
    FileSystem fs = new FileSystem("C:");
    fs.printFileSystem();

    // Add a new folder not contained in the file system
    fs.addNewFolder("C:", "Program Files");
    fs.printFileSystem();

    // Add a new folder
    fs.addNewFolder("Program Files", "Java");
    fs.printFileSystem();

    // Add a new folder as subdirectory of a folder
    // which is not in the file system
    fs.addNewFolder("Windows", "MyFolder");

    // Add several folder, and see if they are
    // printed as expected
    fs.addNewFolder("C:", "My Documents");
    fs.addNewFolder("My Documents", "Images");
    fs.addNewFolder("My Documents", "Video");
    fs.addNewFolder("My Documents", "Music");
    fs.addNewFolder("My Documents", "Text Documents");
    fs.addNewFolder("Music", "Old Music");
    fs.printFileSystem();
  }
}