/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej13;

/* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * * 
*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los lados del cuadrado");
        
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            
            for (int j = 0; j < lado ; j++) {
                
                if (i == 0 || j == 0 || i == lado-1 || j == lado-1) {
                    
                    System.out.print("*");
                    
                } else {
                    
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
        }
        
    }
}
