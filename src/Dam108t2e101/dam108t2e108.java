package Dam108t2e101;
import java.util.*;
public class dam108t2e108 {
    public static void main(String[] args) {
        int contador = 0;
        // creamos el arrayList
        ArrayList <Rectangulo_v8> arreglo = new ArrayList<>();
        //creamos cuatro rectangulos de los cuales 2 son cuadrados
        arreglo.add(new Rectangulo_v8(6, 8, "rectangulo 1"));
        arreglo.add(new Rectangulo_v8(5, "rectangulo 2"));
        arreglo.add(new Rectangulo_v8(9, 13, "rectangulo 1"));
        arreglo.add(new Rectangulo_v8(7, "rectangulo 2"));
        
        for (int i = 0; i < arreglo.size(); i++) {
            if(arreglo.get(i).esCuadrado()) contador++;
        }
        
        System.out.printf("hay %d cuadrados dentro del arreglo.\n", contador);
    }
}
