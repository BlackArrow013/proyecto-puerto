
/**
 * Esta es una clase abstracta, por lo que tiene clases hijas. Esta clase representa un barco y sus características comunes.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public abstract class Barco
{
    private String matricula;
    private double eslora;
    private int year;
    private Persona propietario;
    /**
     * Constructor de la clase Barco
     * @param matricula - se introduce la matrícula del barco.
     * @param eslora - se introduce la eslora del barco.
     * @param year - se introduce el año de fabricación del barco.
     * @param propietario - se introduce el propietario del barco.
     */
    public Barco(String matricula, double eslora, int year, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.year = year;
        this.propietario = propietario;
    }

    /**
     * Devuelve el valor de la eslora.
     * return eslora - devuelve el atributo declarado arriba e inicializado en el constructor.
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Método abstracto que es sobreescrito por sus clases hijas. Devuelve un entero.
     * return - devuelve un entero en función del cálculo en sus clases hijas.
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * Devuelve toda la información de la clase Barco.
     * return - todos los atributos declarados e inicializados más arriba.
     */
    public String toString()
    {
        return "Matrícula: " + matricula + "\nEslora: " + eslora + "\nAño de fabricación: " + year + "\nPropietario: " + propietario;
    }
}
