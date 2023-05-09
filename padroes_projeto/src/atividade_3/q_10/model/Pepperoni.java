package atividade_3.q_10.model;

public class Pepperoni implements Pizza {

	@Override
	public void serve() {
		System.out.println("Pizza de Peperoni");
	}

	@Override
	public Double getPrice() {
		return +14.9d;
	}

	
}