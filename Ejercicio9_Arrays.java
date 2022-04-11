/*
Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros
y la desplace una posición hacia abajo o adelante: el primero pasa a ser el segundo, el segundo 
pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero en el array.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio9_Arrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int ultimo_elemt; 

        System.out.println("Ingrese los elementos al arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = entrada.nextInt(); 

        }
        
        ultimo_elemt = numeros[9]; 
        
        for (int i = 8; i >=0; i--) { //Avanzamos una posicion asia delante o abajo en el array
            numeros[i+1] = numeros[i]; 
            
        }
        
        numeros[0] = ultimo_elemt; 
        
        for(int i:numeros){
            System.out.print("\n" + i + " ");
        }

    }

}
