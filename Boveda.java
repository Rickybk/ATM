
/**
 * Write a description of class Boveda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boveda{
    private Billete[]   billetes;
    private int         limite; // capacidad de la ranura fisica
                                // de salida de billetes
    
    public Boveda(int cantidadCortes){
        billetes = new Billete[cantidadCortes];
        limite = 0;
    }              
    public void setCapacidad(int capacidad){
        limite = capacidad;
    }
}
