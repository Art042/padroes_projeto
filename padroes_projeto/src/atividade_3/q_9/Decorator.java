package atividade_3.q_9;

public abstract class Decorator implements Numero {
    protected Numero numero;

    public Decorator(Numero numero) {
        this.numero = numero;
    }
}