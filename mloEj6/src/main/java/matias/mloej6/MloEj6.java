/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej6;

import java.util.*;

/**
 *
 * @author MSI Alpha
 */
public class MloEj6 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese dos números");
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25) {
            
            if (num2>25) {
                
                System.out.println("Los dos números ingresados son mayores a 25");
                
            }else {
                        
                System.out.println("El primer número ingresado es mayor a 25");  
                        }
            
        }else if (num2>25){

                System.out.println("El segundo número ingresado es mayor a 25");
        }else {
            
            System.out.println("Ninguno de los números ingresados es mayor a 25");
        }
    }
}
