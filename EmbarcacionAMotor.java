
/**
 * Crea barcos motorizados. Es una clase hija de la clase Barco.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor de la clase EmbarcacionAMotor.
     * @param matricula - se introduce la matrícula del barco.
     * @param eslora - se introduce la eslora del barco.
     * @param year - se introduce el año de fabricación del barco.
     * @param propietario - se introduce el propietario del barco.
     * @param potencia - se introduce el número de caballos que tiene el barco.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int year, Persona propietario, int potencia)
    {
        super(matricula, eslora, year, propietario);
        this.potencia = potencia;
    }

    /**
     * Calcula el coeficiente de Bernua de los barcos, en el caso de las embarcaciones motorizadas es la potencia del barco en caballos.
     * Este método sobreescribe a un método abstracto de la clase padre.
     * return potencia - devuelve la potencia en caballos de la embarcación.
     */
    @Override
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
    /**
     * Devuelve toda la información de la clase EmbarcacionAMotor y la de su clase padre.
     * return - todos los atributos declarados e inicializados en su clase padre más los inicializados más arriba en esta
     * misma clase.
     */
    public String toString() {
        return super.toString() + "\nPotencia: " + potencia + "CV";
    }
}
