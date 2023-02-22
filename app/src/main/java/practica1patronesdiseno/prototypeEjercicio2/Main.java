package practica1patronesdiseno.prototypeEjercicio2;

public class Main {
    public static void main(String[] args) {
        ContratoDocente d1 = new ContratoDocente("Mateo", "Mauricio");
        d1.setSueldo(5000.0).setCursoEducacionSuperior(true)
        .setCargaHoraria(80).setAccesoPlataforma(true)
        .setMarcadoBiometrico(false).setMarcadoHoraEntrada("08:00")
        .setMarcadoHoraSalida("18:00");

        ContratoDocente d2 = (ContratoDocente) d1.clone("MAuricio", "Leon");
        ContratoDocente d3 = (ContratoDocente) d1.clone("Flavia", "Mendoza");
        ContratoDocente d4 = (ContratoDocente) d1.clone("MAya", "Rojas");
        ContratoDocente d5 = (ContratoDocente) d1.clone("Noelia", "Quiroga");
        ContratoDocente d6 = (ContratoDocente) d1.clone("Mateo", "Fernandez");
        ContratoDocente d7 = (ContratoDocente) d1.clone("Alexia", "Mamani");
        ContratoDocente d8 = (ContratoDocente) d1.clone("Salma", "Espinoza");
        ContratoDocente d9 = (ContratoDocente) d1.clone("Oscar", "Sanchez");
        ContratoDocente d10 = (ContratoDocente) d1.clone("Claudia", "Arroyo");
        ContratoDocente d11 = (ContratoDocente) d1.clone("Bernardo", "ALtaras");
        ContratoDocente d12 = (ContratoDocente) d1.clone("Emanuel", "Salas");
        ContratoDocente d13 = (ContratoDocente) d1.clone("Mickaela", "PAccieri");
        ContratoDocente d14 = (ContratoDocente) d1.clone("Luciana", "Barrios");
        ContratoDocente d15 = (ContratoDocente) d1.clone("Daniel", "Vera");

        d1.show();
        d2.show();
        d3.show();
        d4.show();
        d5.show();
        d6.show();
        d7.show();
        d8.show();
        d9.show();
        d10.show();
        d11.show();
        d12.show();
        d13.show();
        d14.show();
        d15.show();
    }
}
