
/**
 * Write a description of class Barco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barco
{
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.propietario = propietario;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getEslora(){
        return 0;
    }
    
    public int getAnoFabricacion(){
        return anoFabricacion;
    }
    
    public Persona getPropietario(){
        return propietario;
    }
    
    public int getCoeficienteBernua(){
        return 0;
    }
    
    public String toString(){
        return matricula + eslora + anoFabricacion + propietario;
    }
}
