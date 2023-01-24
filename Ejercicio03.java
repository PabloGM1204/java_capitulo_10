import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<Integer>(10);
        int n = 0;
        
        for(int i = 0; i<10; i++){
            try {
                System.out.print("Dime el "+(i+1)+" número: ");
                n = sc.nextInt();
                a.add(n);
            } catch (Exception e) {
                System.out.println("Se ha producido un error");
                i--;
            }
        }

        System.out.println("El array sin ordenar:");
        for (Integer i : a) {
            System.out.println(i);
        }

        //Ordenar los números
        Collections.sort(a);

        //Muestra el array
        System.out.println("El array ordenado:");
        for (Integer i : a) {
            System.out.println(i);
        }
    }
}