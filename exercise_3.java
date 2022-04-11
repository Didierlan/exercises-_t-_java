/*
seguir la siguiente serire numerica 4, 56, 92, 144,180, 232
el ultimo numero no debe tener coma
Empesemos 56-4 = '52', 92-56 = '36', 144-92 = '52', 
Solucion 54 + 4 = 56 +36 = 92 + 52 = 144 + 36 = (180) + 52 = (232)
 */
package newejer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        
        int numSerie = 4; 
        List lista = new ArrayList();
        int cambio = 0; 
        
        while(numSerie <= 232){
            lista.add(numSerie); 
            if(cambio == 0){
                numSerie += 52;
                cambio = 1; 
            }else{
                numSerie += 36;
                cambio = 0; 
                
            }
            
        }
        
        System.out.println(lista);
        
        
         
        
    }

}
