/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej14;

/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a cambiar");
        
        double eur = leer.nextDouble();
        
        System.out.println("Ingrese la moneda a convertir \n 1. Libras \n 2. Dólares \n 3. Yenes");
        
        int cambio = leer.nextInt();
        
        exchange(eur, cambio);
        
    }
    
    public static void exchange(double eur, int cambio){
        
        switch (cambio) {
            case 1:
                System.out.println("€" + eur + " equivalen a " + (eur*0.86) + " libras");
                break;
            case 2:
                System.out.println("€" + eur + " equivalen a " + (eur*1.28611) + " dólares");
                break;
            case 3:
                System.out.println("€" + eur + " equivalen a " + (eur*129.852) + " yenes");
                break;
                
        }
        
    }
   
}
