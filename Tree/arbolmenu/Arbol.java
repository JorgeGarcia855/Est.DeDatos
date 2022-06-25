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
public class Arbol{
    Cola Cola = new Cola();
    NodoBinario Padre;
    NodoBinario Raiz;

    //Constructor
    public Arbol(){
        Raiz = null;
    }

    //Insercion de un elemento en el arbol
    public void InsertaNodo(int Elem){
        if(Raiz == null)
            Raiz = new NodoBinario (Elem);
        else
            Raiz.InsertaBinario (Elem);
    }

    //Preorden Recursivo del arbol
    public void Preorden (NodoBinario Nodo){
        if(Nodo == null)
            return;
        else{
            System.out.print (Nodo.dato + " ");
            Preorden (Nodo.Hizq);
            Preorden (Nodo.Hder);
        }
    }

    //PostOrden recursivo del arbol
    public void PostOrden (NodoBinario Nodo){
        if(Nodo == null)
            return;
        else{
            PostOrden (Nodo.Hizq);
            PostOrden (Nodo.Hder);
            System.out.print (Nodo.dato + " ");
        }
    }

    //Inorden Recursivo del arbol
    public void Inorden (NodoBinario Nodo){
        if(Nodo == null)
            return;
        else{
            Inorden (Nodo.Hizq);
            System.out.print(Nodo.dato + " ");
            Inorden (Nodo.Hder);
        }
    }

    //Busca un elemento en el arbol
    void Busqueda (int Elem, NodoBinario A){
        if((A == null) | (A.dato == Elem)){
            System.out.print(A.dato + " ");
            return;
        }
        else{
            if(Elem>A.dato)
                    Busqueda (Elem, A.Hder);
            else
                    Busqueda ( Elem, A.Hizq);
        }
    }

    //Altura del arbol
    public int Altura (NodoBinario Nodo){
        int Altder = (Nodo.Hder == null? 0:1 + Altura (Nodo.Hder));
        int Altizq = (Nodo.Hizq == null? 0:1 + Altura (Nodo.Hizq));
        return Math.max(Altder,Altizq);
    }

    //Recorrido en anchura del arbol
    public void Anchura (NodoBinario Nodo){
        Cola cola= new Cola();
        NodoBinario T = null;
        System.out.print ("El recorrido en Anchura es: ");
        if(Nodo != null){
                cola.InsertaFinal (Nodo);
                while(!(cola.VaciaLista ())){
                        T = cola.PrimerNodo.datos;
                        cola.EliminaInicio();
                        System.out.print(T.dato + " ");
                        if (T.Hizq != null)
                                cola.InsertaFinal (T.Hizq);
                        if (T.Hder != null)
                                cola.InsertaFinal (T.Hder);
                }
        }
        System.out.println();
    }
}
