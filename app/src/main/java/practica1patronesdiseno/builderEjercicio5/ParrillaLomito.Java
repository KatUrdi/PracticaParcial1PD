package practica1patronesdiseno.iteratorEjercicio4;

public class ParrillaLomito extends BuilderParrilla{
    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Arroz");
        
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Pepsi");
        
    }

    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("Lomo");
        
    }
}
