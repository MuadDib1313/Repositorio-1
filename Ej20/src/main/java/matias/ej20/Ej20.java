/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej20;

/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej20 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [3][3];
        int num;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        int suma6 = 0;
        int sumadiag = 0;
        
        System.out.println("Ingrese los números de la matriz");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = leer.nextInt();
                while ((num<1 || num>9)){
                    System.out.println("El número ingresado es incorrecto, por favor ingréselo nuevamente");
                    num = leer.nextInt(); 
                }
                matriz[i][j]=num;
            }
        }
        System.out.println("La matriz creada es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i ==0) {
                    suma1 = suma1 + matriz [i][j];
                }else if(i == 1){
                    suma2 = suma2 + matriz [i][j];
                }else{
                    suma3 = suma3 + matriz[i][j];
                }
            }
            
        }
        if (suma1 == suma2 && suma1 == suma3) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                if (j ==0) {
                    suma4 = suma4 + matriz [i][j];
                }else if(j == 1){
                    suma5 = suma5 + matriz [i][j];
                }else{
                    suma6 = suma6 + matriz[i][j];
                    }
                }
            
            }
        }
        if (suma1 == suma4 && suma1 == suma5 && suma1 == suma6) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        sumadiag = sumadiag + matriz[i][j];    
                    }
                }
            }
        }
        if (sumadiag == suma1 && sumadiag == suma2 && sumadiag == suma3) {
            
            System.out.println("La matriz ingresada es mágica!!!");
        }else{
            System.out.println("La matriz ingresada no es un cuadrado mágico");
        }
    }
}
