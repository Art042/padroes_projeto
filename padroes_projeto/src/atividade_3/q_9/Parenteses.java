package atividade_3.q_9;

public class Parenteses extends Decorator {
    public Parenteses(Numero numero) {
        super(numero);
    }

    public void imprimir() {
        System.out.print("(");
        numero.imprimir();
        System.out.print(")");
    }
}