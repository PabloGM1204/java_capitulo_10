package Repaso;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Universidad{
    //Atributos
    private static HashMap<String, Estudiante> estudiantes;

    //Constructor
    Universidad(){
        this.estudiantes = new HashMap<String, Estudiante>();
    }

    //Metodos
    public void inscribirEstudiante(Estudiante est){
        if(estudiantes.containsKey(est.getMatricula())){
            System.out.println("Este estudiante ya esta matriculado");
        }else{
            estudiantes.put(est.getMatricula(), est);
        }
    }

    public Estudiante buscarPorEstudiante(String m){
        if(estudiantes.containsKey(m)){
            return estudiantes.get(m);
        }else{
            return null;
        }
    }

    public void eliminarEstudiantePorMatricula(String m){
        if(estudiantes.containsKey(m)){
            estudiantes.remove(m);
        }else{
            System.out.println("Ese estudiante no existe");
        }
    }

    public ArrayList<Estudiante> listarEstudiantes(){
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        for (Map.Entry l : estudiantes.entrySet()) {
            lista.add((Estudiante)l.getValue());
        }
        return lista;
    }

    public ArrayList<Estudiante> listarEstudiantesPorEdad(int edad){
        ArrayList<Estudiante> filtrado = listarEstudiantes();
        filtrado.removeIf((estudiantes)->estudiantes.getEdad()!=edad);
        return filtrado;
    }  

    public void mostrarLista(){
        ArrayList<Estudiante> a = listarEstudiantes();
        for (Estudiante estudiante : a) {
            System.out.println(estudiante);
        }
    }
}