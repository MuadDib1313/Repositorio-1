package matias.mascotapp.servicios;

import java.util.Scanner;
import matias.mascotapp.entidades.Mascota;

/**
 *
 * @author Matías Burán
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
    
}
