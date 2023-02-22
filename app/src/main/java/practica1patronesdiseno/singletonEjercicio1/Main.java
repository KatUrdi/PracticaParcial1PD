package practica1patronesdiseno.singletonEjercicio1;

public class Main {
    public static void main(String[] args) {

        Ventanilla ventanilla = new Ventanilla("85947");

        Estudiante e1 = new Estudiante("Oscar Sanchez", "150");
        ventanilla.setEstudiante(e1);
        ventanilla.hacerPagoMatricula();

        Estudiante e2 = new Estudiante("Flavia Mendoza, "489");
        ventanilla.setEstudiante(e2);
        ventanilla.hacerPagoMatricula();

        Estudiante e3 = new Estudiante("Maya Rojas", "968");
        ventanilla.setEstudiante(e3);
        ventanilla.hacerPagoMatricula();

        Estudiante e4 = new Estudiante("Mauricio Leon", "022");
        ventanilla.setEstudiante(e4);
        ventanilla.hacerPagoMatricula();

        Estudiante e5 = new Estudiante("Mateo Fernandez", "369");
        ventanilla.setEstudiante(e5);
        ventanilla.hacerPagoMatricula();
        
        ventanilla.show();
        
    }
}
