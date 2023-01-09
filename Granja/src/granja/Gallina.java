/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author gema
 */
public class Gallina extends Animal {
    private int huevos; //a la semana

    public Gallina() {
        super();
        huevos = (int)(Math.random()*8);
    }
    public Gallina(int huevos) {
        super();
        this.huevos = huevos;
    }
    public Gallina(int huevos, int id, String nombre, Fecha fecha) {
        this(id, nombre, fecha);
        this.huevos = huevos;
    }
    public Gallina(int id, String nombre, Fecha fecha) {
        super(id, nombre, fecha);
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }
    
    
    
    @Override
    public boolean esRentable() {
        boolean renta = false;
        if (huevos>=5)
            renta =true;
        return renta;
    }

    @Override
    public String toString() {
        return super.toString() + " huevos: "+ huevos + '}';
    }
    
}
