package main;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        LogicaClasificacion ejercicios = new LogicaClasificacion();
        Queue<String> colanombres = new LinkedList<>();
        colanombres.offer("Ana");
        colanombres.offer("Luis");
        colanombres.offer("Pedro");

        System.out.println("EJERCICIO UNO");
        System.out.println("Original: " + colanombres);
        Queue<String> invertirnombres = ejercicios.invertirColaNombres(new LinkedList<>(colanombres));
        System.out.println("Invertida: " + invertirnombres);

        Queue<String> colaletras = new LinkedList<>();
        colaletras.offer("r");
        colaletras.offer("a");
        colaletras.offer("d");
        colaletras.offer("a");
        colaletras.offer("r");

        System.out.println();
        System.out.println("EJERCICIO DOS");
        boolean esPalindromo = ejercicios.verificarPalindromoCola(colaletras);
        System.out.println("Entrada 1: " + colaletras);
        System.out.println("Es palíndromo -> " + esPalindromo);

        Queue<String> colaletras2 = new LinkedList<>();
        colaletras2.offer("c");
        colaletras2.offer("a");
        colaletras2.offer("s");
        colaletras2.offer("a");

        
        boolean esPalindromo2 = ejercicios.verificarPalindromoCola(colaletras2);
        System.out.println("Entrada 2: " + colaletras2);
        System.out.println("Es palíndromo -> " + esPalindromo2);
    }

}
