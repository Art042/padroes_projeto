package atividade_3.q_4.Factory;

public class LanchoneteJP implements Sanduiche {
    @Override
    public void adicionarIngredientes() {
    	System.out.println("Saindo Sanduiche Especial JP");
    	Carregando.barra_carregando('*', 5, 1000);
        System.out.println("\nP�o Franc�s");
        Carregando.barra_carregando('*', 5, 1000);
        System.out.println("\nQueijo Mussarela");
        Carregando.barra_carregando('*', 5, 1000);
        System.out.println("\nPresunto de Frango");
        Carregando.barra_carregando('*', 5, 1000);
        System.out.println("\nSalada Completa");
        Carregando.barra_carregando('*', 5, 100);
        System.out.println("\nSandu�che Pronto");
    }
}