package practica1patronesdiseno.factoryEjercicio3;

public class KitEscolarCreator extends KitCreator{

    @Override
    public IKit armarKit() {
        KitEscolar kit = new KitEscolar();
        kit.setMochila(new Mochila(6, "Grande"));
        kit.setCuaderno(new Cuaderno("Hojas Bond", 150))
        .setDeportivo(new Deportivo("M", "Rojo", 3));
        return kit;
    }

    public IKit armarKitConTalla(String talla){
        KitEscolar kit = (KitEscolar) armarKit();
        kit.getDeportivo().setTalla(talla);
        return kit;
    }
    
}
