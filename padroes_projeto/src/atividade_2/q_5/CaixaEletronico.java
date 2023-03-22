package atividade_2.q_5;

public class CaixaEletronico {

    private Contador chainStart;

    public CaixaEletronico() {
        this.chainStart = new Notas_100();
    }

    public String ContaTodasNotas(double value){
        return this.chainStart.Contar(value);
    }
}
