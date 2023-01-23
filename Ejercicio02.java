import java.util.ArrayList;

public class Ejercicio02{
    public static void main(String[] args) {
        
        int tamaño = (int)(Math.random()*(20-10+1)+10);
        System.out.println("El tamaño del array es: "+tamaño);
        ArrayList<Integer> n = new ArrayList<Integer>(tamaño);

        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Generar Array
        for(int i = 0; i<tamaño; i++){
            n.add((int)(Math.random()*99+1));
        }

        //Calculo de todos los valores
        for(Integer a: n){
            suma += a;
            if(min>a)
                min = a;
            if(max<a)
                max = a;
        }

        //Mostrar los resultados
        System.out.println("La suma total es: "+suma);
        System.out.println("La media total es: "+(suma/tamaño));
        System.out.println("El mínimo es: "+min);
        System.out.println("El máximo es: "+max);

    }
}