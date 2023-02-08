/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej11;

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class MloEj11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
        
        String retorno = frase2(frase);
        
        System.out.println(retorno.concat("."));
                
    }
    
    public static String frase2 (String frase) {
            
        frase = frase.replace('a', '@');
        frase = frase.replace('e','#');
        frase = frase.replace('i','$');        
        frase = frase.replace('o','%');        
        frase = frase.replace('u','*');
    
        /* fallas de este método: 
        1- No funciona con mayúsculas
        2- Es muy largo, debería haber otro método que ocupe menos líneas de código*/
        
        return frase;
    }
}
    
