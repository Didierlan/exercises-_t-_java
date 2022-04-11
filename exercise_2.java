/*
seguir la siguiente serire numerica 1,9,25,49,?,?,
empesemos 
49 -25 = 24 , 25-9 = 16 , 9-1 = 8 
la secuencia es que por cada numero se le debe sumar 8
8+1 =9, 8+8 = 16 + 9 = 25, 16+8 = 24 + 25 = 49, 24 + 8 = 32+ 49 = 81 .......
 */
package newejer;

import java.util.ArrayList;
import java.util.List;

public class exercise_2 {

    public static void main(String[] args) {

        int numSerie = 1;
        int valor_incremetable = 8;
        int contador = 0;
        //int conatdor = 7; 

        List listaN = new ArrayList();
        
        while(contador < 7){
            listaN.add(numSerie); 
            numSerie += valor_incremetable; 
            valor_incremetable += 8; 
            contador++; 
            
        }
        
        System.out.println(listaN);
                
    
    }

}
