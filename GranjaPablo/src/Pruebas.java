

public class Pruebas {
    public static void main(String[] args) {
        Granja miGranja = new Granja(25);
        miGranja.listarAnimales();
        Animal auxiliar = miGranja.dameAnimal();
        if (auxiliar != null)
            miGranja.darAltaAnimal(auxiliar);
        miGranja.listarAnimales();
        miGranja.listarAnimalesRentables();
        System.out.println("Tortillas:"+ miGranja.cuantasTortillas());

    }
}
