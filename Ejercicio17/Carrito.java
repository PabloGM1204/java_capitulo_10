package Ejercicio17;
import java.util.ArrayList;

public class Carrito{

    //Lista estatica a la que se le añadiran elementos
    private static ArrayList<Elemento> carro = new ArrayList<Elemento>();

    //Constructor
    Carrito(){

    }

    //Metodos
    public void agrega(Elemento e){
        carro.add(e);
    }

    public int numeroDeElementos(){
        return carro.size();
    }

    public double importeTotal(){
        double total = 0;
        for (Elemento e : carro) {
            total += e.getPrecio()*e.getCantidad();
        }
        return total;
    }

    public String toString(){
        String salida = "Contenido del carrito\n=====================\n";
        for (Elemento e : carro) {
            salida += e+"\n";
        }
        return salida;
    }
}