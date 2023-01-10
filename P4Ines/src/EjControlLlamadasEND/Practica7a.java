package EjControlLlamadasEND;

import java.util.Scanner;

/*Esto es la centralita*/
public class Practica7a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Centralita donde se registran las llamadas");
        LlamadasLocales llama1l = new LlamadasLocales(456656555, 445453453, 4567.24);
        System.out.println(llama1l);
        LlamadaProvincial llama1p = new LlamadaProvincial(4566767, 567876, 456.78,1);
        System.out.println(llama1p);
        Centralita centralita = new Centralita();
        centralita.registrarLlamada(llama1p);
        centralita.registrarLlamada(llama1l);
        System.out.println(centralita);
        
    }
}
