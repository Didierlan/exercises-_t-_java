/*
Ejercicio 8: declarar una array de 10 elementos leer por teclado 9 números enteros,
despues se debe pedir un numero y una posicion, insertarlo en la pocicion indicada, desplazando
los que esten detras
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercico8_Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];
        int nuevo = 0;
        int po = 0;

        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < 9; i++) {

            System.out.print("Ingrese el elemento " + (i) + ": ");
            num[i] = entrada.nextInt();

        }

        System.out.println("Ingrese el nuevo numero: ");
        nuevo = entrada.nextInt();

        System.out.println("Ingrese la pocicion donde desea colocarlo: ");
        po = entrada.nextInt();
        System.out.println("");

        int avanzar = 0;
        int mover = 0; 
        for (int i = 0; i < 10; i++) {
            if (i == po) {
                avanzar = num[i];
                num[i] = nuevo;

            }

        }

        if (avanzar != 0) {
            for (int i = po + 1; i < 10; i++) {

                mover = num[i]; 
                num[i] = avanzar;
                avanzar = mover; 
            }

        }
        
        for (int i:num) {
            System.out.print(i + " ");
            
        }

    }

}


