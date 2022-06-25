/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo3;

import java.util.Scanner;
import grafo3.Grafo2;

public class MiGrafo2 {
	
	public static void menu(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Eliminar Grafo");
		System.out.println("4. Mostrar Grafo");
		System.out.println("5. Obtener lista Adyacencia vertice");
		System.out.println("6. Salir");
	}
	
	public static void addArista(Grafo2 g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int peso = in.nextInt();
		g.insertaArista(v1, v2, peso);
	}
	
	public static void deleteArista(Grafo2 g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		if(g.existeArista(v1, v2))g.eliminarArista(v1, v2);
		else System.out.println("Arista buscada no existe");
	}
	
	public static void deleteGraph(Grafo2 g){
		System.out.println("Borrando grafo");
		g.liberaGrafo();
	}
	
	public static void showGraph(Grafo2 g){
		g.mostrarGrafo();
	}
	
	public static void getAdList(Grafo2 g){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte vertice");
		int v = in.nextInt();
		if(g.listaAdyVacia(v)){
			System.out.println("La lista esta vacia");
		}
		else{
			Nodo aux = g.getPrimerAd(v);
			System.out.println("Lista: ");
			while(aux != null){
				System.out.print(" " + aux.vertice);
				aux = g.nextAdy(aux);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int opcion;
		Grafo2 g = new Grafo2(5);
		
		do{
			menu();
			
			System.out.println("Ingrese una opcion");
			Scanner in = new Scanner(System.in);
			opcion = in.nextInt();
			
			switch(opcion){
			case 1: addArista(g);break;
			case 2: deleteArista(g);break;
			case 3: deleteGraph(g);break;
			case 4: showGraph(g);break;
			case 5: getAdList(g);break;
			case 6: break;
			default: System.out.println("Incorrect option");
			}
		}while(opcion != 6);
	}
}
