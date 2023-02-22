package practica1patronesdiseno.iteratorEjercicio4;

public class ParrillaBife extends BuilderParrilla {

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Arroz con queso");
        
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Fanta guarana");
        
    }

    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("T-bone");
        
    }
    
}
