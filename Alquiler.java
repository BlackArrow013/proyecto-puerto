
/**
 * Indica las características del alquiler de un barco.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class Alquiler
{
    private final static int MULTIPLICADOR_ESLORA = 10;
    private final static int PRECIO_BASE = 300;
    private int numDias;
    private Barco barco;

    /**
     * Constructor de la clase Alquiler
     * @param numDias - se indica el número de días del alquiler.
     * @param barco - se indica el barco que se va a alquilar.
     */
    public Alquiler(int numDias, Barco barco)
    {
        this.numDias = numDias;
        this.barco = barco;
    }

    /**
     * Se calcula el precio del alquiler del barco.
     * @return - el precio del barco en función del coeficiente de Bernua, el número de días, la eslora y dos variables estáticas.
     */
    public double getPrecio()
    {
        return PRECIO_BASE * barco.getCoeficienteBernua() + numDias * barco.getEslora() * MULTIPLICADOR_ESLORA;
    }
    
    /**
     * Devuelve toda la información de la clase Alquiler.
     * return - todos los atributos declarados más arriba e inicializados en el constructor.
     */
    public String toString()
    {
        return "Numero de dias de alquiler: " + numDias + "\nBarco: " + barco;
    }
}
