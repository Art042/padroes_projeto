package atividade_3.q_3.states;

import atividade_3.q_3.Processo;

public class Deferido extends Status{

    public Deferido(Processo processo) {
        super(processo);
    }

    @Override
    public String getStatus() {
        return "O Processo foi Deferido\nProcesso Fechado";
    }

    @Override
    public void acao(int num) {
        String msg2 = "O Processo"+num+" j� foi Fechado";
        throw new IllegalStateException(msg2);
    }

    @Override
    public void indeferido(int num) {
        String msg2 = "O Processo"+num+" se Encontra Deferido\n Processo Fechado";
        throw new IllegalStateException(msg2);
    }

    @Override
    public void deferido(int num) {
        String msg2 = "O Processo"+num+" j� foi Fechado\n Processo Fechado";
        throw new IllegalStateException(msg2);
    }
}
