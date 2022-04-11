/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos
en el orden inverso en el que ingresaron
 */
package arreglos;

import java.util.Scanner;


public class Ejercicio2_Arrays {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        float[] numeros = new float[5]; 
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el numero "+  (i +1) +" :");
            numeros[i] = entrada.nextFloat(); 
            
        }
        
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println(numeros[i]);
            
        }
        
    }
}
