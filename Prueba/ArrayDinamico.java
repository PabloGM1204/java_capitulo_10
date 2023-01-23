package Prueba;
public class ArrayDinamico <T> implements interfaceEjemplo{
    
    //Atributos
    private T value;
    private T[] a;

    //Constructor
    ArrayDinamico(){
        this.value = null;
    }

    ArrayDinamico(T v){
        this.value = v;
    }

    //Getter


    //Setter


    //Metodos
    @Override
    public int lenght(){
        return this.a.length;
    }

    @Override
    public void set(T v, int pos){
        this.
    }
}