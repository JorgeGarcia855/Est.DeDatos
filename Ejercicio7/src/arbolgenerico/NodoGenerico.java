package arbolgenerico;

import java.util.ArrayList;
import java.util.List;

public class NodoGenerico<T> {
    private T dato;
    private final List<NodoGenerico<T>> hijos = new ArrayList<>();

    public NodoGenerico(T dato) {
        this.dato = dato;
    }

    public void insertar(NodoGenerico<T> hijo) {
        hijos.add(hijo);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public List<NodoGenerico<T>> getHijos() {
        return hijos;
    }

    @Override
    public String toString() {
        return getDato().toString();
    }
}
