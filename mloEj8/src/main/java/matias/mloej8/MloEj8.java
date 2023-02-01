/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej8;

import java.util.Scanner;

/**
 *
 * @author Matías Burán
 */
public class MloEj8 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una nota");
        
        Scanner leer = new Scanner (System.in);
        
        int nota = leer.nextInt();
        
        while(nota<0 || nota>10) {
            
            System.out.println("La nota ingresada es incorrecta, por favor ingrese nuevamente");
            nota = leer.nextInt();
        }
        
    }
}
