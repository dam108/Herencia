package Dam108t2e1;
import java.util.*;
public class dam108t2e110 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        // crear instancias de movilPrepago, movilPlus, movilTarifaPlana
        MovilPrepago mov1 = new MovilPrepago(601123123, 0.15f, 0.05f, 0.07f, 10f);
        movilPlus mov2 = new movilPlus(602223223, 0.05f, 0.07f, 10f);
        MovilTarifaPlana mov3 = new MovilTarifaPlana(603323323, 0.15f, 0.05f, 0.07f, 10f);
        // consultar el saldo con cada uno
        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
        System.out.println(mov3.toString());
        // llamar, navegar, videollamar
        System.out.println("efecturamos una llamada de 30 segundos");
        mov1.efectuarLlamada(30);
        mov2.efectuarLlamada(30);
        mov3.efectuarLlamada(30);
        // consultar el saldo con cada uno
        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
        System.out.println(mov3.toString());
        
        System.out.println("Navegamos 5 Megas");
        
        mov1.navegar(5);
        mov2.navegar(5);
        mov3.navegar(5);
        // consultar el saldo con cada uno
        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
        System.out.println(mov3.toString());
        
        System.out.println("Realizamos una videollamada de 10 segundos con el movilPlus");
        mov2.videollamada(20);
        
        // consultar el saldo con cada uno
        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
        System.out.println(mov3.toString());
        
    }
}
