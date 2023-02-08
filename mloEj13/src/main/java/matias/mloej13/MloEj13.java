/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej13;

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class MloEj13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] equipo = new String[6];
        
        for (int i = 0; i < equipo.length; i++) {
            
            System.out.println("Ingrese el " + (i+1) + "°" + " nombre");
            equipo[i] = leer.nextLine();
            
        }
        
        System.out.print("[");
        
        for (String elemento:equipo) {
            
            
            System.out.print(elemento);
            System.out.print(" ");
        }
        System.out.print("]");
        
        System.out.println("");
    }
}
