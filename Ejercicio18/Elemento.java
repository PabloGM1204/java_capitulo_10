package Ejercicio18;

public class Elemento{
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    //Constructor
    Elemento(String n, double p, int c){
        this.nombre = n;
        this.precio = p;
        this.cantidad = c;
    }

    //Getter
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }

    //Setter
    public String setNombre(String n){
        return this.nombre = n;
    }

    public double setPrecio(double p){
        return this.precio = p;
    }
    
    public int setCantidad(int c){
        return this.cantidad = c;
    }

    //Metodos
    @Override
    public String toString(){
        return this.nombre+" PVP: "+this.precio+" Unidades: "+this.cantidad+" Subtotal: "+String.format("%.2f", this.precio * this.cantidad);
    }
}