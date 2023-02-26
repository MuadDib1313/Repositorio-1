/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej10;

/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número límite positivo");
        
        int lim = leer.nextInt();
        
        int suma = 0;
        
        do{
            
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            
            suma = suma + num;
            
        }while(suma <= lim);
        
        System.out.println("La suma de los números introducidos superó el límite inicial");

    }
}
