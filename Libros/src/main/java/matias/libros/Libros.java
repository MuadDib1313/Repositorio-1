/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package matias.libros;

import entidades.Libro;
import servicios.ServicioLibro;

/**
 *
 * @author Matías Burán
 */
public class Libros {

    public static void main(String[] args) {

        ServicioLibro sl = new ServicioLibro();

        Libro l1 = sl.CrearLibro();

        System.out.println(l1.toString());
    }
}
