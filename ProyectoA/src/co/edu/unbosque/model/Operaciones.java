package co.edu.unbosque.model;

import java.util.Scanner;

public class Operaciones {
    private static final Scanner scan = new Scanner(System.in);
    private static final Estudiantes.Builder crearEstudiante = new Estudiantes.Builder();

    public static void nuevoEstudiante() {

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

            System.out.print("Ingrese su cedula: ");
            long cedula = scan.nextLong();
            int size = Casilleros.obtenerEstudiantes().size();
            int cedLength = String.valueOf(cedula).length();
            Estudiantes estudiante;
            if (cedLength >= 1 && cedLength <= 10) {
                for (int i = 0; i < size; i++) {
                    Estudiantes.Builder crearCedula = new Estudiantes.Builder();
                    Estudiantes cedulaNueva = crearCedula.cedula(cedula).build();
                    if (Casilleros.obtenerEstudiantes().contains(cedulaNueva)) {
                        System.out.println("La cedula debe ser unica");
                    } else {
                        estudiante = crearEstudiante.cedula(cedula).build();
                        Casilleros.ingresarEstudiante(estudiante);
                        System.out.println(estudiante.toString());
                    }
                }
                break;
            } else {
                System.out.println("Numero Invalido");
            }
        }
    }
}
