package practica1patronesdiseno.singletonMultithreadAbstractFactoryEjercicio8;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        String v="vivienda";
        String c="creditos";
        String n="negocios";
        String f="financiamiento";

        System.out.println("Saldo en cuenta principal: "+CuentaPrincipal.getInstance().getCuenta());

        Thread.sleep(300,0);

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroCreditos c1 = (CajeroCreditos) FactoryCajero.createCajero("Mauricio Leon", "598LP", f);
                c1.hacerPrestamo(300000);
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroVivienda v1 = (CajeroVivienda) FactoryCajero.createCajero("Maya Rojas", "12LP", n);
                v1.hacerPrestamo(500000);
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroNegocios n1 = (CajeroNegocios) FactoryCajero.createCajero("Flavia Mendoza", "22LP", v);
                n1.hacerPrestamo(500000);
            }
        });

        
        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroFinanciamiento f1 = (CajeroFinanciamiento) FactoryCajero.createCajero("Mateo Fernandez", "190LP", c);

                f1.hacerPrestamo(500000);
            }
        });
        
user1.start();
user2.start();
user3.start();
user4.start();

Thread.sleep(300,0);

System.out.println("Saldo en cuenta principal "+CuentaPrincipal.getInstance().getCuenta());
        
    }
}
