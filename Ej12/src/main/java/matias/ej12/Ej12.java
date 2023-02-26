/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej12;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        String FDE = "&&&&&";
        int corr = 0;
        int incorr = -1;
        
        System.out.println("Ingrese tantas cadenas de 5 caracteres como desee."
                + "Cadenas de más o menos caracteres serán marcadas como incorrectas. Para finalizar ingrese &&&&&");
        
        do {
            
            cadena = leer.next();
                    
            if (cadena.length() <= 5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length()-1, cadena.length()).equalsIgnoreCase("O") ) {
                    
                    corr = corr + 1;
                    
                } else { 
                    
                    incorr = incorr + 1;
                    
                }

        } while (!cadena.equals(FDE));
        
        System.out.println("La cantidad de lecturas correctas fue de: " + corr);
        System.out.println("La cantidad de lecturas correctas fue de: " + incorr);
    }
}
