package bonus;

public class Servico {
    private Notificacao notificacao;

    public Servico(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void realizarDeposito(Conta conta, double valor) {
        conta.depositar(valor);
        notificacao.enviar("Depósito de R$" + valor + " realizado. Saldo atual: " + conta.saldo);
    }

    public void realizarSaque(Conta conta, double valor) {
        conta.sacar(valor);
        notificacao.enviar("Saque de R$" + valor + "realizado. Saldo atual: " + conta.saldo);
    }
}
