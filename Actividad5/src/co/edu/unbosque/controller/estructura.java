package co.edu.unbosque.controller;

import java.util.Scanner;

public class estructura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese cantidad de comandos: ");
        int cantidad = scan.nextInt();
        int i = 0;
        if (cantidad>=0 && cantidad<=100000) {
            do {
                System.out.println("""
                        Ingrese el comando:

                        1: Agregar elemento
                        2: Eliminar elemento
                        3: Mostrar elemento mas grande
                        """);
                switch (scan.nextInt()) {
                    case 1 -> {
                        System.out.print("Ingrese el numero: ");
                        CRUD.addInt(scan.nextInt());
                        i++;
                    }
                    case 2 -> {
                        System.out.println(CRUD.deleteInt());
                        i++;
                    }
                    case 3 -> {
                        System.out.println(CRUD.getMaxIntFromList());
                        i++;
                    }
                    default -> System.out.println("Ingrese el comando correcto.");
                }
            } while (i < cantidad);
            System.out.println("Has usado todos los comandos.");
        } else {
            System.out.println("Cantidad demasiado grande.");
        }
    }
}