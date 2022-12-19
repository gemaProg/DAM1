package figuras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gema
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // TODO code application logic here
        /* Circulo c1 = new Circulo();
    Cuadrado c2 = new Cuadrado();
    Triangulo t = new Triangulo();*/
        Figura[] figuras = new Figura[10];
        /*figuras[0]=c1;
    figuras[1]=c2;
    figuras[2]=t;*/
        for (int i = 0; i < figuras.length; i++) {
            if (i % 3 == 0) {
                double lado1;
                double lado2;
                double lado3;
                do {
                    lado1 = Math.random() * 20;
                    lado2 = Math.random() * 20;
                    lado3 = Math.random() * 20;
                } while (Utilidades.hayTriangulo(lado1, lado2, lado3) == false);
                figuras[i] = new TrianguloMarina(lado1, lado2, lado3);
            } else if (i % 2 == 0 && i < figuras.length / 2) {
                figuras[i] = EntradaDatos.dameFigura(3);
                /*System.out.println("Introduce dato");
                figuras[i] = new Circulo(lector.nextDouble());*/

            } else if (i % 2 != 0) {
                figuras[i] = new Triangulo(Math.random() * 20);
            } else {
                figuras[i] = new Cuadrado();
            }
        }

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("-------------------");
            System.out.println(figuras[i]+"\nArea: "+ figuras[i].area()+"\nPerimetro"+figuras[i].perimetro());
        }
        

    }

}
