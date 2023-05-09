package atividade_3.q_10.model.decorators;

import atividade_3.q_10.model.Pizza;

abstract class CondimentDecorator implements Pizza {

	protected Pizza pizza;


	public CondimentDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
}