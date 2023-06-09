package atividade_1.q_11;

import java.util.Scanner;

public class RealizadorDeInvestimentos {
    public static void main(String[] args) {
        Investimento investir = new Investimento();
        double valor;
        int escolha;

        System.out.println("1 - Perfil conservador\n2 - Perfil moderado\n3 - Perfil arrojado\nEscolha: ");
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();

        System.out.println("Valor investido: \n");
        valor = scanner.nextDouble();

        if(escolha==1){
        	investir.setStrategy(new Conservador());
        }else if(escolha==2){
        	investir.setStrategy(new Moderado());
        }else if(escolha==3){
        	investir.setStrategy(new Arrojado());
        }else{
            return;
        }

        double resultado = investir.executaStrategy(valor);
        System.out.printf("Lucro: R$ %.2f %n", resultado);
        Double saldo = resultado+valor;
        System.out.printf("Valor em conta: R$ %.2f %n", saldo);

    }
}
