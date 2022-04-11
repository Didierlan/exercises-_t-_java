package newejer;
//Dada una lista de numero desordenados entregarla ordenada

import java.util.Scanner;

public class burbuja {

    public static void main(String[] args) {
        
        int aux = 0; 
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los valores del arreglo: ");
        int casillas = entrada.nextInt(); 
        
        int array [] = new int[casillas]; 
        
        for (int i = 0; i < casillas; i++) {
            System.out.print("Ingresa el # " + (i +1) +" valor desordenado: ");
            array[i] = entrada.nextInt(); 
            
        }
        
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j +1]) {
                    aux = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = aux; 
                    
                }
                
            }
            
        }
        
        
        
        for (int i:array){
            System.out.print( i + " ");
            
        }
        

    }

}
