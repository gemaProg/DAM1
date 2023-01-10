
public class Tester {

    public static void main(String[] args) {

        Centralita centralita1 = new Centralita();
        Llamada llamada1 = new LlamadaLocal();
        Llamada llamada2 = new LlamadaProv();
        centralita1.registrarLlamada(llamada1);
        centralita1.registrarLlamada(llamada2);
        System.out.println(centralita1);
    }

}
