/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author gema
 */
public class Cuadrado extends Figura{
    public Cuadrado() {
        super(8);
    }
    public Cuadrado(double lado) {
        super(lado);
    }
    @Override
    public double perimetro(){
         return 4*dato;
    }
    @Override
    public double area() {
        return dato*dato;
    }
}
