
package newejer;

//dado un numero imprimir sus antesesores

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un valor int");
        int valor = entrada.nextInt(); 
        
        //Esta es un lista 
        List lista = new ArrayList();
        
        
        
        while(valor >= 0){
            lista.add(valor); 
            valor += -1; 
        }
        
        System.out.println(lista);
                
               
    }
    
}
