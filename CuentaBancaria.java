import java.util.ArrayList;
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria{
    private String                  nroCuenta;
    private double                  saldo;
    private int                     pin;
    private Tarjeta                 tarjeta;
    private ArrayList<Transaccion>  transacciones;
    private Moneda                  moneda;
    private Cliente                 titular;
   
    public CuentaBancaria(String nroCuenta,
                          Cliente titular,
                          Tarjeta tarjeta,
                          Moneda moneda,
                          int pin){
        this.nroCuenta = nroCuenta;
        this.titular   = titular;
        this.tarjeta   = tarjeta;
        this.pin       = pin;
        this.moneda    = moneda;
        saldo          = 0.0;
        transacciones  = new ArrayList<Transaccion>();
        
    }
    
    public boolean verificarTarjeta(Tarjeta tarjeta){
        return this.tarjeta.equals(tarjeta);
    }
    
    public double getSaldo(){
        return saldo;
    }
}
