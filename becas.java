package newejer;

import java.util.Scanner;

public class becas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas calificaciones desea ingresar: ");
        int casillas = entrada.nextInt();

        int Notas[] = new int[casillas];
        String Names[] = new String[casillas];

        for (int i = 0; i < casillas; i++) {
            entrada.nextLine(); 
            System.out.print("Ingrese nombre " + (i + 1) + ": ");
            Names[i] = entrada.nextLine();
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            Notas[i] = entrada.nextInt();

        }

        for (int i = 0; i < Notas.length - 1; i++) {
            for (int j = 0; j < Notas.length - 1; j++) {
                if (Notas[j] < Notas[j + 1]) {
                    int auxNotas = Notas[j];
                    Notas[j] = Notas[j + 1];
                    Notas[j + 1] = auxNotas;
                    String auxNames = Names[j];
                    Names[j] = Names[j + 1];
                    Names[j + 1] = auxNames;

                }

            }

        }

        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 8) {
                System.out.println(Names[i] + " con " + Notas[i] + " tiene derecho a beca");

            } else {
                System.out.println(Names[i] + " con " + Notas[i] + " NOOOO tiene derecho a beca");
            }

        }

    }

}
