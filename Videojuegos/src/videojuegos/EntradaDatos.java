/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gema
 */
public class EntradaDatos {
    public static Videojuego getVideojuego() throws IOException{
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce los datos del videojuego: nombre,genero,edad,fecha(dd/mm/aaaa),empresa,modoJuego,plataforma");
        String juego = bf.readLine();
        String trozos[]= juego.split(",");
        //public Videojuego(String nombre, String genero, int edad, Fecha fechaLanzamiento, String empresa, boolean modoJuego, String plataforma) {
        Videojuego aux = new Videojuego(trozos[0],trozos[1],Integer.parseInt(trozos[2]),new Fecha(trozos[3]),trozos[4],Videojuego.modoJuego(trozos[5]),trozos[6]);
        //Videojuego aux = new Videojuego(trozos[0],trozos[1],Integer.parseInt(trozos[2]),new Fecha(trozos[3]),trozos[4],trozos[5],trozos[6]);
        return aux;
    }
    
}
