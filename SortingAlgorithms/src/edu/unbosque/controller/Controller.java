package edu.unbosque.controller;

import edu.unbosque.model.Sorters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {

    public Controller() {
        inicarOrdenamiento();
        //duracionOrdenamiento();
    }

    public void inicarOrdenamiento() {
        int[] arreglo = new int[]{5, 6, 7, 2, 4, 1, 7};
        System.out.println(Arrays.toString(arreglo));
        //Sorters.mergeSort(arreglo, 0, arreglo.length-1);
        Sorters.selectionSort(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }

    public void duracionOrdenamiento() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Shuffle array
        Collections.shuffle(List.of(array));

        // Print shuffled collection
        for (int j : array) {
            System.out.println(j);
        }

        long startTime = System.nanoTime();
        Sorters.mergeSort(array, 0, array.length-1);
        long endTime = System.nanoTime();

        // Print sorted collection
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println();

        // Print runtime in nanoseconds
        System.out.println("Merge Sort runtime: " + (endTime - startTime));
    }
}
