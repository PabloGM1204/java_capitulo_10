package Repaso;

public class Repaso{
    public static void main(String[] args) {
        Universidad complutense = new Universidad();

        Estudiante est1 = new Estudiante("Pepe", 10, "mat1");
        Estudiante est2 = new Estudiante("Pilo", 10, "mat2");
        Estudiante est3 = new Estudiante("Milo", 10, "mat3");


        complutense.inscribirEstudiante(est1);
        complutense.inscribirEstudiante(est2);
        complutense.mostrarLista();
        complutense.eliminarEstudiantePorMatricula("mat1");
        System.out.println("--------------------");
        complutense.mostrarLista();
        
    }
}