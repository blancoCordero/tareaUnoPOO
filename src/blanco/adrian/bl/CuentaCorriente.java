package blanco.adrian.bl;

public class CuentaCorriente {

    //numero de cuenta debe ser maximo de 7 digitos
    private String numeroCuenta;

    private double saldo;

    public CuentaCorriente(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public void transaccionDeposito(double monto){
        saldo += monto;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
