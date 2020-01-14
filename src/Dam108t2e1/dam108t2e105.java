package Dam108t2e1;
public class dam108t2e105 {
    public static void main(String[] args) {
        // creamos un triangulo
        System.out.println("Creamos un Triangulo");
        Triangulo_v5 tri1 = new Triangulo_v5(6, 8, "rectangulo");
        // creamos un triangulo por defecto
        Triangulo_v5 tri2 = new Triangulo_v5();
        // creamos un triangulo con el alto y el ancho iguales
        Triangulo_v5 tri3 = new Triangulo_v5(6);
        
        // calculamos el area del triangulo con alto y ancho
        System.out.printf("El triangulo %s tiene un area de %.2f\n", tri1.getEstilo(), tri1.area());
        // calculamos el area del triangulo vacio
        System.out.printf("El triangulo %s tiene un area de %.2f\n", tri2.getEstilo(), tri2.area());
        // calculamos el area del triangulo con solo un lado
        System.out.printf("El triangulo %s tiene un area de %.2f\n", tri3.getEstilo(), tri3.area());
        
        
    }
    
}
