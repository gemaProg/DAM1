package EjControlLlamadasEND;

public class LlamadasLocales extends Llamada {

    private double costeLocal = 0.15;

    public LlamadasLocales(int nument, int numsal, double duracion) {
        super(nument, numsal, duracion);

    }

    /*Los Getter*/
    public double getCosteLocal() {
        return costeLocal;
    }

    /*Los Setter*/
    public void setCosteLocal(double costeLocal) {
        this.costeLocal = costeLocal;
    }

    /*Los Métodos*/
    public double costeLlamadaLocal() {
        return (costeLocal * super.getDuracion());
    }

    /*El  toString*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(costeLocal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularCoste() {
        return costeLocal*super.getDuracion();
    }
}
