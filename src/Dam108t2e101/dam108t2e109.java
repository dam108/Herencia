package Dam108t2e101;
import java.util.*;
public class dam108t2e109 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        boolean salir =false; char opcion;
        // creamos una cuenta Plazo     
        CuentaPlazo cuenta1 = new CuentaPlazo("ES 98 2038 5778 98 30007602");
        //creamos una cuenta activa
        CuentaPlazo cuentaActiva = cuenta1;
        
        do {
           System.out.println("\n\n----TITULO DEL MENU-----");
            System.out.println("a)Ingresar \nb)Retirar\nc)Consultar Saldo\nd)Salir");
           opcion = teclado.next().charAt(0); 
           switch (opcion) {
               case 'a': funcion1 (cuentaActiva);  break;
               case 'b': funcion2 (cuentaActiva);  break;
               case 'c': funcion3 (cuentaActiva);  break;
               case 'd': salir = true; break;
               default: System.out.println("Opción invalida"); 
           }
        } while (!salir);
    }
    static void funcion1 (CuentaPlazo cuenta) {
        float importe;
        float saldo;
        System.out.println("Introduce la candidad a ingresar");
        importe = teclado.nextFloat();
        cuenta.ingresar(importe);
        saldo = cuenta.getSaldo();
        System.out.printf("Se ha ingresado el importe %.2f en tu cuenta.\nTu saldo ahora es: %.2f",importe, saldo);
        
    }
    
    static void funcion2 (CuentaPlazo cuenta) {
        float importe;
        boolean retiro;
        float saldo;
        System.out.println("Introduce la cantidad a retirar");
        importe = teclado.nextFloat();
        retiro = cuenta.retirar(importe);
        saldo = cuenta.getSaldo();
        if (retiro) System.out.printf("Se han retirado %.2f de tu cuenta\nTu saldo es de : %.2f euros",importe, saldo);
        else {
            System.out.println("No se ha podido efecturar la retirada.");
            System.out.println("Tu saldo es de "+saldo);
        }
    }
    
    static void funcion3 (CuentaPlazo cuenta) {
        float saldo = cuenta.getSaldo();
        System.out.printf("Tu saldo es de %.2f euros. \n", saldo);
    }
}
