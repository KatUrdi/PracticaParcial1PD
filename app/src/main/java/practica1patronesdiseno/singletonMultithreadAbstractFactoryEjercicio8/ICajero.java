package practica1patronesdiseno.singletonMultithreadAbstractFactoryEjercicio8;

public interface ICajero {
    void hacerPrestamo(double monto);
    void setNombreCajero(String nombreCajero);
    String getNombreCajero();
    void setCiCajero(String ciCajero);
    String getCiCajero();
    void show();
}
