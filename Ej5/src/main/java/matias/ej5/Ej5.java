/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej5;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        
        int num = leer.nextInt();
        double num2 = num;
        
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num2);
        
        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("La raíz cuadrada del número ingresado es: " + raiz);
    }
}
