package atividade_3.q_10.model.decorators;

import atividade_3.q_10.model.Pizza;

public class Tomate extends CondimentDecorator {
	
	public Tomate(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void serve() {
		pizza.serve();
		System.out.println("- Adicionando Tomate");
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + 0.1d;
	}

}
