package Ejercicio23;

class Figura {
    //Atributos
    private String nombre;
    private int valor; 
    private int cantidad; 

    //Constructor
    public Figura(String nombre, int valor, int cantidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    //Metodos
    public boolean esCapturable() {
        return this.cantidad > 0;
    }
  
    public void captura() {
        this.cantidad--;
    }

    @Override
    public String toString() {
        return nombre + " (" + valor + (valor == 1 ? " peón)" : " peones)");
    }

    public int getValor() {
        return valor;
    }
}