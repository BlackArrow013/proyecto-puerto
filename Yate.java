/**
 * Crea barcos motorizados con camarotes. Es una clase hija de la clase EmbarcacionAMotor.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class Yate extends EmbarcacionAMotor
{
    private int camarotes;
    /**
     * Constructor de la clase Yate.
     * @param matricula - se introduce la matrícula del barco.
     * @param eslora - se introduce la eslora del barco.
     * @param year - se introduce el año de fabricación del barco.
     * @param propietario - se introduce el propietario del barco.
     * @param potencia - se introduce el número de caballos que tiene el barco.
     * @param camarotes - se introduce el número de camarotes que tiene el barco.
     */
    public Yate(String matricula, double eslora, int year, Persona propietario, int potencia, int camarotes)
    {
        super(matricula, eslora, year, propietario, potencia);
        this.camarotes = camarotes;
    }

    /**
     * Calcula el coeficiente de Bernua de los barcos, en el caso de los yates es la potencia del barco en caballos más el número
     * de camarotes.
     * Este método sobreescribe a un método abstracto de la clase padre.
     * return - devuelve la potencia en caballos de la embarcación sumado al coeficiente de Bernua calculado en la clase Padre.
     */
    @Override
    public int getCoeficienteBernua()
    {        
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * Devuelve toda la información de la clase Yate y la de su clase padre.
     * return - todos los atributos declarados e inicializados en su clase padre más los inicializados más arriba en esta
     * misma clase.
     */
    public String toString() {
        return super.toString() + "\nNúmero de camarotes: " + camarotes;
    }
}
