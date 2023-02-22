package practica1patronesdiseno.singletonMultithreadAbstractFactoryEjercicio8;

public class CuentaPrincipal {
    private static CuentaPrincipal instance = null;
    private double cuenta=0;

    private CuentaPrincipal(){
        System.out.println("Se realizo el deposito a la cuenta principal");
        depositar();
    }

    

    public void depositar(){
        this.cuenta=this.cuenta+1000000;
    }

    public void hacerPrestamo(double monto){
        if(monto<=cuenta){
            cuenta=cuenta-monto;
            System.out.println("Se Realizo el prestamo de: "+monto);
        } else{
            System.out.println("la cuenta principal no cuenta con los fondos suficientes");
        }
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new CuentaPrincipal();
        }
    }

    public static CuentaPrincipal getInstance(){
        if(instance == null){
            multiThreadManage();
        }
        return instance;
    }



    public double getCuenta() {
        return cuenta;
    }



}
