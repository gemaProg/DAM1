

public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(Titular titular, String numeroDeCuenta, double saldo, double interes) {
        super(titular, numeroDeCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(double interes, Titular titular, String numeroDeCuenta) {
      this(titular, numeroDeCuenta,15.3,interes);
    }

    public CuentaAhorro(Titular titular, String numeroDeCuenta) {
      this(titular, numeroDeCuenta, 15.3, 2.5);
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double getInteres() {
        return interes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("interes=").append(interes);
        sb.append('}');
        return sb.toString();
    }

   
    
}
