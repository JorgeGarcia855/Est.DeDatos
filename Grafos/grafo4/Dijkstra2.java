/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo4;

import java.util.Scanner;

/**
 *
 * @author Hernan Lozano
 */
public class Dijkstra2 {
    
    public int[] distancia = new int[10];
    public int[][] costo = new int[10][10];

    public void calc(int n, int s) {
        int[] bandera = new int[n + 1];
        int i, minpos = 1, k, c, minima;

        for (i = 1; i <= n; i++) {
            bandera[i] = 0;
            this.distancia[i] = this.costo[s][i];
        }
        c = 2;
        while (c <= n) {
            minima = Integer.MAX_VALUE;
            for (k = 1; k <= n; k++) {
                if (this.distancia[k] < minima && bandera[k] != 1) {
                    minima = this.distancia[i];
                    minpos = k;
                }
            }
            bandera[minpos] = 1;
            c++;
            for (k = 1; k <= n; k++) {
                if (this.distancia[minpos] + this.costo[minpos][k] < this.distancia[k] && bandera[k] != 1) {
                    this.distancia[k] = this.distancia[minpos] + this.costo[minpos][k];
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodos, posicion, i, j, destino, vminimo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de nodos: ");
        nodos = sc.nextInt();
        Dijkstra2 d = new Dijkstra2();
        System.out.println("Ingrese los pesos de la matriz de costos: ");
        for (i = 0; i <= nodos-1; i++) {
            for (j = 0; j <= nodos-1; j++) {
                if(i!=j){
                System.out.println("["+i+"]["+j+"]=");
                d.costo[i][j] = sc.nextInt();
                    if (d.costo[i][j] == 0) {
                        d.costo[i][j] = 999;
                    }
                }else{
                    d.costo[i][j] = 999;
                }
            }
        }
        System.out.println("Ingrese la posicion de origen: ");
        posicion = sc.nextInt();

        d.calc(nodos-1, posicion);
    //    System.out.println("El camino más corto desde la posicion \t" + posicion + "\t a todos los demás puntos son: ");

        System.out.println("Ingrese la posicion de destino: ");
        destino = sc.nextInt();
        vminimo = d.distancia[destino];
        System.out.println("posicion :" + posicion + "\t destino :" + destino + "\t Costo minimo es :" + d.distancia[destino] + "\t");
        System.out.println("Valor minimo :"+vminimo);


    //    for (i = 1; i <= nodos-1; i++) {
    //        if (i != posicion) {
    //            System.out.println("posicion :" + posicion + "\t destino :" + i + "\t Costo minimo es :" + d.distancia[i] + "\t");
    //        }
    //    }
    }    
}
