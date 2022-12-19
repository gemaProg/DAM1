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
public class TrianguloMarina extends Figura {

    protected double lado2;
    protected double lado3;

    public TrianguloMarina() {
        super(10);
        lado2 = 10;
        lado3 = 10;
    }

    public TrianguloMarina(double lado) {
        super(lado);
        lado2 = lado;
        lado3 = lado;
    }

    public TrianguloMarina(double lado2, double lado3, double dato) {
        super(dato);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double sm = perimetro() / 2;
        double area = (double) Math.sqrt(sm * Math.pow((sm - dato), 3));
        return area;
    }

    @Override
    public double perimetro() {
        return dato * 3;

    }
}
