package banco;

abstract public class Conta {

    protected String numero;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void creditar(double valor);

    abstract void debitar(double valor);
}