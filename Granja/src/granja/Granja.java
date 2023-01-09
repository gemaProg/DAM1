/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author gema
 */
public class Granja {
    private Animal animales [];

    public Granja(Animal[] animales) {
        this.animales = animales;
    }

    public Granja() {
        //animales = new Animal[5];
        this(5);
        animales[0]= new Gallina(10);
        for (int i = 1; i < animales.length; i++) {
            if (i%2==1)
                animales[i]= new Gallina();
            else
                animales[i]= new Vaca();
        }
    }
    
    public Granja(int cuantos) {
        animales = new Animal[cuantos];
    }
    
    public void listarAnimales(){
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
    
    }
    
}
