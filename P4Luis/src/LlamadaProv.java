
public class LlamadaProv extends Llamada {

    private int franja; //0,1,2

    public LlamadaProv() {
        super();
        this.franja = (int) (Math.random() * 3);
    }

    public LlamadaProv(int franja, int duracion, int numOrigen, int numDuracion) {
        super(duracion, numOrigen, numDuracion);
        this.franja = franja;
    }

    @Override
    public double coste() {
        double coste = 0;
        if (franja == 1) {
            coste = 0.20 * getDuracion();

        } else if (franja == 2) {
            coste = 0.25 * getDuracion();

        } else if (franja == 3) {
            coste = 0.30 * getDuracion();

        }
        return coste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("franja=").append(franja);
        sb.append('}');
        return sb.toString();
    }

}
