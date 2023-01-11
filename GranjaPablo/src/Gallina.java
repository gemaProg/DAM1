
public class Gallina extends Animal {
    public int huevosGallina;

    public Gallina(){
        super();
        super.clasificacion = Utilidades.clasificacion[0];
        huevosGallina = (int)(Math.random()*8);
    }
    public Gallina(String id, String nombre, int fechaNac, String color, String clasificacion) {
        super(id, nombre, fechaNac, color, clasificacion);
    }
    public Gallina(String id, String nombre, int fechaNac, String color, String clasificacion, int huevosGallina) {
        super(id, nombre, fechaNac, color, clasificacion);
        this.huevosGallina = huevosGallina;

    }

    public int getHuevosGallina() {
        return huevosGallina;
    }

    public void setHuevosGallina(int huevosGallina) {
        this.huevosGallina = huevosGallina;
    }

    @Override
    public boolean esRentable() {
        return huevosGallina > 5;
    }
    @Override
    public String toString(){
        return super.toString()+ "Huevos: "+ huevosGallina;
    }
}
