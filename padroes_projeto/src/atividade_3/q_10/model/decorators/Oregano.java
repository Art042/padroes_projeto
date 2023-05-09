package atividade_3.q_10.model.decorators;

import atividade_3.q_10.model.Pizza;

public class Oregano extends CondimentDecorator {
	
	public Oregano(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void serve() {
		pizza.serve();
		System.out.println("- Adicionando Oregano");
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + 0.5d;
	}

}