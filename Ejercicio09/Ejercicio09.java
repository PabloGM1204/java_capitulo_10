package Ejercicio09;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio09 {
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
        //Ordenar la baraja
        Collections.sort(baraja);
        //Mostrar la baraja
        for (Carta c : baraja) {
            System.out.println(c);
        }
    }
}
