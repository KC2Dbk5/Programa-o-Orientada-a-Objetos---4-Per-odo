package banco;

public class ContaDebEspecial extends ContaEspecial {

    public ContaDebEspecial() {}

    public ContaDebEspecial(String numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public void debitar(double valor) {
        if ((saldo + limite) >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente para débito.");
        }
    }
}
