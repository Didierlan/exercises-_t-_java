package arreglos;

import java.util.Scanner;

/*Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos
en el mismo orden que ingresaron.
*/

public class Ejercicio1_Arrays {
    public static void main(String[] args) {
        
     Scanner entrda = new Scanner(System.in); 
     float[] numeros = new float[5]; 
     
        for (int i = 0; i <5; i++) {
            System.out.print("Ingresa el numero "+  (i +1) +" :");
            numeros[i] = entrda.nextFloat(); 
            
        }
        
        for(float i:numeros){
            System.out.println(i);
        }
     
        
        
    }

}
