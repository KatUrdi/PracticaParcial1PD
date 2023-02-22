package patronesdisenoprimerparcialpractica.ejercicio10IteratorSingleton;

public class Client {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("111A", "JFU87", "Suzuki", "Beige");
        Vehiculo v2 = new Vehiculo("111B", "LU896", "Tesla", "Rojo");
        Vehiculo v3 = new Vehiculo("111C", "AU18", "toyota", "Azul");
        Vehiculo v4 = new Vehiculo("111D", "UTU326", "audi", "Verde");
        Vehiculo v5 = new Vehiculo("111E", "IRYR9", "Mercedes Benz", "Plomo");
        Vehiculo v6 = new Vehiculo("111F", "KDJU93", "Ferrari", "negro");

        Cabina.getInstance().pagarPeaje(v1);
        Cabina.getInstance().pagarPeaje(v2);
        Cabina.getInstance().pagarPeaje(v3);
        Cabina.getInstance().pagarPeaje(v4);
        Cabina.getInstance().pagarPeaje(v5);
        Cabina.getInstance().pagarPeaje(v6);
    }
}
