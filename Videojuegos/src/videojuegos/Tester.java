/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuegos;

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
   
    String cadena = new String();
    Fecha fecha = new Fecha();
    System.out.println(fecha);
    Videojuego videojuego = new Videojuego();
    System.out.println(videojuego);
    
    Videojuego [] videojuegos = new Videojuego[10];
        for (int i = 0; i < videojuegos.length; i++) {
            videojuegos[i] = new Videojuego();
        }
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i]);
        }
    }
    
    
}