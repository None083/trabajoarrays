/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer1 {

    /**
     * Leer numero por teclado -> int
     * Decir si es capicua
     * Int -> string
     * String -> char[]
     * empieza a recorrer el array por ambos extremos
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        
        String numeroString = Integer.toString(numero);
        
        char[] numeroChar = numeroString.toCharArray();
        
        
        
    }
    
    private static boolean esCapicua(char[] numeroChar){
        
        for (int i = 0; i < numeroChar.length; i++) {
            
        }
        
    }
    
}
