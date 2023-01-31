package Repaso;

public class Estudiante{
    //Atributos
    private String nombre;
    private int edad;
    private String matricula;

    //Constructor
    Estudiante(String n, int e, String m){
        this.nombre = n;
        this.edad = e;
        this.matricula = m;
    }

    //Getter
    public String getMatricula(){
        return this.matricula;
    }

    public int getEdad(){
        return this.edad;
    }

    //Metodos
    @Override
    public String toString(){
        return String.format("El alumno %s con %d años y matricula: %s",nombre, edad, matricula);
    }
}