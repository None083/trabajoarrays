/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author noelia
 */
public class Ejer2 {

    /**
     * Rellenar un array char desde 'A' a 'Z' (mayúsculas) Generar un tamaño
     * aleatorio entre 15 y 25 Crear un array de ese tamaño y rellenarlo con
     * posiciones válidas aleatorias
     */
    public static void main(String[] args) {

        final int TAMAÑO = 26;

        char[] letras = new char[TAMAÑO];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) (65 + i);
            System.out.print(letras[i]);
        }
        System.out.println();

        Random aleatorio = new Random();
        int tamañoAleatorio = aleatorio.nextInt(11) + 15;
        char[] letras2 = new char[tamañoAleatorio];
        for (int i = 0; i < letras2.length; i++) {
            letras2[i] = letras[aleatorio.nextInt(letras.length)];
            System.out.print(letras2[i]);
        }
        //había que generar varios string, no solo uno, pidiendose por teclado

    }

}
