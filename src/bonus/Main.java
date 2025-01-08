package bonus;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta;
        Notificacao notificacao;
        boolean menuAberto = true;

        System.out.println("Escolha o tipo de conta: ");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int contaTipo = input.nextInt();

        if (contaTipo == 1) {
            conta = new ContaCorrente(1000);
        } else if (contaTipo == 2) {
            conta = new ContaPoupanca(1000);
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Escolha por onde quer receber a notificação: ");
        System.out.println("1. E-mail");
        System.out.println("2. SMS");
        int notificacaoTipo = input.nextInt();

        if (notificacaoTipo == 1) {
            notificacao = new NotificacaoEmail();
        } else if (notificacaoTipo == 2) {
            notificacao = new NotificacaoSMS();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        Servico servico = new Servico(notificacao);

        do {
            System.out.println("\n Escolha uma operação: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Sair");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depósito: ");
                    double valorDeposito = input.nextInt();
                    servico.realizarDeposito(conta, valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para saque: ");
                    double valorSaque = input.nextInt();
                    servico.realizarSaque(conta, valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (menuAberto);

        input.close();
    }
}
