package atividade_3.q_10.model.decorators;

import atividade_3.q_10.model.Pizza;


public class BordaDeCatupiry extends CondimentDecorator {
	
	public BordaDeCatupiry(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void serve() {
		pizza.serve();
		System.out.println("- Adicionando Borda de Catupiry");
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice() + 1.2d;
	}

}