/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas
en una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */
package arreglos;

import java.util.Scanner;

public class Ejercio5_Arrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //inicimos los arrays
        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digite los elementos del primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            a[i] = entrada.nextInt();

        }

        System.out.println("\nDigite los elementos del segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) +  ": ");
            b[i] = entrada.nextInt();

        }
        
        //hacemos la mezcla de el arreglo a y b y lo guardamos en c
        int mezcla = 0; 
        for (int i = 0; i < 10; i++) {
            c[mezcla] = a[i]; 
            mezcla++; 
            c[mezcla] = b[i]; 
            mezcla++; 
            
        }
        
        /*for (int i = 0; i < 20; i++) {
            System.out.print(c[i]);
            
        }
        System.out.println("");
*/
        
        for(int M: c){
            System.out.print(M + " ");
            
        }
        System.out.println("");
        

            

    }

}
