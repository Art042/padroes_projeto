package atividade_1.q_10.resolucao;

import java.util.Scanner;

public class PagadorDeFuncionario {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Contexto context = new Contexto();
        int escolha;
        System.out.println("Voce Deseja?\n1 - Pagar Chefe\n2 - Pagar Funcionario\n3 - Pagar Estagiario\n");
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();

        if (escolha == 1){
            context.setStrategy(new PagaChefe());
        }else if(escolha == 2){
            context.setStrategy(new PagaFuncionario());
        }else if(escolha == 3){
            context.setStrategy(new PagaEstagiario());
        }else{
            return;
        }

        context.executaStrategy();
    }
}