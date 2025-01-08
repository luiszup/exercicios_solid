package bonus;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularTaxa() {
        return saldo * 0.1;
    }
}
