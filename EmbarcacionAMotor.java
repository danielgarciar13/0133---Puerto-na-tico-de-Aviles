
/**
 * Write a description of class EmbarcacionAMotor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    private int cv;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int cv)
    {
        super(matricula, eslora, ano, propietario);
        this.cv = cv;
    }
    
    public int getCv(){
        return cv;
    }
    
    public int getCoeficienteBernua(){
        return cv;
    }
    
    public String toString(){
        return super.toString() + cv;
    }
}
