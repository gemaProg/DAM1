/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author gema
 */
public abstract class Animal {
    protected int id;
    protected String nombre;
    protected Fecha fecha;

    public Animal() {
        id = (int)(Math.random()*10);
        nombre = this.getClass().getSimpleName()+id;
        fecha = new Fecha();
        
    }

    public Animal(int id, String nombre, Fecha fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreString() {
        return nombre;
    }

    public void setNombreString(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    public abstract boolean esRentable();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

    
    
}
