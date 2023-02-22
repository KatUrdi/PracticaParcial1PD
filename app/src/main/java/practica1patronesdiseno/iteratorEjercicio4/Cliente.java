package practica1patronesdiseno.iteratorEjercicio4;

public class Cliente {
    public static void main(String[] args) {
        Materia mate = new Materia("Literatura");
    Materia leng = new Materia("Biologia");
    Materia hist = new Materia("Matematica");
    Materia eng = new Materia("Historia");

    Estudiante a = new Estudiante("MAuricio Leon", "4596");
    Estudiante b = new Estudiante("Flavia Mendoza", "7830");
    Estudiante c = new Estudiante("Maya rojas", "8941");
    Estudiante d = new Estudiante("Noelia Quiroga", "0256");
    Estudiante e = new Estudiante("Mateo Fernandez", "9998");

    lite.addEstudiante(a);
    bio.addEstudiante(b);
    mate.addEstudiante(c);
    his.addEstudiante(d);
    lite.addEstudiante(e);
    mate.addEstudiante(b);
    mate.addEstudiante(c);
    bio.addEstudiante(d);

    System.out.println("LISTAS");

    Iterator iterator;

    iterator=mate.createIterator();

    mate.show();
    while(iterator.hasNext()){
        Estudiante aux = iterator.next();
        aux.show();
    }

    iterator=leng.createIterator();

    leng.show();
    while(iterator.hasNext()){
        Estudiante aux =  iterator.next();
        aux.show();
    }

    iterator=hist.createIterator();

    hist.show();
    while(iterator.hasNext()){
        Estudiante aux =  iterator.next();
        aux.show();
    }

    iterator=eng.createIterator();

    eng.show();
    while(iterator.hasNext()){
        Estudiante aux = iterator.next();
        aux.show();
    }

    }
}
