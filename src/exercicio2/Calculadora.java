package exercicio2;

public class Calculadora {
    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public int executarOperacao(int a, int b) {
        return operacao.executar(a, b);
    }

}
