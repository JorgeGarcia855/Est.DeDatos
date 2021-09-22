package main.controller;

import java.util.Scanner;

public class Actividad3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese tamaño de la lista de numeros: ");
        int tam = scanner.nextInt();
        if(tam > 1 && tam < 100){
            int[] listaNum = new int[tam];
            System.out.println("Ingrese los numeros en la lista:");
            for (int i = 0; i < listaNum.length; i++) {
                listaNum[i] = scanner.nextInt();
                if (listaNum[i] < -100 || listaNum[i] > 100) {
                    System.out.println("Los numeros de la lista deben ser mayor o igual que -100 y menor o igual que 100");
                    System.exit(0);
                }
            }
            System.out.println(productoMaximo(listaNum));
        } else {
            System.out.println("El tamaño de la lista debe ser mayor que 1 y menor que 100.");
        }
    }

    public static int productoMaximo(int[] lista){
        int prodMax = Integer.MIN_VALUE;
        int primMax = -1;
        int segunMax = -1;
        for (int i = 0; i < lista.length-1; i++){
            for (int j = i + 1; j < lista.length; j++){
                if (prodMax < lista[i]*lista[j]){
                    prodMax = lista[i]*lista[j];
                    primMax = i;
                    segunMax = j;
                }
            }
        }
        return lista[primMax]*lista[segunMax];
    }
}
