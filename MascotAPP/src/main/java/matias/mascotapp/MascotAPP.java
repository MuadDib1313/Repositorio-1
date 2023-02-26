/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package matias.mascotapp;

import java.util.Scanner;
import matias.mascotapp.entidades.Mascota;
import matias.mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Matías Burán
 */
public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1.toString());

    }
}
