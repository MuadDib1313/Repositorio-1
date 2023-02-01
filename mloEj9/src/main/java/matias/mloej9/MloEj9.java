/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej9;

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class MloEj9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        int i = 0;
        int num;
        
        do {
            
            System.out.println("Escriba un número");
            num = leer.nextInt();
            
            if (num>0){
                
                suma = suma + num;
            }
            
            i++;
            
        }while (num!=0 && i<20);
        
        System.out.println("Cero capturado, la suma de los números ingresados es " + suma);
    }
}
