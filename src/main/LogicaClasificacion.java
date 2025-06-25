package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pilanombres = new Stack<>();

        while (!cola.isEmpty()) {
            pilanombres.push(cola.poll());
        }
        
        Queue<String> colaInvertida = new LinkedList<>();
        
        while (!pilanombres.isEmpty()) {
            colaInvertida.offer(pilanombres.pop());
        }

        return colaInvertida;
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        Queue<String> aux = new LinkedList<>();

        while (!cola.isEmpty()) {
            String letra = cola.poll();
            pila.push(letra);
            aux.offer(letra);
        }

        while (!aux.isEmpty()) {
            cola.offer(aux.poll());
        }

        for (String letra : cola) {
            if (!letra.equals(pila.pop())) {
                return false;
            }
        }

        return true;
    }

}
