package test;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Queue;

import main.LogicaClasificacion;   

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicaClasificacionTest {

    LogicaClasificacion logica = new LogicaClasificacion();

    @Test
    void testInvertirColaNombres() {
        Queue<String> entrada = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> esperado = new LinkedList<>(Arrays.asList("Pedro", "Luis", "Ana"));
        Queue<String> resultado = logica.invertirColaNombres(entrada);
        assertEquals(esperado, resultado);

        // Probar con una cola vacía
        Queue<String> colaVacia = new LinkedList<>();
        Queue<String> resultadoVacio = logica.invertirColaNombres(colaVacia);
        assertEquals(new LinkedList<>(), resultadoVacio);

        // Probar con una cola de un solo elemento
        Queue<String> casoUnico = new LinkedList<>(Arrays.asList("Solo"));
        Queue<String> resultadoUnico = logica.invertirColaNombres(casoUnico);
        assertEquals(new LinkedList<>(Arrays.asList("Solo")), resultadoUnico);

        // Probar con una cola con elementos repetidos
        Queue<String> casoRepetidos = new LinkedList<>(Arrays.asList("Uno", "Repetido", "Repetido"));
        Queue<String> resultadoRepetidos = logica.invertirColaNombres(casoRepetidos);
        assertEquals(new LinkedList<>(Arrays.asList("Repetido", "Repetido", "Uno")), resultadoRepetidos);

        // Probar con una cola con elementos en mayúsculas y minúsculas
        Queue<String> casoMayusculas = new LinkedList<>(Arrays.asList("Ana", "luis", "PEDRO"));
        Queue<String> resultadoMayusculas = logica.invertirColaNombres(casoMayusculas);
        assertEquals(new LinkedList<>(Arrays.asList("PEDRO", "luis", "Ana")), resultadoMayusculas);

        // Probar con una cola con espacios en blanco
        Queue<String> casoEspacios = new LinkedList<>(Arrays.asList("  Ana", "Luis  ", "  Pedro  "));
        Queue<String> resultadoEspacios = logica.invertirColaNombres(casoEspacios);
        assertEquals(new LinkedList<>(Arrays.asList("  Pedro  ", "Luis  ", "  Ana")), resultadoEspacios);

    }

    @Test
    void testVerificarPalindromoCola() {
        // Casos positivos (son palíndromos)
        Queue<String> caso1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        Queue<String> caso2 = new LinkedList<>(Arrays.asList("l", "e", "v", "e", "l"));
        Queue<String> caso3 = new LinkedList<>(Arrays.asList("a"));

        assertTrue(logica.verificarPalindromoCola(caso1));
        assertTrue(logica.verificarPalindromoCola(caso2));
        assertTrue(logica.verificarPalindromoCola(caso3));

        // Casos negativos (no son palíndromos)
        Queue<String> caso4 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));
        Queue<String> caso5 = new LinkedList<>(Arrays.asList("p", "e", "r", "r", "o"));

        assertFalse(logica.verificarPalindromoCola(caso4));
        assertFalse(logica.verificarPalindromoCola(caso5));

        // Probar con una cola vacía (considerada palíndromo)
        Queue<String> colaVacia = new LinkedList<>();
        assertTrue(logica.verificarPalindromoCola(colaVacia));
        // Probar con una cola de un solo elemento (considerada palíndromo)
        Queue<String> casoUnico = new LinkedList<>(Arrays.asList("x"));
        assertTrue(logica.verificarPalindromoCola(casoUnico));

        // Probar con una cola con elementos repetidos que forman un palíndromo
        Queue<String> casoRepetidos = new LinkedList<>(Arrays.asList("a",
                "b", "b", "a"));
        assertTrue(logica.verificarPalindromoCola(casoRepetidos));
        // Probar con una cola con elementos en mayúsculas y minúsculas
        Queue<String> casoMayusculas = new LinkedList<>(Arrays.asList("A", "n", "a", "a", "n", "A"));
        assertTrue(logica.verificarPalindromoCola(casoMayusculas));
    }
}
