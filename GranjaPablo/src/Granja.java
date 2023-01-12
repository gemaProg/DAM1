
import java.util.Arrays;
import java.util.Scanner;

public class Granja {

    private Animal[] animales;

    public Granja(int aforo) {
        this.animales = new Animal[aforo];
        for (int i = 0; i < animales.length / 2; i++) {
            if (i % 2 == 0) {
                animales[i] = new Gallina();
            } else {
                animales[i] = new Oveja();
            }
        }
    }

    public void listarAnimales() {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                System.out.println(animales[i]);
            }

        }
    }

    public void listarAnimalesRentables() {
        int contadorOvejas = 0;
        int contadorGallinas = 0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null && animales[i] instanceof Gallina && animales[i].esRentable()) {
                contadorGallinas++;
            } else if (animales[i] != null && animales[i].esRentable()) {
                contadorOvejas++;
            }
        }
        System.out.println("Hay " + contadorOvejas + " ovejas rentables" + "y " + contadorGallinas + "gallinas rentables");
    }

    public boolean darAltaAnimalPro(Animal animal) {
        boolean auxiliar = false;
        for (int i = 0; i < animales.length && !auxiliar; i++) {
            if (animales[i] == null && animal.getClass().getSimpleName().equals("Oveja") && i % 2 != 0) {
                animales[i] = animal;
                auxiliar = true;
            } else if (animales[i] == null && animal instanceof Gallina && i % 2 == 0) {
                animales[i] = animal;
                auxiliar = true;
            }
        }
        return auxiliar;

    }

    public boolean darAltaAnimal(Animal animal) {
        boolean auxiliar = false;
        for (int i = 0; i < animales.length && !auxiliar; i++) {
            if (animales[i] == null) {
                animales[i] = animal;
                auxiliar = true;
            }
        }
        return auxiliar;

    }

    public boolean darAltaAnimal() {
        boolean auxiliar = false;
        for (int i = 0; i < animales.length && !auxiliar; i++) {
            if (animales[i] == null) {
                auxiliar = true;
                animales[i] = dameAnimal();
            }
        }
        return auxiliar;

    }

    public Animal dameAnimal() {
        Animal nuevo = null;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce año nacimiento");
        int anyo = lector.nextInt();
        lector.nextLine(); //quitar enter
        System.out.println("Introduce clasificacion");
        String clasificacion = lector.nextLine();
        System.out.println("Introduce color");
        String color = lector.nextLine();
        System.out.println("Introduce id");
        String id = lector.nextLine();
        System.out.println("Introduce 1. Gallina, 2. Oveja");
        int tipo = lector.nextInt();
        if (tipo == 1) {
            System.out.println("Introduce número huevos de media a la semana ");
            int huevos = lector.nextInt();
            nuevo = new Gallina(id, nombre, anyo, color, clasificacion, huevos);
        } else if (tipo == 2) {
            System.out.println("Introduce metros de lana ");
            double lana = lector.nextInt();
            nuevo = new Oveja(id, nombre, anyo, color, clasificacion, lana);
        }

        return nuevo;
    }

    public Granja() {
        this(6);
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public boolean darBajaAnimal(String id) {
        boolean eliminado = false;
        for (int i = 0; i < animales.length && !eliminado; i++) {
            if (animales[i].id.equalsIgnoreCase(id)) {
                animales[i] = null;
                eliminado = true;
            }
        }
        return eliminado;
    }

    public boolean modificarAnyo(String id, int anyo) {
        boolean modificado = false;
        for (int i = 0; i < animales.length && !modificado; i++) {
            if (animales[i].id.equalsIgnoreCase(id)) {
                animales[i].fechaNac = anyo;
                modificado = true;
            }
        }
        return modificado;

    }

    public int cuantosAnimales() {
        int contador = 0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public int cuantasTortillas() {
        return cuantasTortillas(5);
    }
    
    public int cuantasTortillas(int numero) {
        int cuantos = 0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null && animales[i].getClass().getSimpleName().equals("Gallina")) {
                Gallina aux = (Gallina) animales[i];
                cuantos = cuantos + aux.huevosGallina; //+=
                //cuantos += ((Gallina)animales[i]).huevosGallina;
            }
        }
        //5 el número de huevos por tortilla.
        return cuantos/numero;
    }

    @Override
    public String toString() {
        return "Granja{" + ", animales=" + Arrays.toString(animales) + "";
    }

}
