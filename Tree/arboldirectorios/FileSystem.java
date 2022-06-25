/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboldirectorios;

/**
 * Class representing the file system.
 * 
 * @author Dpt. of Telematic Engineering, University Carlos III of Madrid
 * 
 */
public class FileSystem {

  /** File system (tree) root */
  private Folder root;

  /**
   * Constructor.
   */
  public FileSystem() {
    this("default");
  }// end constructor

  /**
   * Constructor.
   * 
   * @param rootFolderName
   *          Name of the root folder
   */
  public FileSystem(String rootFolderName) {
    root = new Folder(rootFolderName);
  }// end constructor

  /**
   * Search the folder specified as parameter in the file system, and return a
   * reference to the folder if it exists or null otherwise.
   * 
   * @param folderName
   *          Name of the folder to search.
   * @return a reference to the folder if it is in the file system, or null
   *         otherwise.
   */
  public Folder searchFolder(String folderName) {
    // It calls the auxiliary search method
    return searchFolder(root, folderName);
  }// end searchFolder

  /**
   * Search the folder specified as parameter in the file system, and return a
   * reference to the folder if it exists or null otherwise. This method is
   * recursive and is applied over each subtree by specifying the root of that
   * subtree in each case.
   * 
   * @param rootFolder
   *          Root of each subtree over which the search method is applied.
   * @param folderName
   *          Name of the folder to be searched.
   * @return a reference to the folder being searched if it is in the file
   *         system, or null otherwise.
   */
  private Folder searchFolder(Folder rootFolder, String folderName) {
    // Reference to the folder we are searching for
    Folder searchedFolder = null;
    // Boolean to indicate that we have found the folder
    boolean found = false;

    if (rootFolder != null) { // Check if the tree is not empty
      if (rootFolder.getName().equals(folderName)) {
        // If the current folder is the one being searched,
        // save it in the variable searchedFolder...
        searchedFolder = rootFolder;
      } else {
        // ...else, apply the search method over each subtree
        // which root is each of the subdirectories of the
        // current folder, until it is found
        for (int i = 0; i < rootFolder.getSubdirectories().size() && !found; i++) {
          searchedFolder = searchFolder(rootFolder.getSubdirectories().get(i),
              folderName);
          if (searchedFolder != null) {
            // if we have found the folder, we stop searching
            found = true;
          }
        }
      }
    }
    return searchedFolder;
  }// end searchFolder

  /**
   * Add a new folder of the specified name, as a subdirectory of the folder
   * specified in the first parameter. If there exists a folder with name
   * newFolderName in the file system, or if parentFolderName does not exist,
   * the method does nothing and returns null. Otherwise it returns a reference
   * to the new folder.
   * 
   * @param parentFolderName
   *          Name of the parent folder.
   * @param newFolderName
   *          Name of the new folder.
   * @return a reference to the new folder, or null if there exists a folder
   *         with newFolderName in the file system of if the parent folder does
   *         not exist.
   */
  public Folder addNewFolder(String parentFolderName, String newFolderName) {
    // Search the parent folder
    Folder parentFolder = searchFolder(parentFolderName);
    // Search if there exists a folder with newFolderName name
    Folder newFolder = searchFolder(newFolderName);

    // If the parent folder exists and no newFolderName exists in the file
    // system...
    if (parentFolder != null && newFolder == null) {
      // ...then add the directory...
      newFolder = parentFolder.addSubdirectory(newFolderName);
    } else { // ...otherwise...
      // ...return null and show some message in screen.
      newFolder = null;
      if (parentFolder == null) {
        System.out.println("The folder cannot be added because "
            + "the parent folder \"" + parentFolderName + "\" does not exist.");
      } else {
        System.out.println("The folder cannot be added because "
            + "there is already another folder with the same name");
      }
    }
    return newFolder;
  }// end addNewFolder

  /**
   * Print the file system structure in screen.
   */
  public void printFileSystem() {
    // Call an auxiliary recursive method.
    printFileSystem(0, root);
  }// end printFileSystem

  /**
   * Print the file system structure in screen. This method is recursive, and is
   * called over each subtree by specifying the root of the corresponding
   * subtree.
   * 
   * @param level
   *          Tree level where the root of the subtree is.
   * @param root
   *          Root folder of the subtree over which the method is applied.
   */
  private void printFileSystem(int level, Folder root) {
    // Check if the current root is not null
    if (root != null) {
      if (level > 0) {
        // If level is greater than 0 (the root is not
        // the root of whole file system)...
        for (int i = 0; i < level; i++) {
          // ...print as many white spaces as levels...
          System.out.print(" ");
        }
        // ...and print the symbol representing the directory...
        System.out.print("|_");
      }
      // ...print the name of the folder
      System.out.println(root.getName());
      for (int j = 0; j < root.getSubdirectories().size(); j++) {
        // Take each subdirectory as root of a subtree, and
        // apply the method over that subtree
        printFileSystem(level + 1, root.getSubdirectories().get(j));
      }
    }
  }// end printFileSystem
}