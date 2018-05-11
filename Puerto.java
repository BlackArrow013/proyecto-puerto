
/**
 * La clase Puerto almacena los barcos que se encuentran en él.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class Puerto
{
    // Almacena los barcos en amarres.
    private Alquiler[] amarres;

    /**
     * Constructor de la clase Puerto.
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
        amarres[0] = null;
        amarres[1] = null;
        amarres[2] = null;
        amarres[3] = null;
    }

    /**
     * Muestra por patalla el estado de cada amarre.
     */
    public void verEstadoAmarre()
    {
        for (int i = 0; i < amarres.length; i++) {
            if(amarres[i] == null) {
                System.out.println("El amarre " + amarres[i] + " está vacío.");
            }
            else {
                System.out.println("El amarre " + amarres[i] + " tiene barcos.");
            }
        }
    }
    
    /**
     * Indica qué barco ha sido alquilado y cuánto tiempo. Devuelve también el coste del alquiler.
     * @param numDias - se introduce un entero que indica el número de días que se alquilará el barco.
     * @param barco - se introduce el barco que se va a alquilar.
     * @return precioAlquiler - devuelve el precio del alquiler.
     */
    public int alquilarAmarre(int numDias, Barco barco)
    {        
        int precioAlquiler = 0;
        return precioAlquiler;
    }
    
    /**
     * El barco alquilado se liquida, y se coge del amarre indicado por parámetro.
     * @param numAmarre - se indica el número del amarre desde donde se coge el barco.
     * @return - devuelve el precio del alquiler.
     */
    public int liquidarAlquilerAmarre(int numAmarre)
    {
        int precioAlquiler = 0;
        return precioAlquiler;
    }
    
    /**
     * Devuelve toda la información de la clase Puerto.
     * return - toda la información de la clase Puerto.
     */
    public String toString()
    {
        return " ";
    }
}
