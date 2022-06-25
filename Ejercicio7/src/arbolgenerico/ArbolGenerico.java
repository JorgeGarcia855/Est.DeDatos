package arbolgenerico;

import java.util.ArrayList;
import java.util.List;

public class ArbolGenerico<T> {
    private NodoGenerico<T> raiz;

    public List<NodoGenerico<T>> crearArbol(Recorrido recorrido){
        List<NodoGenerico<T>> result = null;
        if (raiz != null) result = crearArbol(raiz, recorrido);
        return result;
    }

    public List<NodoGenerico<T>> crearArbol(NodoGenerico<T> nodo, Recorrido recorrido){
        List<NodoGenerico<T>> nodoRecorrido = new ArrayList<>();
        if (recorrido == Recorrido.PREORDEN) preOrden(nodo, nodoRecorrido);
        else if (recorrido == Recorrido.POSTORDEN) postOrden(nodo, nodoRecorrido);
        return nodoRecorrido;
    }

    private void preOrden(NodoGenerico<T> nodo, List<NodoGenerico<T>> nodoRecorrido) {
        nodoRecorrido.add(nodo);
        for (NodoGenerico<T> hijo : nodo.getHijos())
            preOrden(hijo, nodoRecorrido);
    }

    private void postOrden(NodoGenerico<T> nodo, List<NodoGenerico<T>> nodoRecorrido) {
        for (NodoGenerico<T> hijo : nodo.getHijos())
            postOrden(hijo, nodoRecorrido);
        nodoRecorrido.add(nodo);
    }

    public NodoGenerico<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoGenerico<T> raiz) {
        this.raiz = raiz;
    }
}
