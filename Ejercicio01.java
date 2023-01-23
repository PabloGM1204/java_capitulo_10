import java.util.ArrayList;
public class Ejercicio01{
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<String>();

        n.add("Pablo");
        n.add("Pepe");
        n.add("Pedro");
        n.add("Chiquito");
        n.add("Jesus");
        n.add("Miguel");

        for (String a : n) {
            System.out.println(a);
        }
    }
}