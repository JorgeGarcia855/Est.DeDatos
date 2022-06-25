package co.edu.unbosque.controller;

import co.edu.unbosque.model.Operaciones;

import java.util.Scanner;

public class Controller {
    private static final Scanner scan = new Scanner(System.in);

    public Controller() {
        funcionar();
    }

    public static void funcionar() {
        System.out.println("Ingrese cantidad de cubiculos");
        int cubTam = scan.nextInt();
        System.out.println("Ingrese cantidad de casilleros");
        int casTam = scan.nextInt();
        do {
            System.out.println("""
                    Seleccione una opcion:
                    
                    1: Ingresar usuario a casillero
                    2: Retirar usuario de casillero
                    3: Consultar usuario de casillero
                    4: Salir
                    """);
            switch (scan.nextInt()) {
                case 1 -> Operaciones.nuevoEstudiante();
                case 2 ->{}
                case 3 ->{}
                case 4 -> System.exit(0);
            }
        } while (true);
    }
}
