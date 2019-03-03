import java.util.ArrayList;
/**
 * Write a description of class Servidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servidor{
    private ArrayList<CuentaBancaria> cuentas;
    
    public Servidor(){
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    private CuentaBancaria buscar(Tarjeta tarjeta){
        CuentaBancaria cuenta;
        int i = 0;
        cuenta = null;
        while(cuenta == null && i < cuentas.size()){
            if(cuentas.get(i).verificarTarjeta(tarjeta)){
                cuenta = cuentas.get(i);
            }
            i++;
        }
        return cuenta;
    }
    
    public String consultarSaldo(Tarjeta tarjeta){
        String reporte;
        CuentaBancaria cuenta;
        cuenta = buscar(tarjeta);
        reporte = "" + cuenta.getSaldo();
        return reporte;
    }
}
