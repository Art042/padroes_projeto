package atividade_3.q_3.states;

import atividade_3.q_3.Processo;

public class Processando extends Status{

    public Processando(Processo processo) {
        super(processo);
    }

    @Override
    public String getStatus() {
        return "Avaliando Processo . . .\nProcesso Aberto";
    }

    @Override
    public void acao(int num) {
        processo.changeStatus(new Processando(processo));
    }

    @Override
    public void indeferido(int num) {
    	processo.changeStatus(new Indeferido(processo));
    }

    @Override
    public void deferido(int num) {
    	processo.changeStatus(new Deferido(processo));
    }
}