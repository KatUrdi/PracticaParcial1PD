package practica1patronesdiseno.factoryEjercicio3;

public class Cuaderno {
    private String tipo;
    private int numeroHojas;

    public Cuaderno(String tipo, int numeroHojas){
        this.tipo=tipo;
        this.numeroHojas=numeroHojas;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumeroHojas() {
        return numeroHojas;
    }
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void show(){
        System.out.println("Cuaderno: "+tipo+", "+numeroHojas+" hojas");
    }

    
}
