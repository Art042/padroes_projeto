package atividade_3.q_9;

public class Chaves extends Decorator {
    public Chaves(Numero numero) {
        super(numero);
    }

    public void imprimir() {
        System.out.print("{");
        numero.imprimir();
        System.out.print("}");
    }
}
