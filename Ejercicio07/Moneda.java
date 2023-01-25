package Ejercicio07;

public class Moneda{

    //Atributos
    private static String [] value  = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private static String [] positions  = {"cara", "cruz"};
    private String valor;
    private String posicion;

    //Constructor
    Moneda(){
        this.valor = value[(int)(Math.random()*8)];
        this.posicion = positions[(int)(Math.random()*2)];
    }

    //Getter
    public String getValor(){
        return this.valor;
    }

    public String getPosicion(){
        return this.posicion;
    }

    public String toString(){
        return this.getValor()+" - "+this.getPosicion();
    }
    
}