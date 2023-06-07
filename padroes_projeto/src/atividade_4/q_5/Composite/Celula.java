package atividade_4.q_5.Composite;

public class Celula {
    private String valor;

    public Celula(String valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.print(" | " + valor);
    }
}