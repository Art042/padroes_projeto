package atividade_3.q_3.states;

import atividade_3.q_3.Processo;

public abstract class Status {

    Processo processo;

    Status(Processo processo){
        this.processo = processo;
    }

    public abstract String getStatus();
    public abstract void acao(int num);
    public abstract void indeferido(int num);
    public abstract void deferido(int num);


}
