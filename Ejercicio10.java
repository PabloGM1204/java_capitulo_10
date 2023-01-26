import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.HashMap;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creación del diccionario
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("ordenador", "computer");
        diccionario.put("gato", "cat");
        diccionario.put("rojo", "red");
        diccionario.put("árbol", "tree");
        diccionario.put("pingüino", "penguin");
        diccionario.put("sol", "sun");
        diccionario.put("agua", "water");
        diccionario.put("viento", "wind");
        diccionario.put("siesta", "siesta");
        diccionario.put("arriba", "up");
        diccionario.put("ratón", "mouse");
        diccionario.put("estadio", "arena");
        diccionario.put("calumnia", "aspersion");
        diccionario.put("aguacate", "avocado");
        diccionario.put("cuerpo", "body");
        diccionario.put("concurso", "contest");
        diccionario.put("cena", "dinner");
        diccionario.put("salida", "exit");
        diccionario.put("lenteja", "lentil");
        diccionario.put("cacerola", "pan");
        diccionario.put("pastel", "pie");
        diccionario.put("membrillo", "quince");

        System.out.print("Dime una palabra que quieres saber el ingles: ");
        String word = sc.next();
        if(diccionario.containsKey(word)){
            System.out.println(word+" traducida en ingles es "+diccionario.get(word));
        }else{
            System.out.println("Esa palabra no esta en el diccionario");
        }
        
    }
    
}
