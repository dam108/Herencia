package Dam108t2e1;
import java.util.*;
import java.time.LocalDate;
public final class CuentaPlazo extends CuentaCorriente {
    private LocalDate fecha;
    
    CuentaPlazo(String i){
        super(i);
        this.fecha = LocalDate.now();
    }
    
    @Override
    public boolean retirar(float importe){
        if (importe <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - importe);
            super.setcontadorIngresos(0);
            return true;
        }
        else return false;
    }
}
