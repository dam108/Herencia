package Dam108t2e1;
public class dam108t2e107 {
    public static void main(String[] args) {
        
        // creamos un triangulo v7 con el contructor de 3 paramentros
        System.out.println("Creamos un Triangulo");
        Triangulo_v7 tri1 = new Triangulo_v7(6, 8, "rectangulo");
        double area1 = tri1.area();
        System.out.printf("Su area es %.1f\n", area1);
        // creamos otro triangulo utilizando el contructor al que se le pasa un objeto
        System.out.println("Creamos una copia del triangulo");
        Triangulo_v7 tri2 = new Triangulo_v7(tri1);
        double area2 = tri2.area();
        System.out.printf("Su area es %.1f\n", area2);
    }
}
