package atividade_3.q_10.model.decorators;

import atividade_3.q_10.model.Pizza;

public class Bacon extends CondimentDecorator {
	
	public Bacon(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void serve() {
		pizza.serve();
		System.out.println("- Adicionando Bacon");
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + 0.8d;
	}

}
