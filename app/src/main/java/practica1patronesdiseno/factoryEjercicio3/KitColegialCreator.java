package practica1patronesdiseno.factoryEjercicio3;


public class KitColegialCreator extends KitCreator{

    @Override
    public IKit armarKit() {
        KitColegial kit = new KitColegial();
        kit.setMochila(new Mochila(5, "Mediana"));
        kit.setLibro(new Libro("Baldor", "Matematica"))
        .setComputadora(new Computadora("MAC", "IOS 8));
        return kit;
    }
    
}
