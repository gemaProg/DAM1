/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

/**
 *
 * @author gema
 */

public class Videojuego {
    private String nombre;
    private String genero;
    private int edad;
    private Fecha fechaLanzamiento;
    private String empresa;
    private boolean modoJuego; //online offline
    private String plataforma;
    
   
            
    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
    public Fecha getFecha(){
        return fechaLanzamiento;
    }
    public boolean getModoJuego(){
        return modoJuego;
    }
    public String getEmpresa(){
        return empresa;
    }
    public String getPlataforma(){
        return plataforma;
    }
    
}
