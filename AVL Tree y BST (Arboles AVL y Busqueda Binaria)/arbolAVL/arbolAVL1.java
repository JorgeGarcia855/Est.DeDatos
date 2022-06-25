/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL;

public class arbolAVL1 { 
    private Nodo raíz; 
    public arbolAVL1(){ 
        raíz = null; 
    } 
    public void insertar(int nuevoM){ 
        if(raíz==null){ 
            raíz =  new Nodo(nuevoM); 
        } 
        else{ 
            insertar(raíz,nuevoM); 
        } 
    } 
    private void insertar(Nodo rz, int nm){ 
        if (rz == null) 
            rz = new Nodo(nm); 
        else if(nm < rz.numMat) 
            insertar(rz.izqda,nm); 
        else if(nm > rz.numMat) 
            insertar(rz.drcha,nm); 
        else 
            System.out.println("Numero Duplicados"); 
    } 
    public void visualizar(){ 
        if(raíz!=null) 
            raíz.re_enorden(); 
    } 
}
