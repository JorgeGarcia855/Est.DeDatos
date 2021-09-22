package main.controller;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Actividad2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese valores del punto A(X1 y Y1 respectivamente)");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Ingrese valores del punto B(X2 y Y2 respectivamente)");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(distancia(x1,y1,x2,y2));
    }

    public static String distancia(int x1, int y1, int x2, int y2){
        DecimalFormat decimal = new DecimalFormat("#.##");
        double resul = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return "La distancia del punto A al punto B es de: "+ decimal.format(resul);
    }
}
