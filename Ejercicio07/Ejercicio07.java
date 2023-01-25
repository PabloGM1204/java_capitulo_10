package Ejercicio07;
import java.util.ArrayList;

public class Ejercicio07{
    public static void main(String[] args) {
        ArrayList<Moneda> list = new ArrayList<Moneda>();
        
        Moneda nueva = new Moneda();
        list.add(nueva);

        String ultimaPos = nueva.getPosicion();
        String ultimoVal = nueva.getValor();
        
        for(int i = 0; i<5; i++){
            //Creo una moneda 
            do{
                nueva = new Moneda();
            }while((nueva.getPosicion() != ultimaPos) && (nueva.getValor() != ultimoVal));
            //La añado a la lista si cumple las condiciones
            list.add(nueva);
            //Actualizo los valores
            ultimaPos = nueva.getPosicion();
            ultimoVal = nueva.getValor();
        }

        //Muestro las monedas
        for (Moneda i : list) {
            System.out.println(i);
        }

        
    }
}