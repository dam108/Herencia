package Dam108t2e1;
import java.util.*;
public class dam108t2e111 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        // crear un arrayList con variaso objetos de tipo movilPlus
        ArrayList <movilPlus> arr = new ArrayList<>();
        
        arr.add(new movilPlus(601111111, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(602222222, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(603333333, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(604444444, 0.05f, 0.07f, 10f));
        /*arr.add(new movilPlus(605555555, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(606666666, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(607777777, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(608888888, 0.05f, 0.07f, 10f));
        arr.add(new movilPlus(609999999, 0.05f, 0.07f, 10f));*/
        
        // imprimimos el arreglo 
        System.out.println(arr.toString());
        // preguntamos por un numero a borrar
        System.out.println("Introduce el numero de telefono que quieres borrar");
        int n = teclado.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).numeroMovil == n){
                arr.remove(arr.get(i));
                System.out.println("borrado con exito");
            }
        }
        System.out.println(arr.toString());
    }
}
