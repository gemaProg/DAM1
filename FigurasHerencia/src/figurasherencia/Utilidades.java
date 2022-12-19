/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author gema
 */
public class Utilidades {
    public static boolean hayTriangulo(double lado, double lado2, double lado3){
        boolean respuesta = false;
        if (((lado+lado2)>lado3)&&((lado2+lado3)>lado)&&((lado3+lado)>lado2))
            respuesta = true;
        return respuesta;
    }
}
