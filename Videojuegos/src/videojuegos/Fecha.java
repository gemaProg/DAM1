/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

/**
 *
 * @author gema
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;
    
    public Fecha(){
        dia = (int)(Math.random()*30+1);
        mes = 4;
        anyo = 2000;
    }
    public Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    
    public Fecha(String fecha){
        String [] trozos = fecha.split("/");
        dia = Integer.parseInt(trozos[0]);
        mes = Integer.parseInt(trozos[1]);
        anyo = Integer.parseInt(trozos[2]);
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anyo;
        //return (new StringBuilder(dia).append("/").append(mes).append("/").append(anyo)).toString();
    }

    
   /* @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + '}';
    }*/
    
    
}
