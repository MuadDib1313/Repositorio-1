/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex6;

/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ejex6 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        double sumatot = 0;
        double sumamenor = 0;
        int contador = 0;
        
        System.out.println("Ingrese la cantidad de personas a analizar");
        int pers = leer.nextInt();
        System.out.println("Ingrese las estaturas de cada persona");
        for (int i = 0; i < pers; i++) {
            double altura = leer.nextDouble();
            sumatot = sumatot + altura;
            if (altura < 1.6) {
                sumamenor = sumamenor + altura;
                contador = contador + 1;
            }
        }
        System.out.println("El promedio de las alturas ingresadas es: " + sumatot/pers);
        System.out.println("El promedio de las alturas debajo de 1.60 metros es: " + sumamenor/contador);
    }
}
