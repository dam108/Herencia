package Dam108t2e1;
import java.util.*;
public class dam108t2e112 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
      
        // creamos ArrayList de Asalariados
        ArrayList <Asalariado> arrAsal = new ArrayList<>();
        arrAsal.add(new Asalariado(01, "Juan", "1980/01/22", 650.25f));
        arrAsal.add(new Asalariado(02, "Jesus", "1981/02/07", 650.25f));
        arrAsal.add(new Asalariado(03, "Pedro", "1982/04/12", 650.25f));
        arrAsal.add(new Asalariado(04, "Daniel", "1983/06/15", 650.25f));
        arrAsal.add(new Asalariado(05, "Oscar", "1984/08/23", 650.25f));
        arrAsal.add(new Asalariado(06, "Andres", "1985/10/13", 650.25f));
        
        // creamos Arraylist de ConsultoresExternos
        ArrayList <ConsultorExterno> arrConsul = new ArrayList<>();
        arrConsul.add(new ConsultorExterno(101, "Silvia", "1986/03/21"));
        arrConsul.add(new ConsultorExterno(102, "Maria Asuncion", "1987/05/11"));
        arrConsul.add(new ConsultorExterno(103, "Lucia", "1988/12/01"));

        // mostramos el contenido de los arrayLists
        
        for (int i = 0; i < arrAsal.size(); i++) {
            System.out.println( arrAsal.get(i).toString() );
        }
        
        for (int i = 0; i < arrConsul.size(); i++) {
            System.out.println( arrConsul.get(i).toString() );
        }
        // modificamos las horas extras de los asalariados
        arrAsal.get(0).setHorasExtra(15);
        arrAsal.get(1).setHorasExtra(25);
        arrAsal.get(2).setHorasExtra(5);
        arrAsal.get(3).setHorasExtra(7);
        arrAsal.get(4).setHorasExtra(12);
        arrAsal.get(5).setHorasExtra(8);
        
        // modificamos las horas extras de los ConsultoresExtra
        arrConsul.get(0).setHorasTrabajadas(47);
        arrConsul.get(1).setHorasTrabajadas(30);
        arrConsul.get(2).setHorasTrabajadas(40);
        
        // fijamos el importe de la hora extra a 20 euros
        // modificamos las hora del consultor a 100 euros
        // modificamos el contenido del array de asalariados calculando el salario final 
        for (int i = 0; i < arrAsal.size(); i++) {
            arrAsal.get(i).calcularSalarioFinal(20);
        }
        // modificamos el contenido del array de consultores calculando el salario final 
        for (int i = 0; i < arrConsul.size(); i++) {
            arrConsul.get(i).calcularSalarioFinal(100);
        }

        // mostramos el contenido de los Arraylists con for each
        
        System.out.println("Mostramos la lista de salarios de los Asalariados");
        float totalAsalariados = 0;
        for (Asalariado x : arrAsal){
            System.out.println(x.toString());
            totalAsalariados += x.getSalarioFinal();
        }
        
        System.out.println("Mostramos la lista de salarios de los Consultores");
        float totalConsultores = 0;
        for (ConsultorExterno j : arrConsul){
            System.out.println(j.toString());
            totalConsultores += j.getSalarioFinal();
        }
        
        System.out.println("El total que se va gastar en sueldos es: "+ (totalConsultores + totalAsalariados));
    }
}
