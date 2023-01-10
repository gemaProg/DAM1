

public class Practica6 {
    public static void main(String[] args) {

        Titular titular1 = new Titular("Victor", "Perez", 20);
        Titular titular2 = new Titular("Carlos", "Domingo", 30);
        CuentaCorriente cuenta1 = new CuentaCorriente(titular1, "987654", 250.45);
        CuentaAhorro cuenta2 = new CuentaAhorro(titular2, "12345678", 200, 5);

        System.out.println(cuenta1.getSaldo());
        cuenta1.ingresar(150.45);
        System.out.println(cuenta1.getSaldo());

        if (cuenta1.iguales(cuenta1, cuenta2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
    }
}
