
/**
 * Write a description of class Yate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numeroCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int cv, int numeroCamarotes)
    {
        super(matricula, eslora, ano, propietario, cv);
        this.numeroCamarotes = numeroCamarotes;
    }
    
    public int getNumeroCamarotes(){
        return numeroCamarotes;
    }
    
    public int getCoeficienteBernua(){
        return getCv() + numeroCamarotes;
    }
    
    public String toString(){
        return super.toString() + numeroCamarotes;
    }
}
