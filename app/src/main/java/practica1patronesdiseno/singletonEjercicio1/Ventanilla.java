package practica1patronesdiseno.singletonEjercicio1;

public class Ventanilla {
    private Estudiante estudiante;
    private double matricula;
    private String codigoCajero;

    public String getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public Ventanilla(String codigoCajero){
        this.codigoCajero=codigoCajero;
        Cajero.getInstance().setCodigo(codigoCajero);
        Cajero.getInstance().show();
        matricula=2580;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public void hacerPagoMatricula(){
        if(!estudiante.pagoMatricula()){
            Cajero.getInstance().pagoACaja(matricula);
            System.out.println("Estudiante: "+estudiante.getNombre()
            +" "+estudiante.getCodigo()+" Realizo el pago correspondiente de la matricula");
            estudiante.setMatricula(true);
        } else{
            System.out.println("Estudiante: "+estudiante.getNombre()
            +" "+estudiante.getCodigo()+" Ya hizo el pago correspondiente de matricula");
        }

    }

    public void show(){
        Cajero.getInstance().show();
    }
}
