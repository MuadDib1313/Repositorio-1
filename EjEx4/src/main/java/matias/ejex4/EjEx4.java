/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex4;

/* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano. */

import java.util.*;


/**
 *
 * @author Matías Burán
 */
public class EjEx4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número del 1 al 10");
        int num = leer.nextInt();
        
        while (num <1 || num >10) {
            System.out.println("El número ingresado es inválido, por favor ingrese un número del 1 al 10");
            num = leer.nextInt();
        }
        System.out.println("El número ingresado es:" + num);
        switch (num) {
            case 1:
                System.out.println("Su equivalente en romano es: I");
                break;
            case 2:
                System.out.println("Su equivalente en romano es: II");
                break;
            case 3:
                System.out.println("Su equivalente en romano es: III");
                break;
            case 4:
                System.out.println("Su equivalente en romano es: IV");
                break;
            case 5:
                System.out.println("Su equivalente en romano es: V");
                break;
            case 6:
                System.out.println("Su equivalente en romano es: VI");
                break;
            case 7:
                System.out.println("Su equivalente en romano es: VII");
                break;
            case 8:
                System.out.println("Su equivalente en romano es: VIII");
                break;
            case 9:
                System.out.println("Su equivalente en romano es: IX");
                break;
            case 10:
                System.out.println("Su equivalente en romano es: X");
                break;
        }
    }
}
