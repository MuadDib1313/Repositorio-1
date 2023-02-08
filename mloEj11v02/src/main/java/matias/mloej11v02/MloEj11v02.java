/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej11v02;

import java.util.*;
/**
 *
 * @author Matías Burán
 */
public class MloEj11v02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
 
        String retorno = frase2(frase);
        
        System.out.println(retorno.concat("."));

    }
    
    public static String frase2 (String frase) {
        
        String cambioFrase = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            String subCadena = frase.substring(i,(i+1));
            
            switch (subCadena){
                
                case "a":
                case "A":
                    cambioFrase = cambioFrase.concat("@");
                    break;
                case "e":
                case "E":
                    cambioFrase = cambioFrase.concat("#");
                    break;
                case "i":
                case "I":
                    cambioFrase = cambioFrase.concat("$");
                    break;
                case "o":
                case "O":
                    cambioFrase = cambioFrase.concat("%");
                    break;
                case "u":
                case "U":
                    cambioFrase = cambioFrase.concat("*");
                    break;
                default: 
                    cambioFrase = cambioFrase.concat(frase.substring(i,(i+1)));

            }
       
        }
        
        return cambioFrase;
    }
}
