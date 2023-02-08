/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.mloej12;

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class MloEj12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);

    }

    public static void EsMultiplo (int num1,int num2){
        
        int resto = num1%num2;
        
        if(resto==0){
            
            System.out.println(num1 + " es múltiplo de " + num2);
            
        }else{
            
            System.out.println("Los números no son múltiplos");
        }
    }
}
