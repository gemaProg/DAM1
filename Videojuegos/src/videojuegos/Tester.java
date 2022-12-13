/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuegos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gema
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        /*Scanner scanner = new Scanner(System.in);
        String cadena = new String();
        Fecha fecha = new Fecha();
        System.out.println(fecha);
        Videojuego videojuego = new Videojuego();
        System.out.println(videojuego.getNombre());
        System.out.println("Introduce nombre nuevo del videojuego");
        String nombre = scanner.nextLine();
        videojuego.setNombre(nombre);
        System.out.println(videojuego);*/
        System.out.println("-----------------");
        Videojuego[] videojuegos = new Videojuego[2];
        for (int i = 0; i < videojuegos.length; i++) {
            videojuegos[i] = EntradaDatos.getVideojuego();
        }
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i]);
        }
    }

}
