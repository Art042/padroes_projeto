package atividade_3.q_4.Factory;

public class LanchoneteRT implements Sanduiche {
    @Override
    public void adicionarIngredientes() {
    	System.out.println("Saindo Sanduiche Especial RT");
    	Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nPão Bola");
        Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nQueijo Cheddar");
        Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nPresunto de Peru");
        Carregando.barra_carregando('*', 5, 100);
        System.out.println("\nSanduíche Pronto");
    }
}
