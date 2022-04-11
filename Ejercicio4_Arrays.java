package arreglos;

/*
Leer 10 numero enteros guardados ern un arreglodebemos mostrar el siguiente orden 
el primero , el ultimo, el segundo, penultimo etc
 */
import java.util.Scanner;

public class Ejercicio4_Arrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + " :");
            numeros[i] = entrada.nextInt();

        }
        
        int decremetar = 9; 

        for (int j = 0; j < 10; j++) {

            if (decremetar == 4) {
                break;
            } else {

                System.out.println(numeros[j]);
                System.out.println(numeros[decremetar]);
                decremetar -= 1;
            }

        }

        /*
        
        ESTA SI FUNCIONA
        for (int i = 0; i < 5; i++) {
            if(i == 0){
                System.out.println(numeros[i]);
            }else if(i == 1){
                 System.out.println(numeros[4]);
            }else if(i == 2){
                 System.out.println(numeros[1]);
                 
            }else if(i == 3){
                System.out.println(numeros[i]);
            }else{
                System.out.println(numeros[2]);
            }
                
            
        }
         */

    }
}
