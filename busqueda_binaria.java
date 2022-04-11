package newejer;

/*Algoritmo burbuja para oordenar el array ya un requerimiento del algoritmo busqueda
binaria dice que el arreglo o lista debe estar ordenada.
*/


import java.util.Scanner;

public class busqueda_binaria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos valores desea: ");
        int casillas = entrada.nextInt();

        int Numeros[] = new int[casillas];

        for (int i = 0; i < Numeros.length; i++) {
            entrada.nextLine();
            System.out.print("Ingresa el # " + (i + 1) + " valor desordenado: ");
            Numeros[i] = entrada.nextInt();

        }

        int aux = 0;

        for (int i = 0; i < Numeros.length - 1; i++) {
            for (int j = 0; j < Numeros.length - 1; j++) {
                if (Numeros[j] > Numeros[j + 1]) {
                    aux = Numeros[j];
                    Numeros[j] = Numeros[j + 1];
                    Numeros[j + 1] = aux;

                }

            }
        }

        for (int i : Numeros) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Que valor desea encontrar");
        int valor = entrada.nextInt();

        int aP1 = 0;
        int aP2 = Numeros.length - 1;
        int aPM = 0;
        boolean bandera = false;

        while (aP1 <= aP2) {

            aPM = (aP1 + aP2) / 2;

            if (valor == Numeros[aPM]) {
                System.out.print("El valor se encontro en la posicion # " + aPM);
                bandera = true;
                break;

            }
            if (valor > Numeros[aPM]) {
                aP1 = aP1 + 1;

            }
            if (valor < Numeros[aPM]) {
                aP2 = aP2 + 1;

            }

        }

        if (bandera == true) {

        } else {
            System.out.println("No se encontro el numero");
        }

    }

}
