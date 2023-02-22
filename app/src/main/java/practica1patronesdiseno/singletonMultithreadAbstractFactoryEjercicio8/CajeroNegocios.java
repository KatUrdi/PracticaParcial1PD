package practica1patronesdiseno.singletonMultithreadAbstractFactoryEjercicio8;

public class CajeroNegocios implements ICajero{

    private String nombreCajero;
    private String ciCajero;



    @Override
    public String getCiCajero() {
        return ciCajero;
    }

    @Override
    public void setCiCajero(String ciCajero) {
       this.ciCajero=ciCajero;
    }

    @Override
    public String getNombreCajero() {
        return nombreCajero;
    }

    @Override
    public void hacerPrestamo(double monto) {
        System.out.println("Prestamo negocios");
        CuentaPrincipal.getInstance().hacerPrestamo(monto);
        
    }

    @Override
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero=nombreCajero;
    }

    @Override
    public void show() {
        System.out.println("Prestamo negocios");
        System.out.println("a cargo de: "+nombreCajero+" ("+ciCajero+")");
    }
}
