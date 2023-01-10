
import java.util.Arrays;

public class Centralita {

    private int numLlamada;
    private double coste;
    private Llamada informe[];
    public Centralita (){
        this(12);
    }
    public Centralita(int tamanyo) {
        informe = new Llamada[tamanyo];
        for (int i = 0; i < informe.length / 2; i++) {
            if (i % 2 == 0) {
                informe[i] = new LlamadaLocal();
            } else {
                informe[i] = new LlamadaProv();
            }
            numLlamada++;
            coste = coste + informe[i].coste(); //+=
        }
    }

    public void registrarLlamada(Llamada llamada) {
        numLlamada++;
        coste += llamada.coste();
        boolean registrado = false;
        for (int i = 0; i < informe.length && !registrado; i++) {
            if (informe[i] == null) {
                informe[i] = llamada;
                registrado= true;
             }
        }
        if (!registrado)
            System.out.println("Lo sentimos no hay hueco para registrar más llamadas");
     }
    
    public String miToString(){
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < informe.length; i++) {
            if (informe[i]!=null){
                sb.append(informe[i]);
                sb.append("\n");
            }
        }
        return sb.toString();
    
    }
    @Override
    public String toString() {
        return "LLamadas registradas " +this.numLlamada + "coste: " + this.coste + "\nLLamadas: \n" + miToString(); //Arrays.toString(informe)
    }
}
