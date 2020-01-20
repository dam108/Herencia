package Dam108t2e1;

public class movilPlus extends MovilPrepago {
    private float costeEstablecLlamada = 0f;
    
    movilPlus(long nM, float cML, float cMB, float s){
        super(nM, 0f, cML, cMB, s);
        
    }
    public void videollamada (int segs){
        super.navegar(segs * 2);
    }
}
