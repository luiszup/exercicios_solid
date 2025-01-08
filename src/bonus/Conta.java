package bonus;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract double calcularTaxa();

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + calcularTaxa();
    }

    public double getSaldo() {
        return saldo;
    }
}
