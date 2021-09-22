package main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad4 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lista1.add(scan.nextInt());
        }
        System.out.println("La lista 1 es: "+ lista1);
        for (int i = 0; i < 3; i++) {
            lista2.add(scan.nextInt());
        }
        System.out.println("La lista 2 es: "+ lista2);
        List<Integer> repetidos = new ArrayList<>(lista1);
        repetidos.retainAll(lista2);
        if(repetidos.isEmpty()){
            System.out.println("[REPETIDOS] = No hay ningun dato repetido");
        } else {
            System.out.println("[REPETIDOS] = " + repetidos);
        }
    }
}
