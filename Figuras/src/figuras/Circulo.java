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
public class Circulo extends Figura{
   
    public Circulo() {
        super(3);
    }
    public Circulo(double radio) {
        super(radio);
    }
   
    @Override
    public double area(){
        return Math.PI * Math.pow(dato,2);
    }
    @Override
    public double perimetro(){
        return 2*Math.PI*dato;
    }
}
