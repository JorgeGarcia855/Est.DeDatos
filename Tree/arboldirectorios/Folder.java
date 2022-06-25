/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboldirectorios;

import java.util.Vector;

/**
 * Class representing a folder.
 * 
 * @author Dpt. of Telematic Engineering, University Carlos III of Madrid
 * 
 */
public class Folder {

  /** Name of the folder */
  private String name;

  /**
   * Vector containing the subdirectories stored by this folder
   */
  private Vector<Folder> subdirectories;

  /**
   * Constructor
   */
  public Folder() {
    this("default folder");
  }

  /**
   * Constructor
   * 
   * @param name
   *          Name of the folder.
   */
  public Folder(String name) {
    this.name = name;
    this.subdirectories = new Vector<Folder>();
  }

  /**
   * Get the name of the folder.
   * 
   * @return a String reference to the name of the folder.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Set the name of the folder.
   * 
   * @param name
   *          New name of the folder.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the vector of subdirectories.
   * 
   * @return a reference to the vector containing the subdirectories.
   */
  public Vector<Folder> getSubdirectories() {
    return this.subdirectories;
  }

  /**
   * Add a new folder as subdirectory of this folder.
   * 
   * @param folderName
   *          Name of the new folder.
   * @return a reference to the new folder.
   */
  public Folder addSubdirectory(String folderName) {
    Folder newFolder = new Folder(folderName);
    subdirectories.add(newFolder);
    return newFolder;
  }

  /**
   * Print in screen the subdirectories of the folder with the format:
   * subdirectory1 subdirectory2 ... subdirectoryN
   */
  public void printSubdirectories() {
    for (int i = 0; i < subdirectories.size(); i++) {
      System.out.print(subdirectories.get(i).getName() + " ");
    }
    System.out.println();
  }
}