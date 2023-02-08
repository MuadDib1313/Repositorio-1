/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej8;

/*Realizar un programa que permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra de 8 de largo (Importante: los espacios cuentan!");
        
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            
            System.out.println("CORRECTO");
            
        }else{
            
            System.out.println("INCORRECTO");
        }
        
    
    }
}
