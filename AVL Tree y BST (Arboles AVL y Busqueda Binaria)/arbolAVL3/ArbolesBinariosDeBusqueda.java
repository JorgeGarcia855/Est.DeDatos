/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL3;

public class ArbolesBinariosDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolAVL arbolitoAVl=new ArbolAVL();
        //Insertando Nodos
        arbolitoAVl.insertar(10);
        arbolitoAVl.insertar(5);
        arbolitoAVl.insertar(13);
        arbolitoAVl.insertar(1);
        arbolitoAVl.insertar(6);
        arbolitoAVl.insertar(17);
        arbolitoAVl.preOrden(arbolitoAVl.obtenerRaiz());
        
    }
    
}
