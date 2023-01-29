import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //HashMap(tipo anfibio, habitat)
        HashMap<String, String> habitat = new HashMap<String, String>();
        habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
        habitat.put("salamandra", "Ecosistemas humedos");
        habitat.put("sapo", "En cualquier sitio salvo del desierto y la Antartida");
        habitat.put("triton", "America y Africa");


        //HashMap(tipo anfibio, alimentacion)
        HashMap<String, String> alimentacion = new HashMap<String, String>();
        alimentacion.put("rana", "Larvas e insectos");
        alimentacion.put("salamandra", "Pequeños crustaceos e insectos");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
        alimentacion.put("triton", "Insectos");

        System.out.print("Introduzca el tipo de anfibio: ");
        String nombre = sc.next();
        System.out.println("Habitat: "+habitat.get(nombre)+".");
        System.out.println("Alimentaciónn: "+alimentacion.get(nombre)+".");


        

    }
}