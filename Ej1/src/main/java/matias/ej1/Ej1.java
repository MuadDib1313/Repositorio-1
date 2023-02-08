/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej1;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej1 {

    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);
      
        System.out.println("Escriba dos números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los números ingresados es: " + suma);
        
    }
}
