package Dam108t2e101;
public class dam108t2e106 {
    public static void main(String[] args) {
        
        // crea un trigandulo de color 
        System.out.println("Creamos un Triangulo con color");
        TrianColor_v6 trianColor1 = new TrianColor_v6(6, 8, "rectangulo", "rojo");
        // ver dimensiones del triangulo
        System.out.print("Las dimensiones del triangulo son: ");
        trianColor1.verDim();
        // calcula el area del triangulo
        double area = trianColor1.area();
        // imprimimos el area , el estilo y el color
        String estilo = trianColor1.getEstilo();
        String color  = trianColor1.getColor();
        System.out.printf("El area del triangulo es %.1f. Es un triangulo %s y es de color %s\n",area, estilo , color);
        
    }
    
}
