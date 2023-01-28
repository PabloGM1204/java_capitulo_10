import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> catalogo = new HashMap<String, Double>();
        catalogo.put("avena", 2.21);
        catalogo.put("garbanzos", 2.39);
        catalogo.put("tomate", 1.59);
        catalogo.put("jengibre", 3.13);
        catalogo.put("quinoa", 4.50);
        catalogo.put("guisantes", 1.60);

        String producto = "";
        boolean salir = false;
        int cant = 0;
        double total = 0;

        ArrayList<String> listaPro = new ArrayList<String>();
        ArrayList<Integer> cantPro = new ArrayList<Integer>();

         

        do {
            System.out.print("Producto: ");
            producto = sc.next();
            if(!producto.equals("fin")){
                System.out.print("Cantidad: ");
                cant = sc.nextInt();
                if(listaPro.contains(producto)){
                    int pos = listaPro.indexOf(producto);
                    cantPro.set(pos, cantPro.get(pos)+cant);
                }else{
                    listaPro.add(producto);
                    cantPro.add(cant);
                }
            }else{
                salir = true;
            }
        } while (!salir);
        System.out.println("Producto   Precio   Cantidad   Subtotal");
        System.out.println("---------------------------------------");
        for(int i = 0; i<listaPro.size(); i++){
            System.out.printf("%-6s %9.2f %8d %11.2f\n", listaPro.get(i), catalogo.get(listaPro.get(i)), cantPro.get(i), (catalogo.get(listaPro.get(i))*cantPro.get(i)));
            total += (catalogo.get(listaPro.get(i))*cantPro.get(i));
        }
        System.out.println("---------------------------------------");
        double descuento = total*0.10;
        System.out.printf("Descuento: %.2f\n",descuento);
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL: %.2f",(total-descuento));



        

    }    
}
