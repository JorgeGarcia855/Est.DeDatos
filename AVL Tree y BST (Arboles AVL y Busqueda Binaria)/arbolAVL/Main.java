/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL;

/**
 *
 * @author Hernan Lozano
 */
public class Main { 
    public static void main(String []args){ 
        arbolAVL1 árbol = new arbolAVL1(); 
        árbol.insertar(6); 
        árbol.insertar(3); 
        árbol.insertar(7); 
        árbol.visualizar(); 
    } 
}
