/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL;

public class Nodo{ 
    int numMat; 
    Nodo izqda, drcha; 
    public Nodo(int mat){ 
        numMat = mat; 
        izqda = drcha = null; 
    } 
    public void re_enorden(){ 
        if(izqda != null) 
            izqda.re_enorden(); 
        System.out.println("Matricula:   " +numMat); 
        if(drcha != null) 
            drcha.re_enorden(); 
    } 
} 