/*
Ejercicio 7: Leer por teclado una serie de 10 números enteros.
La aplicación debe indicarnos si los números están ordenados de forma creciente,
decreciente, desordenados o si son iguales.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio7_Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean creciente = false, decresiente = false;

        

        int[] numeros = new int[10]; 
        
        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < 10; i++) {
             System.out.print("Ingrese el elemento " + (i + 1) + ": ");
             numeros[i] = entrada.nextInt(); 
            
        }
        
        
        
        for (int i = 0; i < 9; i++) {
            //en este evalualremos si esta de forma crecinte
            if (numeros[i] < numeros[i + 1]) { //Ejemplo: 1,2,3,4,5....
                creciente = true;
            }
            if (numeros[i] > numeros[i + 1]) { //Ejemplo 5,4,3,2,1
                decresiente = true;
            }
        }

        if (creciente == true && decresiente == false) {
            System.out.println("\nEl arreglo es creciente");

        }
        else if (creciente == false && decresiente == true) {
            System.out.println("\nEl arreglo es decreciente ");

        }
        else if (creciente == true && decresiente == true) {
            System.out.println("\nEl arreglo es desordenado");
        }
        else if (creciente == false && decresiente == false) {
            System.out.println("\nEl arreglo es igual ");

        }

    }

}
