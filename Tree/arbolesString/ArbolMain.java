/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesString;

/**
 *
 * @author Hernan Lozano
 */
public class ArbolMain {
     public static void main(String[] argumentos) {
         
        ArbolesCadena arbolCadenas = new ArbolesCadena();
        arbolCadenas.insertar("a");
        arbolCadenas.insertar("b");
        arbolCadenas.insertar("c");
        arbolCadenas.insertar("d");
        arbolCadenas.insertar("e");
        arbolCadenas.insertar("f");
        System.out.println("Recorriendo inorden:");
        arbolCadenas.inorden();
//        arbolCadenas.insertar("Luis");
//        arbolCadenas.insertar("Chris");
//        arbolCadenas.insertar("Zelda");
//        arbolCadenas.insertar("Cuphead");
//        arbolCadenas.insertar("Leon");
//        System.out.println("Recorriendo inorden:");
//        arbolCadenas.inorden();
//        System.out.println("Recorriendo postorden:");
//        arbolCadenas.postorden();
//        System.out.println("Recorriendo preorden:");
//        arbolCadenas.preorden();
//        System.out.println(arbolCadenas.existe("Luis")); // true
//        System.out.println(arbolCadenas.existe("Claire")); // false
//        System.out.println(arbolCadenas.existe("Zelda")); // true
        
    }
}
