import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaro el diccionario
        HashMap<String, String> datos = new HashMap<String, String>();

        int op;
        do {
            System.out.println("Elige una opcion: \n 1-Crear Usuario\n 2-Acceder a mi cuenta\n 3-Salir");
            op = sc.nextInt();
            String name = "";
            String pas = "";
            switch (op) {
                case 1:
                    //Creo el usuario
                    System.out.print("Dime el nombre del usuario: ");
                    name = sc.next();
                    System.out.print("Dime la contraseña: ");
                    pas = sc.next();
                    datos.put(name, pas);
                    break;
                case 2:
                    for(int i = 2; i>=0; i--){
                        //Accedo al usuario
                        System.out.print("Dime el nombre del usuario: ");
                        name = sc.next();
                        if(datos.containsKey(name)){
                            System.out.print("Dime la contraseña: ");
                            pas = sc.next();
                            if(datos.get(name).equals(pas)){
                                System.out.println("Ha accedido al area restringida");
                                i = -1;
                                op = 3;
                            }else{
                                System.out.println("Debe escribir bien la contraseña");
                                System.out.println("Te quedan "+i+" intentos");
                            }
                        }else{
                            System.out.println("Debe escribir bien el nombre de usuario");
                            System.out.println("Te quedan "+i+" intentos");
                        }
                    }
                    break;
                default:
                break;
            }
        } while (op != 3);
    }
}