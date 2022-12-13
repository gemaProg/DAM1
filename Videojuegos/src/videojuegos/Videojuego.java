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
    private boolean modoJuego; //online=true offline=false
    private String plataforma;

    public Videojuego() {
        nombre = Utilidades.nombres[(int) (Math.random() * Utilidades.nombres.length)];
        genero = "puzzle";
        edad = Utilidades.edades[(int) (Math.random() * Utilidades.edades.length)];
        //fechaLanzamiento= new Fecha(6,6,1984);
        fechaLanzamiento = new Fecha("6/6/2002");
        empresa = "SEGA";
        modoJuego = false; //no hace falta
        plataforma = "GameBoy";

    }

    public Videojuego(String nombre, String genero, int edad, Fecha fechaLanzamiento, String empresa, boolean modoJuego, String plataforma) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.fechaLanzamiento = fechaLanzamiento;
        this.empresa = empresa;
        this.modoJuego = modoJuego;
        this.plataforma = plataforma;
    }

    public Videojuego(String nombre, String genero, int edad, Fecha fechaLanzamiento, String empresa, String modoJuego, String plataforma) {
        this(nombre, genero, edad, fechaLanzamiento, empresa, modoJuego(modoJuego), plataforma);
    }

    //getter y setter        
    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public Fecha getFecha() {
        return fechaLanzamiento;
    }

    /*public void setFecha(Fecha nuevaFecha){
        fechaLanzamiento = nuevaFecha;
    }*/
    public void setFecha(Fecha fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean getModoJuego() {
        return modoJuego;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String modoJuego() {
        String modo = "offline";
        if (modoJuego) //modoJuego==true
        {
            modo = "online";
        }
        return modo;
    }

    public String modoJuego(boolean modoBoolean) {
        String modo = "offline";
        if (modoBoolean){ //modoJuego==true
            modo = "online";
        }
        return modo;

    }
    public static boolean modoJuego(String modo){
        boolean respuesta =false;
        if (modo.equalsIgnoreCase("online"))
            respuesta = true;
        return respuesta;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", fechaLanzamiento=" + fechaLanzamiento + ", empresa=" + empresa + ", modoJuego=" + modoJuego + ", plataforma=" + plataforma + '}';
    }

}
