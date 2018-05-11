
/**
 * Crea barcos veleros. Es una clase hija de la clase Barco.
 *
 * @author (Jorge Jaular y Héctor García)
 * @version (1.0)
 */
public class Velero extends Barco
{
    private int mastiles;
    /**
     * Constructor de la clase Velero.
     * @param matricula - se introduce la matrícula del barco.
     * @param eslora - se introduce la eslora del barco.
     * @param year - se introduce el año de fabricación del barco.
     * @param propietario - se introduce el propietario del barco.
     * @param mastiles - se introduce el número de mástiles del barco.
     */
    public Velero(String matricula, double eslora, int year, Persona propietario, int mastiles)
    {
        super(matricula, eslora, year, propietario);
        this.mastiles = mastiles;
    }

    /**
     * Calcula el coeficiente de Bernua de los barcos, en el caso de los veleros es el número de mástiles.
     * Este método sobreescribe a un método abstracto de la clase padre.
     * return mastiles - devuelve el número de mástiles guardados en el atributo.
     */
    @Override
    public int getCoeficienteBernua()
    {
        return mastiles;
    }
    
    /**
     * Devuelve toda la información de la clase Velero y la de su clase padre.
     * return - todos los atributos declarados e inicializados en su clase padre más los inicializados más arriba en esta
     * misma clase.
     */
    public String toString() {
        return super.toString() + "\nNúmero de mástiles: " + mastiles;
    }
}
