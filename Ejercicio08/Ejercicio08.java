package Ejercicio08;
import java.util.ArrayList;

public class Ejercicio08 {
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<Carta>();

        Carta nueva = new Carta();
        baraja.add(nueva);
        //El bucle crea la carta y la comprueba si esta en el array
        for(int i = 0; i<10; i++){
            do {
                nueva = new Carta();
            } while(baraja.contains(nueva));
            baraja.add(nueva);
        }
        for (Carta c : baraja) {
            System.out.println(c);
        }
    }
}
