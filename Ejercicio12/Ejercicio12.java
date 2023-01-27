package Ejercicio12;
import java.util.ArrayList;

public class Ejercicio12{
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<Carta>();

        int puntos = 0;
        for(int i = 0; i<5; i++){
            Carta c = new Carta();
            switch (c.getValor()) {
                case "as":
                    puntos += 11;
                    break;
                case "tres":
                    puntos += 10;
                    break;
                case "sota":
                    puntos += 2;
                    break;
                case "caballo":
                    puntos += 3;
                    break;ç
                case "rey":
                    puntos += 4;
                    break;
                default:
                    break;
            }
            System.out.println(c);
        }
        System.out.println("Tienes "+puntos+" puntos");
    }
    
}