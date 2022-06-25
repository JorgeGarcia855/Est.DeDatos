package co.edu.unbosque.model;

import java.util.Scanner;

public final class Operaciones {
    private static final Scanner scan = new Scanner(System.in);
    private static final Estudiantes.Builder crearEstudiante = new Estudiantes.Builder();
    private static Estudiantes estudiante;
    private Operaciones() {}

    public static void inscribirEstudiante(int tamCub, int tamCas) {
        while (true) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scan.next();
            if (nombre.length() >= 1 && nombre.length() <= 50) {
                crearEstudiante.nombre(nombre).build();
            } else {
                System.out.println("El nombre no puede tener mas de 50 caracteres");
                continue;
            }

            System.out.print("Ingrese su apellido: ");
            String apellido = scan.next();
            if (apellido.length() >= 1 && apellido.length() <= 50) {
                crearEstudiante.apellido(apellido).build();
            } else {
                System.out.println("El apellido no puede tener mas de 50 caracteres");
                continue;
            }

            System.out.print("Ingrese su cedula (Si la cedula es repetida,\n" +
                             "todos los valores escritos seran ignorados): ");
            long cedula = scan.nextLong();
            int cedLength = String.valueOf(cedula).length();
            if (cedLength >= 1 && cedLength <= 10) {
                estudiante = crearEstudiante.cedula(cedula).build();
                asignarCubiculoCasillero(estudiante, tamCub, tamCas);
                break;
            } else {
                System.out.println("Numero Invalido");
            }

        }
    }

    private static void asignarCubiculoCasillero(Estudiantes estudiante, int tamCub, int tamCas) {
        if ((tamCub>=0 && tamCub<=10) && (tamCas>=0 && tamCas<=10)) {
            for (int i = 0; i < tamCub; i++) {
                for (int j = 0; j < tamCas; j++) {
                    System.out.println("Cubiculo: "+i+" | "+ "Casillero: "+j);
                    Cubiculos.ingresarEstudiante(estudiante);
                    System.out.println(estudiante.toString());
                }
            }
        } else {
            System.out.println("Ambos tamaños deben ser menor o igual que 10.");
        }
        System.out.println(estudiante.toString());
    }

    public static void removerEstudiante() {
        Cubiculos.eliminarEstudiante(estudiante);
    }
}
