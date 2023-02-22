package practica1patronesdiseno.factoryEjercicio3;

public class Libro {
    
    private String autor;
    private String tipo;
    
    public Libro(String autor, String tipo) {
        this.autor = autor;
        this.tipo = tipo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void show(){
        System.out.println("Libro: "+tipo+" escrito por: "+autor);
    }

    
    
}
