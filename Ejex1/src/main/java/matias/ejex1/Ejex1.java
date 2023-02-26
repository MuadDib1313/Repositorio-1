/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex1;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ejex1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos");
        int min = leer.nextInt();   
        int dia =0;
        int hora = 0;
        conversion(min,dia,hora);
    }
    
    public static void conversion(int min,int dia,int hora){
        
        hora=min/60;
        
        while (hora>24) {
            dia=dia+1;
            hora=hora-24;
        } 

        System.out.println("Los minutos ingresados corresponden a " + dia + " días y " + hora + " horas");
    
    }    
}
