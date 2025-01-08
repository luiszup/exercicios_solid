package bonus;

public class ContaCorrente extends Conta{
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularTaxa() {
        return 5.0;
    }
}
