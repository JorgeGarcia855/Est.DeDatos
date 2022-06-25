/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolmenu;

/**
 *
 * @author Hernan Lozano
 */
import java.io.*;

public class NodoBinario{
    int dato;
    NodoBinario Hizq, Hder;
    //Constructores
    NodoBinario (int Elem){
        dato = Elem;
        NodoBinario Hizq, Hder = null;
    }

    //Insercion de un elemento
    public void InsertaBinario (int Elem){
        if(Elem < dato){
            if (Hizq == null)
                Hizq = new NodoBinario(Elem);
            else
                Hizq.InsertaBinario(Elem);
        }else{
            if (Elem > dato){
                if (Hder == null)
                        Hder = new NodoBinario (Elem);
                else
                        Hder.InsertaBinario(Elem);
            }
        }
    }
}
