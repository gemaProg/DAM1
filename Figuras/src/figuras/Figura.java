package figuras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gema
 */
public abstract class Figura {
    protected double dato;
    
    public Figura (){
       this(25);
    }
    public Figura(double dato) {
        this.dato = dato;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }
    public abstract double area();
    public abstract double perimetro();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+'{' + "dato=" + dato + '}';
    }
 
   
}
