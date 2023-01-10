package EjControlLlamadasEND;

public class LlamadaProvincial extends Llamada {

    private static final double costP1 = 0.20;
    private static final double costP2 = 0.25;
    private static final double costP3 = 0.30;
    private int franja = 0;

    public LlamadaProvincial(int nument, int numsal, double duracion, int franja) {
        super(nument, numsal, duracion);
        this.franja = franja;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    /*Los Métodos*/
    public double costeProvincial() {
        double coste = 0;
        if (franja == 1) {
            coste = (super.getDuracion() * costP1);
        } else {
            if (franja == 2) {
                coste = (super.getDuracion() * costP2);
            } else {
                coste = (super.getDuracion() * costP3);
            }
        }
        return coste;
    }

    /*El toString*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (franja == 1) {
            sb.append(costP1);
            sb.append('}');
        } else {
            if (franja == 2) {
                sb.append(costP2);
                sb.append('}');

            } else {
                sb.append(costP3);
                sb.append('}');
            }
        }
        return sb.toString();
    }

    @Override
    public double calcularCoste() {
        double coste;
        switch (franja) {
            case 1:
                coste = costP1 * getDuracion();
                break;
            case 2:
                coste = costP2 * getDuracion();
                break;
            default:
                coste = costP3 * getDuracion();
                break;
        }
        return coste;
    }
}
