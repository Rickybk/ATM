
/**
 * Write a description of class Tarjeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarjeta{
    private String nroTarjeta;
    
    public Tarjeta(String nroTarjeta){
        this.nroTarjeta = nroTarjeta;
    }
    
    public boolean equals(Tarjeta otra){
        return nroTarjeta.equals(otra.nroTarjeta);
    }
}
