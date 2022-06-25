package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Casilleros {
    private static final List<Estudiantes> estudiantes = new ArrayList<>();

    public static void ingresarEstudiante(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public static void eliminarEstudiante(Estudiantes estudiante) {
        estudiantes.remove(estudiante);
    }

    public static List<Estudiantes> obtenerEstudiantes(){
        return estudiantes;
    }

}
