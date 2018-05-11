
/**
 * Crea objetos de la clase Persona.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor de la clase Persona
     * @param nombre - El nombre de la persona.
     * @param dni - el carnet identificativo de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        
    }

    /**
     * Devuelve los datos de la persona.
     * @return - devuelve todos los datos de la persona (nombre y dni).
     */
    public String toString()
    {
        return "Nombre del Propietario: " + nombre + "\nDNI: " + dni;
    }
}
