package co.edu.unbosque.controller;

import java.util.Arrays;
import java.util.Scanner;

public class regiones {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese numero de casos: ");
        int casos = scan.nextInt();
        int i = 0;
        if (casos>0 && casos <=1000000) {
            do {
                System.out.print("Ingrese tamaño de la matriz: ");
                int size = scan.nextInt();
                if (size >= 1 && size <= 100) matriz(size);
                else System.out.println("Ingrese tamaño correcto.");
                i++;
            } while (i <= casos);
        }
    }

    private static void matriz(int size) {
        int[][] matrix = new int[size][size];
        System.out.println("Ingrese los valores en cada casilla"+"(Cantidad de casillas = "+size*size+"):");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        comprobarConeccion(matrix);
    }

    private static void comprobarConeccion(int[][] matriz){
        for (int i = 1; i < matriz.length; i++){
            for (int j = 1; j < matriz[i].length; j++){
                if (matriz[i][j] - matriz[i][j-1] == 1 && matriz[i][j] - matriz[i-1][j] == 1) System.out.println("SI");
                else System.out.println("NO");
            }
        }
    }
}
