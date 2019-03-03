
/**
 * Write a description of class Transferencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transferencia extends Transaccion{
    private String nroCuenta;
    public Transferencia(double monto, String fecha, 
                         String nroCuenta){
        super(monto, fecha);
        this.nroCuenta = nroCuenta;
    }
}
