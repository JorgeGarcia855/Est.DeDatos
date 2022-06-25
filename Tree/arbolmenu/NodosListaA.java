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
public class NodosListaA{
    NodoBinario datos;
    NodosListaA siguiente;
 
     //Construtor  Crea un nodo del tipo Object
    NodosListaA (NodoBinario  valor){
        datos =valor;
        siguiente = null;  //siguiente con valor de nulo
     }

    // Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
    NodosListaA (NodoBinario valor, NodosListaA signodo){
        datos = valor;
        siguiente = signodo; //siguiente se refiere al siguiente nodo
    }
}
