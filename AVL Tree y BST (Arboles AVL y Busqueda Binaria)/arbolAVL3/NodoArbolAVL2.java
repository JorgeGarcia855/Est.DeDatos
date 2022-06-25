/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL3;

public class NodoArbolAVL2<T extends Comparable<T>> {

	private T dato;
	private int altura;
	private NodoArbolAVL2<T> hijoIzquierdo;
	private NodoArbolAVL2<T> hijoDerecho;
	
	public NodoArbolAVL2(T dato){		
		this.dato = dato;
		this.hijoIzquierdo = null;
		this.hijoDerecho = null;
	}
	
	public T getDato(){		
		return this.dato; 
	}
	
	public NodoArbolAVL2<T> getHijoIzquierdo(){		
		return this.hijoIzquierdo;
	}
	
	public NodoArbolAVL2<T> getHijoDerecho(){		
		return this.hijoDerecho;
	}	
	
	public void setDato(T dato){		
		this.dato = dato;
	}
	
	public void setHijoIzquierdo(NodoArbolAVL2<T> hijoIzq){		
		this.hijoIzquierdo = hijoIzq;
	}
	
	public void setHijoDerecho(NodoArbolAVL2<T> hijoDer){		
		this.hijoDerecho = hijoDer;
	}	
	
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public int getAltura(){
		return this.altura;
	}
}
