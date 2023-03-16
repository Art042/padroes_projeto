package atividade_1.q_10.resolucao;

public class Contexto {

    private PagadorStrategy strategy;

    public void setStrategy(PagadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void executaStrategy(){
        strategy.pagar();
    }
}
