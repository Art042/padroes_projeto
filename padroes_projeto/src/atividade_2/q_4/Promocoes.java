package atividade_2.q_4;

public class Promocoes implements Descontos{
	private double desconto;

    public Promocoes(double desconto){
        this.desconto = desconto;
    }

    public double getDescontos() {
        return this.desconto;
    }
}
