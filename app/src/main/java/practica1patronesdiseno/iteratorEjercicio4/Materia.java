package practica1patronesdiseno.iteratorEjercicio4

import java.util.ArrayList;
import java.util.List;

public class Materia implements IAggregate {

    private String nombre;
    private List<Estudiante> estudiantes;

    public Materia(String nombre){
        this.nombre=nombre;
        this.estudiantes = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new IteratorMateria(this.estudiantes);
    }



    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }



    public Materia setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        return this;
    }

    public Materia addEstudiante(Estudiante estudiante){

        if(estudiantes.contains(estudiante)){
            System.out.println("El estudiante la fue inscrito");
        } else{
            System.out.println("Estudiante: "+estudiante.getNombre()+" con CI "+estudiante.getCi()+" Se inscribio a la materia "+this.nombre);
            estudiantes.add(estudiante);
        }

        return this;

    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void show(){
        System.out.println(nombre);
    }
    
}
