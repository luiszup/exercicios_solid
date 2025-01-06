package ocp;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.registrarOperacao("soma", new Soma());
        calculadora.registrarOperacao("subtracao", new Subtracao());
        calculadora.registrarOperacao("multiplicacao", new Multiplicacao());
        calculadora.registrarOperacao("divisao", new Divisao());

        System.out.println("Soma: " + calculadora.calcular("soma", 7, 2));
        System.out.println("Subtração: " + calculadora.calcular("subtracao", 7, 2));
        System.out.println("Multiplicação: " + calculadora.calcular("multiplicacao", 7, 2));
        System.out.println("Divisão: " + calculadora.calcular("divisao", 7, 2));
    }
}
