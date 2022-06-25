package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CRUD {
    private static final List<Integer> intList = new ArrayList<>();
    private CRUD() {}

    public static void addInt(int n) {
        intList.add(n);
    }

    public static String deleteInt() {
        return intList.size() == 0 ? "La lista esta vacia" : "Elemento eliminado: "+intList.remove(intList.size()-1);
    }

    public static String getMaxIntFromList() {
        return intList.size() == 0 ? "La lista esta vacia" : "Elemento mas grande: "+Collections.max(intList);
    }
}
