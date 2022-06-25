/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles2;

/**
 *
 * @author Hernan Lozano
 */
public class ArbolMain {
     public static void main(String[] argumentos) {
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(0)); // true
    }
}