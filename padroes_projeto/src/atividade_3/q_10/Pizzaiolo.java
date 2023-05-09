package atividade_3.q_10;

import atividade_3.q_10.model.Pizza;
import atividade_3.q_10.model.Mozzarella;
import atividade_3.q_10.model.Pepperoni;
import atividade_3.q_10.model.decorators.*;

public class Pizzaiolo {
	
	public static void order(String name, Pizza pizza) {
		System.out.println("Preparando " + name);
		pizza.serve();
		System.out.println(pizza.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Pedido 1", new Mozzarella());
		order("Pedido 2", new Tomate(new Mozzarella()));
		order("Pedido 3", new BordaDeCatupiry(new Tomate(new Mozzarella())));
		order("Pedido 4", new Pepperoni());
		order("Pedido 5", new Bacon(new Oregano(new Pepperoni())));
		order("Pedido 6", new Tomate(new Bacon(new Oregano(new Pepperoni()))));
	}
}