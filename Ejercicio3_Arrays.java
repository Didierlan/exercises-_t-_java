/*
Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
realizar la media de los números positivos, la media de los negativos y conteo 
el número de ceros.
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio3_Arrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float suma_positivos = 0, Suma_Negativos = 0, media_positivos, media_Negativos;
        int contar_positivos = 0, contar_Negativos = 0, contar_ceros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + " :");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0) {
                contar_ceros++;
            } else if (numeros[i] > 0) {
                suma_positivos += numeros[i];
                contar_positivos++;

            } else {
                Suma_Negativos += numeros[i];
                contar_Negativos++;
            }

        }

        //Sar media de los positivos
        if (contar_positivos == 0) {
            System.out.println("No se puede por que no hay positvos");
        } else {
            media_positivos = suma_positivos / contar_positivos;
            System.out.println(media_positivos);
        }

        if (contar_Negativos == 0) {
            System.out.println("No se puede por que no hay negativos");
        } else {
            media_Negativos = Suma_Negativos / contar_Negativos;
            System.out.println(media_Negativos);
        }

        if (contar_ceros == 0) {
            System.out.println("No se puede por que no hay ceros");
        } else {

            System.out.println(contar_ceros);
        }

    }

}
