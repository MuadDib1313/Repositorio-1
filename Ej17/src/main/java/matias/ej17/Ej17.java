/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej17;

/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

import java.util.*;
/**
 *
 * @author Matías Burán
 */
public class Ej17 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos del vector");
        int N = leer.nextInt();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        int[] vector = new int[N];   
         
        for (int i = 0; i < N; i++) {
            
            vector[i]=(int)(Math.random()*100000);
            
            if ((vector[i]/10) <1) {
                
                cont1++;
                
            }else if((vector[i]/10) >= 1 && (vector[i]/10) <10){
                
                cont2++;
                
            }else if((vector[i]/100) >= 1 && (vector[i]/100) <10){
                
                cont3++;
       
            }else if((vector[i]/1000) >= 1 && (vector[i]/1000) <10){
                
                cont4++;
                
            }else if((vector[i]/10000) >= 1 && (vector[i]/10000) <10){
                
                cont5++;
                
            }
        }
        
        System.out.println("La cantidad de números de un dígito es: " + cont1);
        System.out.println("La cantidad de números de dos dígitos es: " + cont2);
        System.out.println("La cantidad de números de tres dígitos es: " + cont3);
        System.out.println("La cantidad de números de cuatro dígitos es: " + cont4);
        System.out.println("La cantidad de números de cinco dígitos es: " + cont5);

    }     
}
