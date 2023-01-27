import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Ejercicio11 {
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

        //Paso el diccionario a un array de Strings con el comando keyset pasa da un set y con e to array lo pasa al array.
        String[] lista = diccionario.keySet().toArray(new String[0]);
        
        //Arraylist donde guardo el valor del número de la palabra a mostrar
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add((int)(Math.random()*22));
        int numAle;
        
        //Para que la palabra a traducir no se repita
        for(int i = 1; i<=4; i++){
            do{
                numAle = (int)(Math.random()*22);
            }while(nums.contains(numAle));
            nums.add(numAle);
        }
        
        int correctas = 0;
        for(int i = 0; i<5; i++){
            System.out.print("La palabra "+lista[nums.get(i)]+" en ingles es: ");
            String palabra = sc.next();
            if(palabra.equals(diccionario.get(lista[nums.get(i)]))){
                System.out.println("Correcto");
                correctas++;
            }else{
                System.out.println("Error");
            }
        }
        System.out.println("Has acertado "+correctas+" de 5");
    }

}

lunns nightbeat;
