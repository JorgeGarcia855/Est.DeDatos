package main.controller;

import java.util.Scanner;

public class Actividad1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escriba el primer lado");
        int lado1 = scanner.nextInt();
        System.out.println("Escriba el segundo lado");
        int lado2 = scanner.nextInt();
        System.out.println("Escriba el tercer lado");
        int lado3 = scanner.nextInt();
        scanner.close();
        System.out.println(tipoDeTriangulo(lado1, lado2, lado3));
    }

    public static String tipoDeTriangulo(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            return "Todos los lados deben ser mayor que cero";
        } else {
            if ((a == c) && (b == c)) {
                return "El triangulo es equilátero";
            } else if ((a == b) || (b == c) || (a == c)) {
                return "El triangulo es isosceles";
            } else {
                return "El triangulo es escaleno";
            }
        }
    }
}
