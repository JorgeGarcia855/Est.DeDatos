package co.edu.unbosque.model;

public final class Estudiantes {
    private final String nombre;
    private final String apellido;
    private final long cedula;

    public Estudiantes(Builder builder) {
        nombre = builder.nombre;
        apellido = builder.apellido;
        cedula = builder.cedula;
    }

    public static class Builder {
        private String nombre, apellido;
        private long cedula;

        public  Builder nombre(String valor) {
            nombre = valor;
            return this;
        }
        public Builder apellido(String valor) {
            apellido = valor;
            return this;
        }
        public Builder cedula(long valor) {
            cedula = valor;
            return this;
        }
        public Estudiantes build(){
            return new Estudiantes(this);
        }
    }

    @Override
    public String toString() {
        return "Estudiante -> " + "Nombre: " + nombre  + " | Apellido: " + apellido + " | Cedula: " + cedula ;
    }

    public long getCedula() {
        return cedula;
    }
}
