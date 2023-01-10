

public class LlamadaLocal extends Llamada{

    public LlamadaLocal(int duracion, int numOrigen, int numDuracion) {
        super(duracion, numOrigen, numDuracion);
    }

    public LlamadaLocal() {
        super();
    }

    @Override
    public double coste(){
        return 0.15*getDuracion();
    }

    @Override
    public String toString() {
        return super.toString() + coste();
    }
    
}
