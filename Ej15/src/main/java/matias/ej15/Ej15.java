/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej15;

import java.util.Scanner;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */

/**
 *
 * @author Matías Burán
 */
public class Ej15 {

    public static void main(String[] args) {

       int[] vector = new int [100];
       
        for (int i = 99 ; i > -1 ; i--) {
            
            vector[i] = i+1;
            System.out.println("[" + vector[i] +"]");
        }
    
    }
}
