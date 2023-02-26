/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej11v02;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú. */

import java.util.*;

/**
 *
 * @author Matías Burán
 */
public class Ej11v02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion;
        int reinicio = 0;
        String salir;
        
        String menu = "MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elija opción:";
        
        do {
            
            do {
                
                System.out.println("Ingrese dos números enteros positivos");
                num1 = leer.nextInt();
                num2= leer.nextInt();
                if (num1 < 0 || num2 < 0) {
                    
                    System.out.println("alguno de los números ingresados es inválido, por favor intente de nuevo");
                }
            } while (num1 < 0 || num2 < 0);
            
            System.out.println(menu);
            opcion = leer.nextInt();
            
            if (opcion >=1 && opcion < 5) {
                
                switch (opcion) {
                    case 1:
                
                        int suma = num1 + num2;
                        System.out.println("La suma de los números ingresados es: " + suma);
                        System.out.println("");
                        break;
            
                     case 2:
                
                        int resta = num1 - num2;
                     System.out.println("La resta de los números ingresados es: " + resta);
                        System.out.println("");
                        break;
                        
                    case 3:
                
                        int mult = num1 * num2;
                        System.out.println("La multiplicación de los números ingresados es: " + mult);
                        System.out.println("");
                        break;
                
                    case 4:
                
                        int div = num1 / num2;
                        System.out.println("La división de los números ingresados es: " + div);
                        System.out.println("");
                        break;
                    
                    default:
                        System.out.println("La opción elegida es incorrecta");
                }
                
            } else if(opcion == 5){
                
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salir = leer.next();
                
                if (salir.equalsIgnoreCase("s")) {
                    
                    System.out.println("Hasta pronto!");
                    reinicio =1;
                    
                }
                
            }
            
        } while (reinicio == 0);
        
    
    }
}
