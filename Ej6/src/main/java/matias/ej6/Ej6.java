/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej6;

/*Crear un programa que dado un numero determine si es par o impar.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para saber si es par o impar");
        
        int num = leer.nextInt();
        
        if (num%2 == 0) {
            
            System.out.println("El número ingresado es par");
            
        } else{
            
            System.out.println("El número ingresado es impar");
        }

    }
}
