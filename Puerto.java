import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }

    public double alquilarAmarre(int numDias, Barco barco){
        double precio = -1;
        for(int c = 0; c < amarres.length; c++){
            if(amarres[c] == null){
                amarres[c] = new Alquiler(barco, numDias);
                precio = amarres[c].getPrecio();
            }
        }
        return precio;
    }

    public double liquidarAlquilerAmarre(int numAmarre){
        return 0;
    }

    public void verEstadoAmarres(){
        
    }

    public String toString(){
        return "";
    }
}
