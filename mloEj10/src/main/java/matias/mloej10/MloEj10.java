/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej10;

import java.util.*;
/**
 *
 * @author Matías Burán
 */
public class MloEj10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cuatro números entre 1 y 20");
        
        for (int i = 0; i < 4; i++) {
            
            int num = leer.nextInt();
            
            if (num<1 || num>20){
                
                System.out.println("El número ingresado es incorrecto, por favor inténtelo de nuevo");
            }else{
                
                System.out.print(num);
            
                for (int j = 0; j < num; j++) {
                    
                    System.out.print("*");
                    
                }
            }
        }
    }
}
