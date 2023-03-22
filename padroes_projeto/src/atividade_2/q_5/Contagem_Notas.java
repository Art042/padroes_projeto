package atividade_2.q_5;

import java.util.Scanner;

public class Contagem_Notas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor;
		System.out.printf("Informe um Valor:\n");
		valor = ler.nextDouble();
		
		CaixaEletronico caixaeletronico = new CaixaEletronico();
        System.out.println(caixaeletronico.ContaTodasNotas(valor));
		
	}

}
