package atividade_3.q_9;

public class Colchetes extends Decorator {
    public Colchetes(Numero numero) {
        super(numero);
    }

    public void imprimir() {
        System.out.print("[");
        numero.imprimir();
        System.out.print("]");
    }
}
