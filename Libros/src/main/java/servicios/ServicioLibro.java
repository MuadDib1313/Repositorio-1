package servicios;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Matías Burán
 */
public class ServicioLibro {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro CrearLibro() {

        System.out.println("Ingrese ISBN");
        int ISBN = leer.nextInt();

        System.out.println("Ingrese titulo");
        String titulo = leer.next();

        System.out.println("Ingrese autor");
        String autor = leer.next();

        System.out.println("Ingrese hojas");
        int paginas = leer.nextInt();

        return new Libro(ISBN, titulo, autor, paginas);
    }

}
