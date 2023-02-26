/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej21;
/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej21 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [][] matrizM = new int [10][10];
        int [][] matrizP = new int [3][3];
        int k = 0;
        boolean iguales = false;
        int fila=0;
        int col=0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM [i][j] = (int)(Math.random()*3);
            }   
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP [i][j] = (int)(Math.random()*3);
            }
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[k][k]) {
                    fila=i;
                    col=j;
                    k++;
                    iguales = true;
                }else if (j>8) {
                    fila++;
                    col=0;
                }
                else{
                    fila=i;
                    col=j;
                    k=0;
                   
                }
                
            }
            
        }
        
        
    }
}
