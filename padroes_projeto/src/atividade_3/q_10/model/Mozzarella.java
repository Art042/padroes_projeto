package atividade_3.q_10.model;

public class Mozzarella implements Pizza {

	@Override
	public void serve() {
		System.out.println("Pizza de Mussarela");
	}

	@Override
	public Double getPrice() {
		return + 11.9d;
	}

}