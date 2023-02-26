/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej16;

import java.util.Scanner;

/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */

/**
 *
 * @author Matías Burán
 */
public class Ej16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int [N];
        
        System.out.println("Indique qué numero quiere buscar");
        int buscar = leer.nextInt();
        
        rellenar(vector,N,buscar);
        
    }
    
    public static void rellenar (int[] vector, int N, int buscar) {
        
        int contador = 0;
        
        for (int i = 0; i < N; i++) {
            
            vector[i] =(int) (Math.random()*10);
                        
        }
        
        for (int i = 0; i < N; i++) {
            
            if (vector[i] == buscar) {
                
                contador = contador + 1;
                System.out.println("El número ingresado se encuentra en la posición " + i);
                
            }
            
        }
        
        System.out.println("El número ingresado se repite " + contador + " veces");
    }
            
}
