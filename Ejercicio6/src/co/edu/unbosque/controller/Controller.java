package co.edu.unbosque.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Controller {
    private static final Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Controller() {
        userInterface();
    }

    public void userInterface() {
        System.out.print("Ingrese cantidad de comandos: ");
        int cantidad = scan.nextInt();
        System.out.print("Ingrese cantidad de letras: ");
        int charAmount = scan.nextInt();
        int i = 0;
        do {
            if (charAmount<=30 && cantidad<=1000000) {
                System.out.println("Ingrese letras: ");
                String tre = scan.next();
                char[] arr = tre.replaceAll(" ", "").toCharArray();
                Stream<Character> charArr =  new String(arr).chars().mapToObj(ch -> (char) ch);
                System.out.println("Ingrese condiciones: ");
                String[] cond = scan.next().split(" ");

                if (arr.length<=charAmount) {
                    if (Arrays.stream(cond).allMatch(s -> s.contains("<"))) {
                        Arrays.stream(cond)
                                .flatMap(Pattern.compile("<")::splitAsStream)
                                .distinct()
                                .sorted()
                                .forEach(s -> System.out.print(s + " "));
                        System.out.println();
                    } else if (Arrays.stream(cond).allMatch(s -> s.contains(">"))) {
                        Arrays.stream(cond)
                                .flatMap(Pattern.compile(">")::splitAsStream)
                                .distinct()
                                .sorted()
                                .forEach(s -> System.out.print(s + " "));
                        System.out.println();
                    } else if (Arrays.stream(cond).anyMatch(s -> s.contains("<")) && Arrays.stream(cond).anyMatch(s -> s.contains(">"))) {
                        Arrays.stream(cond)
                                .flatMap(Pattern.compile(">")::splitAsStream)
                                .flatMap(Pattern.compile("<")::splitAsStream)
                                .distinct()
                                .sorted()
                                .forEach(s -> System.out.print(s + " "));
                        System.out.println();
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
            i++;
        } while (i<cantidad);
    }


    public static void getInstance() {
        new Controller();
    }
}
