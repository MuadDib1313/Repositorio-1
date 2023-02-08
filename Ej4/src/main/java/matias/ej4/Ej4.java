/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej4;

/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej4 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centígrados a convertir");
        
        double gradosC = leer.nextDouble();
        
        double gradosF = 32 + (9*gradosC/5);
        
        System.out.println("Los grados centígrados ingresados son:" + gradosC);
        System.out.println("Los grados Farenheit correspondientes son: " + gradosF);

    }
}
