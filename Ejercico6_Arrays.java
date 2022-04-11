/*
Leer por teclado dos tablas de 12 números enteros y mezclarlas
en una tercera de la forma: 3º de A, y 3ºde B,  etc.
 */
package arreglos;

public class Ejercico6_Arrays {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        int[] b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        int[] c = new int[24];

        int m = 0;
        for (int i = 0; i < 12; i++) {
            c[m] = a[i];
            m++;
            c[m] = a[i + 1];
            m++;
            c[m] = a[i + 2];
            m++;
            c[m] = b[i];
            m++;
            c[m] = b[i + 1];
            m++;
            c[m] = b[i + 2];
            m++; 

            i += 2;
        }
        
        for(int i:c){
            System.out.print(i + " ");
        }
        System.err.println("");

    }

}
