/**
 * Clase que identifica una maquina de cajero automatico
 * 
 * @author MLBC
 * @version 28.02.2019
 */
public class ATM{
    private Boveda      boveda;
    private int         monto;
    private boolean     tarjeta;
    private Servidor    servidor;
    private Tarjeta     tarjetaActiva;
    
    public ATM(int capacidad, Servidor servidor){
        this.servidor = servidor;
        boveda = new Boveda(5);
        boveda.setCapacidad(capacidad);
        monto = 0;
        tarjeta = false;
        tarjetaActiva = null;
    }
    
    public boolean ingresarTarjeta(Tarjeta tarjeta){
        return false;
    }
    
    public boolean ingresarPIN(int pin){
        return false;
    }
    
    public int retirar(int monto){
        return 0;
    }
    
    public String imprimirComprobante(){
        return "";
    }
    
    public String consultarSaldo(){
        String reporte;
        reporte = "";
        if(tarjeta){
            reporte = servidor.consultarSaldo(tarjetaActiva);
        }
        return reporte;
    }
}
