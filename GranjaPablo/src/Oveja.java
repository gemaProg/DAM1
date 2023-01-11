
public class Oveja extends Animal {

    private double metrosLana;
    
    public Oveja(){
        super();
        super.clasificacion = Utilidades.clasificacion[1];
        metrosLana = (int)(Math.random()*4);
    }
    public Oveja(String id, String nombre, int fechaNac, String color, String clasificacion, double metrosLana) {
        super(id, nombre, fechaNac, color, clasificacion);
        this.metrosLana = metrosLana;
    }
    
    public double getMetrosLana() {
        return metrosLana;
    }

    public void setMetrosLana(double metrosLana) {
        this.metrosLana = metrosLana;
    }


    @Override
    public boolean esRentable() {
        return metrosLana > 2;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "Lana: "+ metrosLana;
    }
}
