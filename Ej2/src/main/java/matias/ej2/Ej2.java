/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej2;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        
        String nombre = leer.nextLine();
        
        System.out.println("Tu nombre es " + nombre);

    }
}
