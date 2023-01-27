package Ejercicio12;

public class Carta{
    
    //Atributos
    private String [] palo = {"Oro", "Bastos", "Copas", "Espadas"};
    private String p = "";
    private String [] val = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueva", "sota", "caballo", "rey"};
    private String valor;

    //Constructor
    Carta(){
        this.p = palo[(int)(Math.random()*4)];
        this.valor = val[(int)(Math.random()*12)];
    }

    //Getter
    public String getPalo(){
        return this.p;
    }

    public String getValor(){
        return this.valor;
    }

    //Métodos
    public String toString(){
        return this.p+" de "+this.valor;
    }
}