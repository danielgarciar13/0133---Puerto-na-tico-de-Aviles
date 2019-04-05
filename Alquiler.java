import java.util.ArrayList;

/**
 * Write a description of class Alquiler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Barco barco;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(Barco barco, int numeroDias)
    {
        this.barco = barco;
        this.numeroDias = numeroDias;
    }
    
    public int getNumeroDias(){
        return numeroDias;
    }
    
    public Barco getBarco(){
        return barco;
    }
    
    public double getPrecio(){
        double precio = 0;
        precio = numeroDias * (barco.getEslora()*10) + (300*barco.getCoeficienteBernua());
        return precio;
    }
    
    public String toString(){
        return numeroDias + barco.toString();
    }
}
