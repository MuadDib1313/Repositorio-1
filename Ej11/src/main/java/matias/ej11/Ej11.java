/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matias.ej11;

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
public class Ej11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros positivos");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int opcion;
        
        do {
            
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción:");
        
        opcion = leer.nextInt();
            
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
            
            case 5:
                
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String conf = leer.next();
                
                if (conf.equalsIgnoreCase("s")) {
                    
                    System.out.println("Hasta pronto!");
                    
                }else{
                    
                    System.out.println("MENU");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.println("Elija opción:");
        
                    opcion = leer.nextInt();
                }
                break;            
        }
        
        } while (opcion < 6);
    }
    
}
