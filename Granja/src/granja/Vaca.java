/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author gema
 */
public class Vaca extends Animal {
    private int litrosLeche; //a la semana

    public Vaca() {
        super();
        litrosLeche = (int)(Math.random()*210);
    }
    public Vaca(int litrosLeche) {
        super();
        this.litrosLeche = litrosLeche;
    }
    public Vaca(int litrosLeche, int id, String nombre, Fecha fecha) {
        this(id, nombre, fecha);
        this.litrosLeche = litrosLeche;
    }
    public Vaca(int id, String nombre, Fecha fecha) {
        super(id, nombre, fecha);
    }

    public int getHuevos() {
        return litrosLeche;
    }

    public void setHuevos(int litrosLeche) {
        this.litrosLeche = litrosLeche;
    }
    
    
    
    @Override
    public boolean esRentable() {
        boolean renta = false;
        if (litrosLeche>=50)
            renta =true;
        return renta;
    }

    @Override
    public String toString() {
        return super.toString() + litrosLeche + '}';
    }
    
}
