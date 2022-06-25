package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cubiculos;
import co.edu.unbosque.model.Operaciones;

import java.util.Scanner;
import java.lang.System;

/**
 * @author Jorge Garcia
 * @author David Millan
 */
public class gimnasio {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de cubiculos");
        int cubTam = scan.nextInt();
        System.out.println("Ingrese cantidad de casilleros");
        int casTam = scan.nextInt();
        do {
            System.out.println("Seleccione una opcion:\n" +
                               "\n" +
                               "1: Ingresar usuario a casillero\n" +
                               "2: Retirar usuario de casillero\n" +
                               "3: Consultar usuario de casillero\n" +
                               "4: Salir\n");
            switch (scan.nextInt()) {
                case 1 -> Operaciones.inscribirEstudiante(cubTam, casTam);
                case 2 -> Operaciones.removerEstudiante();
                case 3 -> Cubiculos.obtenerEstudiantes().forEach(System.out::println);
                case 4 -> System.exit(0);
                default -> System.exit(1);
            }
        } while (true);
    }
}
