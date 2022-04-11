/*
Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros
y la desplace N posiciónes en el arreglo: (N es digitado por el usuario)
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio10_Arrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        int desplazar;

        System.out.println("Ingresa los elementos al array");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = entrada.nextInt();

        }

        System.out.print("Dime cunatas pociones quieres mover: ");
        desplazar = entrada.nextInt();
        



        int aux;
        for (int i = 0; i < desplazar; i++) {
            for (int j = numeros.length - 1; j > 0; j--) {
                aux = numeros[j];
                numeros[j] = numeros[j - 1];
                numeros[j - 1] = aux;
            }
        }
        
        for (int i: numeros) {
            System.out.print(i + " ");
        }

    }

}
