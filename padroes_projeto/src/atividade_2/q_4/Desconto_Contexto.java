package atividade_2.q_4;

public class Desconto_Contexto {


    private Descontos descontos;

    public void setDesconto(Descontos descontos) {
        this.descontos = descontos;
    }

    public double executa(){
        return this.descontos.getDescontos();
    }

}
