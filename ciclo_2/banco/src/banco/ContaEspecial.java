package banco;

abstract public class ContaEspecial extends Conta {

    protected double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void creditar(double valor) {
        saldo += valor;
    }
}