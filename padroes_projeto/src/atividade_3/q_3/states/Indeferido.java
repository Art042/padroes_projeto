package atividade_3.q_3.states;

import atividade_3.q_3.Processo;

public class Indeferido extends Status{

    public Indeferido(Processo processo) {
        super(processo);
    }

    @Override
    public String getStatus() {
        return "O processo foi Indeferido.\nProcesso Fechado";
    }

    @Override
    public void acao(int num) {
        String msg1 = "O Processo "+num+"foi Fechado.";
        throw new IllegalStateException(msg1);
    }

    @Override
    public void indeferido(int num) {
        String msg1 = "O Processo"+num+" já está Indeferido\nFechado";
        throw new IllegalStateException(msg1);
    }

    @Override
    public void deferido(int num) {
        String msg1 = "O Processo"+num+"foi Indeferido\nProcesso Fechado";
        throw new IllegalStateException(msg1);
    }
}
