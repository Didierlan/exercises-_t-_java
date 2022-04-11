/*
Realizar la suma de dos numero y mostrar el resulatado,"condicion" 
 el usuario decide cuando dejar de sumar
 */
package newejer;

import java.util.Scanner;

public class exercise_5 {

    public static void main(String[] args) {
        int opcion = 1;
        Scanner entrada = new Scanner(System.in);

        while (opcion != 0) {
            System.out.print("Ingrse el 1 valor: ");
            int num1 = entrada.nextInt(); 
            System.out.print("Ingrse el 2 valor: ");
            int num2 = entrada.nextInt(); 
            
            int r = num1 + num2; 
            System.out.println("El resultado de la suma es: " + r);
            System.out.print("Desea continiar '1.yes' '0.No --> '");
            opcion = entrada.nextInt(); 
            
            

        }
        System.out.println("Fin del programa");

    }

}
