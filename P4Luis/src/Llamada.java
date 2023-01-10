

public abstract class Llamada {
    private int duracion;
    private int numOrigen;
    private int numDuracion;


    public int getDuracion() {
        return duracion;
    }

    public int getNumDuracion() {
        return numDuracion;
    }

    public int getNumOrigen() {
        return numOrigen;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNumOrigen(int numOrigen) {
        this.numOrigen = numOrigen;
    }

    public void setNumDuracion(int numDuracion) {
        this.numDuracion = numDuracion;
    }

    public Llamada(int duracion, int numOrigen, int numDuracion){
        this.duracion=duracion;
        this.numDuracion=numDuracion;
        this.numOrigen=numOrigen;
    }
    public Llamada(){
        numOrigen=(int)(Math.random()*1000000);
        numDuracion=(int)(Math.random()*1000000);
         duracion=(int)(Math.random()*100);
    }

    public abstract double coste();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("duracion=").append(duracion);
        sb.append(", numOrigen=").append(numOrigen);
        sb.append(", numDuracion=").append(numDuracion);
        sb.append('}');
        return sb.toString();
    }

}
