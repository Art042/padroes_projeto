package atividade_3.q_3;

import atividade_3.q_3.states.Processando;
import atividade_3.q_3.states.Status;

public class Processo {

    private Status status;

    public Processo() {
        this.status = new Processando(this);
    }

    public void changeStatus(Status status){
        this.status = status;
    }

    public String getStatus() {
        return this.status.getStatus();
    }

    public void deferido(int num){
        this.status.deferido(num);
    }

    public void acao(int num){
        this.status.acao(num);
    }

    public void indeferido(int num){
        this.status.indeferido(num);
    }
}
