package ocp;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {
    private Map<String, Operacao> operacoes = new HashMap<>();
    public void registrarOperacao(String nome, Operacao operacao) {
        operacoes.put(nome, operacao);
    }

    public int calcular (String operacao, int a, int b) {
        Operacao op = operacoes.get(operacao);
        if (op == null) {
            throw new IllegalArgumentException("Operação não suportada: " + operacao);
        }
        return op.calcular(a, b);
    }
}
