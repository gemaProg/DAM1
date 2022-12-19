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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /* Circulo c1 = new Circulo();
    Cuadrado c2 = new Cuadrado();
    Triangulo t = new Triangulo();*/
    Figura[] figuras = new Figura[100];
    /*figuras[0]=c1;
    figuras[1]=c2;
    figuras[2]=t;*/
        for (int i = 0; i < figuras.length; i++) {
            if (i%2==0 && i<figuras.length/2)
                figuras[i]= new Circulo(Math.random()*20);
            else
                if (i%2!=0)
                    figuras[i]= new Triangulo(Math.random()*20);
            else
                    figuras[i]= new Cuadrado();
        }
    
    for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
    }
    
    
    }
    
}
