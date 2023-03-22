package atividade_2.q_6.chain;

import atividade_2.q_6.Conta;
import atividade_2.q_6.Requisicao;

public abstract class Formato_Chain {
    public Formato_Chain nextFormato;

    public Formato_Chain(Formato_Chain nextFormato) {
        this.nextFormato = nextFormato;
    }

    public abstract boolean formatoCerto(Requisicao requisicao);

    public abstract String getFormatado(Requisicao requisicao, Conta conta);
}
