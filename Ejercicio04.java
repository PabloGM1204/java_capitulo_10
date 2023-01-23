import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<String>(10);
        String n = "";

        for(int i = 0; i<10; i++){
            System.out.print("Dime el "+(i+1)+" número: ");
            n = sc.next();
            a.add(n);
        }

        System.out.println("El array sin ordenar:");
        for (String i : a) {
            System.out.println(i);
        }

        //Ordenar los números
        Collections.sort(a);

        //Muestra el array
        System.out.println("El array ordenado:");
        for (String i : a) {
            System.out.println(i);
        }
    }
}