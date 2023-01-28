import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Ejercicio19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        boolean salir = false;

        do {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            String palabra = sc.next();
            if(palabra.equals("salir")){
                salir = true;
            }else if(diccionario.containsKey(palabra)){
                System.out.print("Sínonimos de "+palabra+":");
                String significado = diccionario.get(palabra);
                ArrayList<String> sinonimos = new ArrayList<String>();

                for(Map.Entry entrada : diccionario.entrySet()){
                    if(!entrada.getKey().equals(palabra) && entrada.getValue().equals(significado)){
                        sinonimos.add((String) entrada.getKey());
                    }
                }

                muestraLista(sinonimos);
                
            }else{
                System.out.println("No conozco esa palabra");
            }
        } while (!salir);
    }

    public static boolean tieneSinonimos(String p, HashMap<String, String> d){
        String clave = d.get(p);

        int cont = 0;

        for(Map.Entry entrada : d.entrySet()){
            if(entrada.getValue().equals(clave)){
                cont++;
            }
        }
        
        return cont>1;
    } 

    public static void muestraLista(ArrayList<String> lista){
        for(int i = 0; i<lista.size(); i++){
            System.out.print(lista.get(i));
            if(i<lista.size()){
                System.out.print(", ");
            }
        }
    }
}