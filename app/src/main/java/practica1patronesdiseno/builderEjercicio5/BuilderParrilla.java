package practica1patronesdiseno.iteratorEjercicio4;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getParrilla(){
        return parrilla;
    }

    public void prepararParrilla(){
        parrilla = new Parrilla();
    }

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
