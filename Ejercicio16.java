import java.util.Scanner;
import java.util.HashMap;


public class Ejercicio16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, String> atlas = new HashMap<String, String>();

        atlas.put("Francia", "Paris");
        atlas.put("Espanha", "Madrid");
        atlas.put("Portugal", "Lisboa");

        boolean salir = false;

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            String pais = sc.next();
            if(pais.equals("salir")){
                salir = true;
            }else if(atlas.containsKey(pais)){
                System.out.println("La capital de "+pais+" es "+atlas.get(pais));
            }else{
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+pais+"?: ");
                String capital = sc.next();
                atlas.put(pais, capital);
            }
        } while (!salir);
    }
}