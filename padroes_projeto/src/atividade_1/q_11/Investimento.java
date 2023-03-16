package atividade_1.q_11;

public class Investimento {
    private RealizadorDeInvestimentos_Interface strategy;

    public void setStrategy(RealizadorDeInvestimentos_Interface strategy) {
        this.strategy = strategy;
    }

    public double executaStrategy(Double valor){
        return this.strategy.realizar_investimento(valor);
    }

}
