package atividade_3.q_4.Factory;

public class LanchoneteCG implements Sanduiche {
	
    @Override
    public void adicionarIngredientes() {
        System.out.println("Saindo Sanduiche Especial CG");
        Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nP�o Integral");
        Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nQueijo Prato");
        Carregando.barra_carregando('*', 5, 900);
        System.out.println("\nPresunto de Frango");
        Carregando.barra_carregando('*', 5, 100);
        System.out.println("\nSandu�che Pronto");
                
    }
}
