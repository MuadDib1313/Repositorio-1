/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex7;

/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ejex7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a introducir");
        int n = leer.nextInt();
        int i = 0;
        int suma = 0;
        int min = 999999999;
        int max = 0;
        int num;
        
        System.out.println("Ingrese los números");
        /*while (i<n) {
            num=leer.nextInt();
            if (min>num) {
                min = num;
            }
            if (max<num) {
                max = num;
            }
            suma = suma + num;
            i++;
        }
        System.out.println("El número mínimo ingresado es: " + min);
        System.out.println("El número máximo ingresado es: " + max);
        System.out.println("El promedio de los números ingresados es: " + suma/n);*/
        
        do {
            num=leer.nextInt();
            if (min>num) {
                min = num;
            }
            if (max<num) {
                max = num;
            }
            suma = suma + num;
            i++; 
        } while (i<n);
        System.out.println("El número mínimo ingresado es: " + min);
        System.out.println("El número máximo ingresado es: " + max);
        System.out.println("El promedio de los números ingresados es: " + suma/n);
        
    }
}
