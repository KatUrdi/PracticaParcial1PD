package practica1patronesdiseno.factoryEjercicio3;

public class Client {
    public static void main(String[] args) {
        KitEscolar ke1= (KitEscolar) new KitEscolarCreator().armarKitConTalla("S");
        KitEscolar ke2= (KitEscolar) new KitEscolarCreator().armarKitConTalla("L");

        ke1.show();
        ke2.show();

        KitColegial kc1 = (KitColegial) new KitColegialCreator().armarKit();
        KitColegial kc2 = (KitColegial) new KitColegialCreator().armarKit();

        kc1.show();
        kc2.show();


    }
}
