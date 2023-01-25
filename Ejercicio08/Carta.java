package Ejercicio08;

public class Carta{
    //Atributos
    private String palo;
    private static String [] tip = {"Bastos", "Oros", "Copas", "Espadas"};
    private String num;
    private static String [] val = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Sota", "Caballo", "Rey"};

    //Constructor
    Carta(){
        this.palo = tip[(int)(Math.random()*4)];
        this.num = val[(int)(Math.random()*13)];
    }

    //Getter
    public String getPalo(){
        return this.palo;
    }

    public String getNum(){
        return this.num;
    }

    //Metodos
    public String toString(){
        return this.getNum()+" de "+this.getPalo();
    }

}