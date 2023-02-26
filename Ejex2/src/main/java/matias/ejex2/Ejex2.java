/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ejex2;

/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ejex2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int A,B,C,D,aux;
        
        System.out.println("Ingrese los valores de las variables");
        
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        
        System.out.println("Los valores ingresados son: " + A + " " + B + " " + C + " " + D);
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
        System.out.println("Los valores finales son: " + A + " " + B + " " + C + " " + D);
        
    }
}
