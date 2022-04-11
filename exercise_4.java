/*
seguir la siguiente serire numerica 99, 90, 83,78,?,?
el ultimo numero no debe tener coma
Empesemos 99-9 = 90, 90-83 = 7, 83-78 = 5, 78-3 = 75, 75-1 = 74  
Solucion solucion 9-2 =,7-2 =,5-2 =,3-2=,1
debemos restar -2 en cada posicion 
 */
package newejer;

import java.util.ArrayList;
import java.util.List;

public class exercise_4 {
    public static void main(String[] args) {
        
        
        int numSerie = 99;
        List lista = new ArrayList();
        int resta = 9; 

        while(resta >= -1){
            lista.add(numSerie);
            numSerie -= resta; 
            resta += -2; 
            
            
        }
        
        System.out.println(lista);
    }
    
}
