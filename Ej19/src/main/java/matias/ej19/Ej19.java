/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej19;

/* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el orden de la matriz cuadrada");
        int N = leer.nextInt();
        int [][] matriz = new int [N][N];
        int [][] matriz2 = new int [N][N];
        int cont = 0;
        
        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j]=leer.nextInt();
            }  
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz2[i][j]=matriz[j][i]; //acá se podría poner matriz2 = -1*matriz 1 y funciona)//
                /*Después pones un boolean que chequee valor por valor y si es true sigue y 
                si es false en uno se sale y dice no es anti simétrica*/
            }
            
        }
        
        System.out.println("La matriz creada es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("Su matriz transpuesta es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == -matriz2[i][j]) {
                    cont = cont+1;

                }
                
            }
        }
        if (cont/N==N) {
            System.out.println("La matriz creada es anti simétrica");
        }else{
            System.out.println("La matriz no es anti simétrica");
            }
    }
}
