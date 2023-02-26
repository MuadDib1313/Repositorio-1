/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej18;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa). */

/**
 *
 * @author Matías Burán
 */
public class Ej18 {

    public static void main(String[] args) {
        
        int [][] matriz = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);       
                // Otra opción es poner acá matrizB [j][i] = matrizA[i][j] y listo!!!!//
            }
        }
        
        System.out.println("La matriz creada es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("La matriz transpuesta es:");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
