package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class Cubiculos {
    private static final ArrayList<Estudiantes> estudiantes = new ArrayList<>();
    private Cubiculos() {}

    public static void ingresarEstudiante(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public static void eliminarEstudiante(Estudiantes estudiante) {
        estudiantes.remove(estudiante);
    }

    public static List<Estudiantes> obtenerEstudiantes(){
        return estudiantes.stream()
            .filter(soloValorUnico(estudiantes -> List.of(estudiantes.getCedula())))
            .collect(Collectors.toList());
    }

    private static <T> Predicate<T> soloValorUnico(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
