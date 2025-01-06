package srp;

public class Financeiro {
    public static void main(String[] args) {
        RelatorioFinanceiro relatorioFinanceiro = new RelatorioFinanceiro();
        RelatorioEmail relatorioEmail = new RelatorioEmail();

        relatorioFinanceiro.gerarRelatorio();
        relatorioEmail.enviarPorEmail();
    }
}
