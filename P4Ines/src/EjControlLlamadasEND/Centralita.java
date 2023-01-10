/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjControlLlamadasEND;

/**
 *
 * @author gema
 */
public class Centralita {
    private int numLlamada;
    private double costeTotal;
    
    public void registrarLlamada(Llamada llamada){
        numLlamada++;
        costeTotal += llamada.calcularCoste();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Centralita{");
        sb.append("numLlamada=").append(numLlamada);
        sb.append(", costeTotal=").append(costeTotal);
        sb.append('}');
        return sb.toString();
    }
    
}
