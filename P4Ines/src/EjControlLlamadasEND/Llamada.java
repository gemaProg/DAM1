package EjControlLlamadasEND;

public abstract class Llamada {

    private int nument;
    private int numsal;
    private double duracion;

    public Llamada(int nument, int numsal, double duracion){
        this.nument = nument;
        this.numsal = numsal;
        this.duracion = duracion;

    }

    /*Los Getter*/

    public int getNument() {
        return nument;
    }

    public int getNumsal() {
        return numsal;
    }

    public double getDuracion() {
        return duracion;
    }

    /*Los Setter*/

    public void setNument(int nument) {
        this.nument = nument;
    }

    public void setNumsal(int numsal) {
        this.numsal = numsal;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public abstract double calcularCoste();
    /*Los Métodos*/

    //No hay métodos

    /*El  toString*/

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + "llamadaent=" + nument+
                    ", llamadasal=" + numsal +
                    ", duracion (en segundos)=" + duracion + ", coste=";
    }
}
