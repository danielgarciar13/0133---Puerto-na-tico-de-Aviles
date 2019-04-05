
/**
 * Write a description of class Velero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;
    
    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int numeroMastiles)
    {
        super(matricula, eslora, ano, propietario);
        this.numeroMastiles = numeroMastiles;
    }
    
    public int getNumeroMastiles(){
        return numeroMastiles;
    }
    
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    public String toString(){
        return super.toString() + numeroMastiles;
    }
}
