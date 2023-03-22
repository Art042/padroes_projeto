package atividade_2.q_6.chain;

import atividade_2.q_6.Conta;
import atividade_2.q_6.Requisicao;

public class Controller {
    private Formato_Chain startChain;

    public Controller() {
        this.startChain = new Formato_Json();
    }

    public String getFormatado(Requisicao requisicao, Conta conta){
        return startChain.getFormatado(requisicao, conta);

    }
}
