package practica1patronesdiseno.singletonIteratorEjercicio10;

import java.util.Stack;

public class Cabina implements IAggregate {
    private static Cabina instance = null;
    private final double peaje=5.50;
    private double caja=0;
    private Stack<Vehiculo> registrados;

    private Cabina(){
        registrados = new Stack<>();
    }

    public static Cabina getInstance(){
        if(instance == null){
            instance = new Cabina();
        }
        return instance;
    }

    public void pagarPeaje(Vehiculo vehiculo){
        if(registrados.contains(vehiculo)){
            System.out.println("El vehiculo ya realizo el pago de peaje");
        } else{
            caja=caja+peaje;
            registrados.add(vehiculo);
            if(registrados.size()==6){
                iterate();
            }
        }
    }

    public void iterate(){

        System.out.println("Cabina");
        System.out.println("Monto recaudado: "+caja+" BS");
        System.out.println("lista vehiculos");
        Iterator iterator = createIterator();
        while(iterator.hasNext()){
            Vehiculo aux = iterator.next();
            aux.show();
        }
    }

    @Override
    public Iterator createIterator() {
       return new CabinaIterator(registrados);
    }

    
}
