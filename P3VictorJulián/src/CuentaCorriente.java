
public class CuentaCorriente {

    private Titular titular;
    private String numeroDeCuenta;
    private double saldo;

    public CuentaCorriente(Titular titular, String numeroDeCuenta, double saldo) {
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numeroDeCuenta) {
       this(titular, numeroDeCuenta, 15.3);
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos

    public void ingresar(double cantidadDeIngreso) {
        this.saldo += cantidadDeIngreso;
    }

    public void reintegro(double cantidadRetirada) {
        saldo -= cantidadRetirada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("titular=").append(titular);
        sb.append(", numeroDeCuenta=").append(numeroDeCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    

    public static boolean iguales(CuentaCorriente cuenta1, CuentaCorriente cuenta2) {
        return cuenta1.getNumeroDeCuenta().compareTo(cuenta2.getNumeroDeCuenta()) == 0;
    }
    public boolean iguales(CuentaCorriente cuenta1) {
        return this.getNumeroDeCuenta().equals(cuenta1.getNumeroDeCuenta());
    }
    public int ordenar(CuentaCorriente otraCuenta) {
        return this.getNumeroDeCuenta().compareTo(otraCuenta.getNumeroDeCuenta());
    }
    public void compararCuentas(CuentaCorriente cuenta1) {
        if (this.saldo>cuenta1.saldo)
            System.out.println("La cuenta actual tiene mayor saldo que la introducida");
        else 
            System.out.println("La cuenta introducida tiene mayor saldo o igual que la actual");
    }
}
