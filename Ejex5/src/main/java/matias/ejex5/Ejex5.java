/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex5;

/* Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
- Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ejex5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su tipo de socio");
        char socio =leer.next().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento a realizar");
        double costo = leer.nextDouble();
        
        if (socio == 'A' || socio == 'a') {
            System.out.println("El costo final de su tratamiento por ser socio tipo " + socio + "es de: " + costo*0.5);
        }else if(socio == 'B' || socio == 'b'){
            System.out.println("El costo final de su tratamiento por ser socio tipo " + socio + "es de: " + costo*0.65);
        }else{
            System.out.println("El costo final de su tratamiento por ser socio tipo " + socio + "es de: " + costo);
        }
    }
}
