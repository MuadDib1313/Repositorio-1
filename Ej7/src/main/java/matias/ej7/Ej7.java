/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej7;

/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka") == true) {
            
            System.out.println("Correcto!");
            
        }else{
            
            System.out.println("Incorrecto :(");
        }
        
    }
}
